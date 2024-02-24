package pres;

import doa.DoaImpl;
import ext.DoaImpl2;
import metier.MetierImpl;

public class Presentation {
    public static void main(String[] args) {
        DoaImpl doa= new DoaImpl();
        DoaImpl2 doa1 = new DoaImpl2();
        MetierImpl metier= new MetierImpl(doa);
        MetierImpl metier1= new MetierImpl(doa);
        metier.setDao(doa);
        metier1.setDao(doa1);
        System.out.println("Resultats= " +metier.calcul());
        System.out.println("Resultats 2= " +metier1.calcul());
    }
}
