package p_atividade.P_GabrielAlves;

public class C2V2 {
    private double qtdht;
    private double slrh;
    private int numd;
    private double slrb;
    private double inss;
    private double ir;
    private double descIR;
    
    
    public void calcSalBruto(double qtdht, double slrh, int numd, double ir){
        this.qtdht = qtdht;
        this.slrh = slrh;
        this.numd = numd;
        this.ir = ir;
        this.descIR = descIR;
       
        this.slrb = this.qtdht * this.slrh + (120* this.numd);
    }
    
    public double mostraSalBruto(){
        return this.slrb;
    }
    
    public void calcDescInss(){
        if(this.slrb<=1412)
            this.inss = this.slrb * 0.075;
        }
       else if(this.slrb>=1412.01 && this.slrb<=2666.68){
            this.inss = (this.slrb * 0.09) - 21.18;
        }
        else if(this.slrb>=2666.69 && this.slrb<=4000.03){
            this.inss = (this.slrb * 0.12) - 101.18;
        }
        else if(this.slrb>=4000.03 && this.slrb<=7786.02){
            this.inss = (this.slrb * 0.14) - 181.18;
        }
     public double calcDescIR(){
        double ir;
        if(this.slrb <= 2259.2){
            descIR = 0;
        }
        else if(this.slrb <= 2826.65){
            descIR = this.slrb * 0.075 - 169.44;
        }
        else if(this.slrb <= 3751.05){
            descIR = this.slrb * 0.15 - 381.44;
        }
        else if(this.slrb <= 4664.68){
            descIR = this.slrb * 0.225 - 662.77;
        }
        else{
            descIR = this.slrb * 0.275 - 896;
        }
        
    return descIR;
    } 

    void calcSalBruto(double qtdht, double slrh, int numd) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    }
    
