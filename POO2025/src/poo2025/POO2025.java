/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo2025;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author jaimedias
 */
public class POO2025 {

    public static void main(String[] args) {

        Pessoa p1 = new Pessoa("Jaime Dias", "323.123.123-44", "(44)9999-8888");
//        p1.ola();
//        p1.informarTelefone();
//        System.out.println(p1);
        
        Pessoa p2 = new Pessoa("Maria da Silva", "223.123.123-44", "(44)9999-8888");
//        p2.ola();
//        p2.informarTelefone();
//        System.out.println(p2);
//        
        Pessoa p3 = new Pessoa("Ana", "123.123.123-44", "(44)4444-1111");
//        p3.ola();
//        p3.informarTelefone();
//        System.out.println(p3);
//        System.out.println(p1.equals(p2));

        List<Pessoa> listaPessoas = new ArrayList<>();
        listaPessoas.add(p1);
        listaPessoas.add(p2);
        listaPessoas.add(p3);
        
        System.out.println(listaPessoas);
        
        Collections.sort(listaPessoas);

        System.out.println(listaPessoas);
    }

}
