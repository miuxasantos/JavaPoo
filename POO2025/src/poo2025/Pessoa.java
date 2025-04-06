/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo2025;

import java.util.Objects;
import javax.swing.JOptionPane;

/**
 *
 * @author jaimedias
 */
//Classe
public class Pessoa implements Comparable<Pessoa>{
    
    //Atributos
    private String nome;
    private String cpf;
    private String telefone;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    //Metodos
    public void ola(){
        JOptionPane.showMessageDialog(null, "Olá, eu sou "+nome);
    }
    
    public void informarTelefone(){
        JOptionPane.showMessageDialog(null, "Meu telefone é "+telefone);
    }

    public Pessoa(String nome, String cpf, String telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return cpf;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pessoa other = (Pessoa) obj;
        return Objects.equals(this.telefone, other.telefone);
    }

    @Override
    public int compareTo(Pessoa o) {
        return this.cpf.compareTo(o.getCpf());
    }
    
    
  
}
