
package boletin29;

public class Programa {
  public static void main(String[] args) {
       Barco alfageme= new Barco("Alfageme",12.32,12){};
       alfageme.programa(alfageme);
       Velero ritchi= new Velero("Ritchi",7.5,7,2);
       ritchi.programa(ritchi);
       Deportivas wer= new Deportivas("wer",2.2,740,67);
       wer.programa(wer);
       Yate dorme= new Yate("dormeL1",10.1,3,120,3);
       dorme.programa(dorme);
    }
}
