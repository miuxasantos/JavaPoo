/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heranca;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jaimedias
 */
public class Principal {

    public static void main(String[] args) {
        
        PessoaFisica pf = new PessoaFisica();
        pf.setNome("Jaime Dias");
        pf.setEndereco("Av. Brasil");
        pf.setIdade(28);
        pf.setTelefone("44 99921-4994");
        pf.setCpf("111.222.333-44");
        pf.setRg("3.123.123-01");
        
        
        PessoaJuridica pj = new PessoaJuridica();
        pj.setNome("Unipar");
        pj.setEndereco("Av. da unipar");
        pj.setIdade(30);
        pj.setTelefone("44 99921-0000");
        pj.setCnpj("111.222.0001/01");
        pj.setIe("12345");
        
        List<Pessoa> listaPessoas = new ArrayList<>();
        listaPessoas.add(pf);
        listaPessoas.add(pj);
        
        for(Pessoa p : listaPessoas){
            System.out.println("Nome: "+p.getNome() + ", Documento: "+p.getDocumento());
        }
        
        
        
        
        
    }

}
