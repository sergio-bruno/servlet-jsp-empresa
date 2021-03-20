package br.com.slbruno.exemplo.service;

import java.util.ArrayList;
import java.util.List;

import br.com.slbruno.exemplo.model.Empresa;

public class Banco { 

    private static List<Empresa> lista = new ArrayList<>();

    /*
     * Para testar
     */
    /*
    static {
        Empresa empresa = new Empresa();
        empresa.setNome("Alura");
        Empresa empresa2 = new Empresa();
        empresa2.setNome("Caelum");
        Empresa empresa3 = new Empresa();
        empresa3.setNome("Hoplon");
        lista.add(empresa);
        lista.add(empresa2);
        lista.add(empresa3);
    } 
    */   
        
    public void adiciona(Empresa empresa) { 
        lista.add(empresa);
    }
    
    public List<Empresa> getEmpresas(){ 
        return Banco.lista;
    }

}
