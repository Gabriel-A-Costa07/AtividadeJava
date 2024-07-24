
package p_atividade.P_GabrielAlves;

import javax.swing.JOptionPane;

public class Exer2V2 {
    public static void main(String[] args) {
        double qtdht, slrh, slrb, inss, ir, slrl;
        int numd;
       //Entrada
        qtdht=Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade de horas trabalhadas: ", "Cálculo do Salário - José Pedro", JOptionPane.QUESTION_MESSAGE));
        slrh=Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o salário-hora: ", "Cálculo do Salário - José Pedro", JOptionPane.QUESTION_MESSAGE));
        numd=Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o número de dependentes: ", "Cálculo do Salário - José Pedro", JOptionPane.QUESTION_MESSAGE));
        
        C2V2 objC2V2 = new C2V2();
        objC2V2.calcSalBruto(qtdht, slrh, numd);
        objC2V2.mostraSalBruto();
        objC2V2.calcDescInss();
        objC2V2.calcDescIR();
        JOptionPane.showMessageDialog(null, "Salário Bruto: " + objC2V2.mostraSalBruto());
        
        
    }
}
