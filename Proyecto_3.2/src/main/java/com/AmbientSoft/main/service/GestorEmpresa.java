package com.AmbientSoft.main.service;


import com.AmbientSoft.main.model.Empresa;
import com.AmbientSoft.main.repositorio.EmpresaRepositorio;
import com.AmbientSoft.main.repositorio.MovimientoDineroRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class GestorEmpresa {

    @Autowired
    EmpresaRepositorio empresaRepositorio;
    MovimientoDineroRepositorio gestorMovimientoRepositorio;

    public List<Empresa> consultaListaEmpresa(){
        return empresaRepositorio.findAll();
    }

    public List<Empresa> crearEmpresa(Empresa empresa){
        empresa.setCreatedAt(LocalDateTime.now());
        empresaRepositorio.save(empresa);
        return empresaRepositorio.findAll();

    }
    public Empresa consultaUnaEmpresa(Long nit){
        return empresaRepositorio.findById(nit).get();
    }

    public Empresa actualizarNombreEmpresa(Long nit, Empresa empresa){

        Empresa empresas = empresaRepositorio.findById(nit).get();
        empresas.setNombreEmpresa(empresa.getNombreEmpresa());
        empresas.setUpdatedAt(LocalDateTime.now());
        empresaRepositorio.save(empresas);
        return empresas;
    }
    int cont_EN=0;
    int cont_ET=0;
    int cont_ED=0;
    int cont_END=0;
    public Empresa actualizarEmpresa(Long nit, Empresa empresa){
        Empresa empresas = empresaRepositorio.findById(nit).get();
        if (cont_EN==0 || empresa.getNombreEmpresa()!=null){
            empresas.setNombreEmpresa(empresa.getNombreEmpresa());
         //   System.out.println("acceder"+cont);
            if (empresa.getNombreEmpresa()!=null){
                cont_EN=1;
         /*   System.out.println("accedio"+cont);*/}
        }

        if (cont_ET==0 || empresa.getTelefono()>0){
            if (empresa.getTelefono()>0){
                cont_ET=1;
            }

            if (cont_ET==0){
            empresas.setTelefono(empresa.getTelefono());}
            if (cont_ET==1 && String.valueOf(empresa.getTelefono()).length()==10){
                empresas.setTelefono(empresa.getTelefono());}

        }

        if (cont_ED==0 || empresa.getDireccion()!=null){
            empresas.setDireccion(empresa.getDireccion());
            if (empresa.getDireccion()!=null){
                cont_ED=1;
            }
        }

        if (cont_END==0 || empresa.getDocumentoEmpresa()!=null){
            empresas.setDocumentoEmpresa(empresa.getDocumentoEmpresa());
            if (empresa.getDocumentoEmpresa()!=null){
                cont_END=1;
            }
        }


        empresas.setUpdatedAt(LocalDateTime.now());
        empresaRepositorio.save(empresas);
        return empresas;
    }


    public List<Empresa> eliminarEmpresa(Long nit){
        empresaRepositorio.deleteById(nit);
        return empresaRepositorio.findAll();
    }

}
