trin
package p_atividade.P_GabrielAlves;
import javax.swing.JOptionPane;

public class Exer1 {
  
    public static void main(String[] args) {
        int cont = 0;
       
        while (cont==0) {
          
            String num1Str = JOptionPane.showInputDialog(null, "Digite o primeiro número:",
                    "Dados Numéricos - Alves", JOptionPane.QUESTION_MESSAGE);
            String num2Str = JOptionPane.showInputDialog(null, "Digite o segundo número:",
                    "Dados Numéricos - Alves", JOptionPane.QUESTION_MESSAGE);
 
            int num1 = Integer.parseInt(num1Str);
            int num2 = Integer.parseInt(num2Str);
 
            String[] options = { "Adição", "Subtração", "Multiplicação", "Divisão", "Sair" };
            
            int choice = JOptionPane.showOptionDialog(null, "Escolha a operação:", "Dados Numéricos - Alves",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
                    
            switch (choice) {
                case 0: 
                    JOptionPane.showMessageDialog(null, "Resultado da adição: " + C1.adic(num1, num2),
                            "Dados Numéricos - Alves", JOptionPane.INFORMATION_MESSAGE);
                    cont = JOptionPane.showConfirmDialog(null,"deseja continuar","confirm diolog",
                           JOptionPane.OK_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE);
                    break;
                case 1: 
                    JOptionPane.showMessageDialog(null,
                            "Resultado da subtração: " + C1.sub(num1, num2),
                            "Dados Numéricos - Alves", JOptionPane.INFORMATION_MESSAGE);
                    cont = JOptionPane.showConfirmDialog(null,"deseja continuar","confirm diolog",
                           JOptionPane.OK_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE);
                    break;
                case 2: 
                    JOptionPane.showMessageDialog(null,
                            "Resultado da multiplicação: " + C1.mult(num1, num2),
                            "Dados Numéricos - Alves", JOptionPane.INFORMATION_MESSAGE);
                    cont = JOptionPane.showConfirmDialog(null,"deseja continuar","confirm diolog",
                           JOptionPane.OK_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE);
                    break;
                case 3: 
                    JOptionPane.showMessageDialog(null,
                            "Resultado da divisão: " + C1.div(num1, num2),
                            "Dados Numéricos - Alves", JOptionPane.INFORMATION_MESSAGE);
                    cont = JOptionPane.showConfirmDialog(null,"deseja continuar","confirm diolog",
                           JOptionPane.OK_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE);
                    break;
                default:cont = 1;
                   
                  
            }
        }
    }
}

