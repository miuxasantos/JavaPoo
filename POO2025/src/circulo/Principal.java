/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package circulo;

import quadrado.*;

/**
 *
 * @author jaimedias
 */
public class Principal {
    
    public static void main(String[] args) {
        Circulo c = new Circulo(10d);
        c.calcularArea();
        c.calcularPerimetro();
        c.imprimir();
    }
    
}
