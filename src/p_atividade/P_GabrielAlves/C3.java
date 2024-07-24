
package p_atividade.P_GabrielAlves;


public class C3 {
       public double calcfrete(double km, double pes, int qnt){
        double valkm, vdist, vpess, total;
 
        valkm = 18 * 0.3;
        vdist = valkm * km;
        vpess = vdist * (pes / 100);
        total = qnt * vpess;
 
        return total;
    }
}

