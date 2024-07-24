
package p_atividade.P_GabrielAlves;
import javax.swing.JOptionPane;

public class Exer2 {
    public static void main(String[] args) {
        double hr, salhr;
        int numdp;
 
        hr = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite a quantidades de horas trabalhadas: "));
        salhr = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o salário-hora: "));
        numdp = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o número de dependentes: "));
 
        C2 sal = new C2();
        double salB = sal.calcSal(hr, salhr, numdp);
        double inss = sal.calcINSS(salB);
        double IR = sal.calcDescIR(salB);
        double salf = salB - inss - IR;
 
        JOptionPane.showMessageDialog(null,"O salário bruto é: " + salB+
                "\n"+"INSS: " + inss+
                "\n"+"Desconto IR: " + IR+
                "\n"+"Salário liquido: " + salf);
    }
}
