/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heranca;

/**
 *
 * @author jaimedias
 */
public class PessoaFisica extends Pessoa{
    
    private String cpf;
    private String rg;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    @Override
    public String toString() {
        return super.toString() + "PessoaFisica{" + "cpf=" + cpf + ", rg=" + rg + '}';
    }

    @Override
    public String getDocumento() {
        return getCpf();
    }
    
    
    
}
