/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aluno;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author jaimedias
 */
public class Principal {

    public static void main(String[] args) {
        Double numeroAlunos = Double.parseDouble(
                JOptionPane.showInputDialog("Quantos alunos tem a turma?"));
        List<Aluno> listaAlunos = new ArrayList<>();
        Double mediaTurma = 0d;
        for (int i = 1; i <= numeroAlunos; i++) {
            Aluno alu = new Aluno();
            alu.setNome(JOptionPane.showInputDialog("Digite o nome do " + i + "º aluno:"));
            alu.setNota1(Double.parseDouble(
                    JOptionPane.showInputDialog("Digite a nota 1 do " + i + "º aluno:")));
            alu.setNota2(Double.parseDouble(
                    JOptionPane.showInputDialog("Digite a nota 2 do " + i + "º aluno:")));

            mediaTurma = mediaTurma + alu.getMedia();
            listaAlunos.add(alu);
        }
        Collections.sort(listaAlunos);
        JOptionPane.showMessageDialog(null, listaAlunos);
        mediaTurma = mediaTurma / numeroAlunos;
        JOptionPane.showMessageDialog(null, "A média da turma é: " + mediaTurma);
    }
}
