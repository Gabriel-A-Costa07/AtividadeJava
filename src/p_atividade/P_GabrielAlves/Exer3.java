
package p_atividade.P_GabrielAlves;
import javax.swing.JOptionPane;

public class Exer3 {
 public static void main(String[] args) {
        double val, pes, dit;
        int qnt;
 
        val =  Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o valor do produto: "));
        pes =  Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o peso dos produtos: "));
        dit =  Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a distância a ser percorrida para a entrega: "));
        qnt = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite a quantidade de volumes do produto: "));
 
        C3 total = new C3();
 
        JOptionPane.showMessageDialog(null,"O valor do produto é: " + val + 
                "\nA distancia a ser percorrida é: " + dit + 
                "\nA quantidade de volumes é: " + qnt + 
                "\nO peso dos volumes: " + pes + 
                "\nO valor do frete é: " + total.calcfrete(dit,pes,qnt));
    }
}
