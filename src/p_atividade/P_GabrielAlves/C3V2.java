
package p_atividade.P_GabrielAlves;



public final class C3V2 {

private double valor;
private double peso;
private int quantidade;       
private double dist;    
private double valorkm;
private double valordist;
private double valorpeso;
private double valornumvol;
private double valorfrete;
 
 
//contrutore:por regra, os construtores devem ter o mesmo nome da classe
public C3V2(){}
 
public C3V2(double valor,double peso, int quantidade, double dist){
this.valor=valor;
this.peso=peso;
this.quantidade=quantidade;
this.dist=dist;
 
this.valorkm=16*0.3;
calcValorDist();

setvalorpeso();

calcValorFrete();
}
 
public void calcValorDist(){
this.valordist=this.valorkm*this.dist;   
}
public void calcValorFrete(){
this.valorfrete=this.valorpeso*this.quantidade;   
}

//retorna o valor armazenado no atributo
public double getvalor(){
return this.valor;
}
//armazena um novo valor no atributo
public void setvalor(double valor){
this.valor=valor;
}
 
 
public double getpeso(){
return this.peso;
}
public void setpeso(double peso){
this.peso=peso;
}
 
 
public double getquantidade(){
return this.quantidade;
}
public void setquantidade(int quantidade){
this.quantidade=quantidade;
}
 
public double getdist(){
return this.dist;
}
public void setdist(double dist){
this.dist=dist;
}
 
public double getvalorkm(){
return this.valorkm;
}
public void setvalorkm(double valorkm){
this.valorkm=valorkm;
}
 
public double getvalordist(){
return this.valordist;
}
public void setvalordist(double valordist){
this.valordist=valordist;
}
 
public double getvalorpeso(){
return this.valorpeso;
}
public void setvalorpeso(){
this.valorpeso=this.valordist*(peso/100);
}
 
public double getvalornumvol(){
return this.valornumvol;
}
public void setvalornumvol(double valornumvol){
this.valornumvol=valornumvol;
}
 
public double getvalorfrete(){
return this.valorfrete;
}
public void setvalorfrete(double valorfrete){
this.valorfrete=this.valorpeso*quantidade;
}


}
