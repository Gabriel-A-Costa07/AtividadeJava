
package p_atividade.P_GabrielAlves;


import javax.swing.JOptionPane;
public class Exer3V2 {
  public static void main(String[] args){
       int qtdv;
       double vlr,p,d;
    vlr=Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o valor do produto:","Calculo do frete-Flávia",JOptionPane.QUESTION_MESSAGE));  
    p=Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o peso do produto:","Calculo do frete-Flávia",JOptionPane.QUESTION_MESSAGE));  
    qtdv=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite a quantidade de volumes do produto:","Calculo do frete-Flávia",JOptionPane.QUESTION_MESSAGE));
    d=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite a distancia da entrega:","Calculo do frete-Flávia",JOptionPane.QUESTION_MESSAGE));  

  //Criando a instancia do objeto
    C3V2 objCalc = new C3V2();
  JOptionPane.showConfirmDialog(null,"Valor da distancia"+ objCalc.getvalorfrete());
  }
}