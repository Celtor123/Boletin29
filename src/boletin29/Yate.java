
package boletin29;

public class Yate extends Barco{
    int cv;
    int numcamarotes;

    public Yate(String matricula, double numdias, int eslora,int cv, int numcamarotes) {
        super(matricula, numdias, eslora);
        this.cv = cv;
        this.numcamarotes = numcamarotes;
    }
    
    
}
