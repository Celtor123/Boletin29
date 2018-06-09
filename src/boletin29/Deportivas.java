
package boletin29;

public class Deportivas extends Barco{
    private int cv;

    public Deportivas(String matricula, double numdias, int eslora,int cv) {
        super(matricula, numdias, eslora);
        this.cv = cv;
    }
   
    
}
