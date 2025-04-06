/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quadrado;

import javax.swing.JOptionPane;

/**
 *
 * @author jaimedias
 */
public class Quadrado {
    
    private Double lado;
    private Double area;
    private Double perimetro;
    
    public void calculaArea(){
        area = lado * lado;
    }
    
    public void calculaPerimetro(){
        perimetro = 4 * lado;
    }
    
    public void imprimir(){
        JOptionPane.showMessageDialog(null, 
                "Lado: "+lado+" , Area: "+area+ " , Perimetro: "+perimetro);
    }

    public Quadrado(Double lado) {
        this.lado = lado;
    }
    
}
