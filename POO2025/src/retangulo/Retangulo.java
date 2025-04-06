/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package retangulo;

import javax.swing.JOptionPane;

/**
 *
 * @author jaimedias
 */
public class Retangulo {
    
    Double comprimento;
    Double largura;
    Double area;
    Double perimetro;

    public Retangulo(Double comprimento, Double largura) {
        this.comprimento = comprimento;
        this.largura = largura;
    }
    
    public void calcularArea(){
        area = largura * comprimento;
    }
    
    public void calcularPerimetro(){
        perimetro = (2*largura)+(2*comprimento);
    }
    
    public void imprimir(){
        JOptionPane.showMessageDialog(null, 
                "Largura: "+largura+ "\nComprimento: "+comprimento
        +"\nArea: "+area+ "\nPerimetro: "+perimetro);
    }
    
}
