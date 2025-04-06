/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package circulo;

import javax.swing.JOptionPane;

/**
 *
 * @author jaimedias
 */
public class Circulo {

    Double raio;
    Double area;
    Double perimetro;
    Double pi = 3.141516;

    public Circulo(Double raio) {
        this.raio = raio;
    }
    
    public void calcularArea() {
        area = pi * raio * raio;
    }

    public void calcularPerimetro() {
        perimetro = 2 * pi * raio;
    }

    public void imprimir() {
        JOptionPane.showMessageDialog(null,
                "Raio: " + raio
                + "\nArea: " + area + "\nPerimetro: " + perimetro);
    }

}
