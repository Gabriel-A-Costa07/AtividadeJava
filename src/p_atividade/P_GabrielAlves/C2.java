
package p_atividade.P_GabrielAlves;


public class C2 {
       public double calcSal(double hr, double salhr, int numdp){
        double sal;
        sal = hr * salhr + (120 * numdp);
        return sal;
    }
    public double calcINSS(double sal){
        double inss;
        if(sal <= 1412){
            inss = sal * 0.075;
        }
        else if(sal <= 2666.68){
            inss = sal * 0.09 - 21.18;
        }
        else if(sal <= 4000.03){
            inss = sal * 0.12 - 101.18;
        }
        else if(sal <= 7786.02){
            inss = sal * 0.14 - 181.18;
        }
        else{
            inss = 0;
        }
        
    return inss;
    }
    
    
    public double calcDescIR(double sal){
        double descIR;
        if(sal <= 2259.2){
            descIR = 0;
        }
        else if(sal <= 2826.65){
            descIR = sal * 0.075 - 169.44;
        }
        else if(sal <= 3751.05){
            descIR = sal * 0.15 - 381.44;
        }
        else if(sal <= 4664.68){
            descIR = sal * 0.225 - 662.77;
        }
        else{
            descIR = sal * 0.275 - 896;
        }
        
    return descIR;
    } 
}
// comentario aleatorio
