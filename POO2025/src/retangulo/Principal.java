/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package retangulo;

import quadrado.*;

/**
 *
 * @author jaimedias
 */
public class Principal {
    
    public static void main(String[] args) {
        Retangulo r = new Retangulo(10d, 20d);
        r.calcularArea();
        r.calcularPerimetro();
        r.imprimir();        
    }
    
}
