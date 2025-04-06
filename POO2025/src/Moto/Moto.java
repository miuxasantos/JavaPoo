/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Moto;

import javax.swing.JOptionPane;

/**
 *
 * @author jaimedias
 */
public class Moto {

    String marca;
    String modelo;
    String cor;
    Integer marcha;
    Integer menorMarcha;
    Integer maiorMarcha;
    Boolean ligada;

    public Moto(String marca, String modelo, String cor, Integer marcha, Integer menorMarcha, Integer maiorMarcha) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.marcha = marcha;
        this.menorMarcha = menorMarcha;
        this.maiorMarcha = maiorMarcha;
        this.ligada = false;
    }

    public void imprimir() {
        JOptionPane.showMessageDialog(null,
                "Marca: " + marca + "\nModelo: " + modelo
                + "\nCor: " + cor + "\nMarcha: " + marcha + "\nLigada: "+ligada);
    }

    public void marchaAcima() {
        if (marcha.equals(maiorMarcha)) {
            JOptionPane.showMessageDialog(null, "A moto já esta na maior marcha: " + marcha);
        } else {
            marcha++;
        }

    }

    public void marchaAbaixo() {
        if (marcha.equals(menorMarcha)) {
            JOptionPane.showMessageDialog(null, "A moto já esta na menor marcha: " + marcha);
        } else {
            marcha--;
        }
    }

    public void ligarMoto() {
        if (ligada.equals(true)) {
            JOptionPane.showMessageDialog(null, "A moto já esta ligada!");
        } else {
            ligada = true;
        }
    }
    
    public void desligarMoto() {
        if (ligada.equals(false)) {
            JOptionPane.showMessageDialog(null, "A moto já esta desligada!");
        } else {
            ligada = false;
        }
    }

}
