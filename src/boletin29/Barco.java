
package boletin29;

import javax.swing.JOptionPane;

public abstract class Barco {
    String matricula;
    double numdias;
    int eslora;


    public Barco(String matricula, double numdias, int eslora) {
        this.matricula = matricula;
        this.numdias = numdias;
        this.eslora = eslora;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getNumdias() {
        return numdias;
    }

    public void setNumdias(double numdias) {
        this.numdias = numdias;
    }

    public int getEslora() {
        return eslora;
    }

    public void setEslora(int eslora) {
        this.eslora = eslora;
    }

public void programa(Barco barco){
      
      
      int aluguer=(int) ((barco.getNumdias())*(barco.getEslora()*10));
      JOptionPane.showMessageDialog(null,"FACTURA \n"+"matricula: "+matricula+" eslora: "+eslora+" precio do aluguer: "+aluguer);
}

}

