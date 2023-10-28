package application;


import entities.Vector;

import java.util.ArrayList;
import static entities.TransformacoesLineares.*;

public class Main {
    public static void main(String[] args) {


        ArrayList<Float> elementos = new ArrayList<>();
        elementos.add(1.0F);
        elementos.add(2.0F);
        Vector vect = new Vector(2, elementos);


        ArrayList<Float> elementos3D = new ArrayList<>();
        elementos3D.add(1.0F);
        elementos3D.add(2.0F);
        elementos3D.add(3.0F);
        Vector vect3D = new Vector(3, elementos3D);

        System.out.println("Vetor Original: " + vect.toString());
        System.out.println("Vetor 2D Transladado: " + translate2D(vect,2,3).toString());

        System.out.println("Vetor Original 3D: " + vect3D.toString());
        System.out.println("Vetor 3D Transladado: " + translate3D(vect3D,2,3,4).toString());



    }
}