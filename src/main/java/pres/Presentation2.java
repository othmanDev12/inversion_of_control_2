package pres;

import doa.IDao;
import metier.IMetier;

import java.io.File;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Presentation2 {
    public static void main(String[] args) throws Exception {
        Scanner scanner;
        scanner = new Scanner(new File("config.txt"));
        String doaClassName= scanner.nextLine();
        Class cDoa= Class.forName(doaClassName);
        IDao doa=(IDao) cDoa.newInstance();
//        System.out.println(doa.getData());
        String metierClassName= scanner.nextLine();
        Class cMetier= Class.forName(metierClassName);
        IMetier metier=(IMetier) cMetier.newInstance();
        Method method= cMetier.getMethod("setDao", IDao.class);
        method.invoke(metier, doa);

        System.out.println("Résultats => " +metier.calcul());
    }
}
