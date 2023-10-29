package application;

import entities.Vector;

import java.util.ArrayList;

import static entities.TransformacoesLineares.*;
import static entities.TransformacoesLineares.rotation2D;

public class Util {


    public static void printSetado() {
        // Declarando vetor de 2 elementos
        ArrayList<Float> elementos = new ArrayList<>();
        elementos.add(1.0F);
        elementos.add(2.0F);
        Vector vect = new Vector(2, elementos);

        // Declarando vetor de 3 elementos
        ArrayList<Float> elementos3D = new ArrayList<>();
        elementos3D.add(1.0F);
        elementos3D.add(2.0F);
        elementos3D.add(3.0F);
        Vector vect3D = new Vector(3, elementos3D);

        // Criando angulo:
        // double angulo = 45; --> Não declare assim em Java, Java possui funcões como Math.sin || Math.cos && Math.tan .. e tais funcões
        // Esperam o angulo em radianos
        double anguloWithPi = Math.PI / 4; //  Ângulo de rotação em radianos (por exemplo, 45 graus)


        // Print do método translacão
        System.out.println("||||||||||||||||||||||||");
        System.out.println("Métodos para translação: ");
        System.out.println("||||||||||||||||||||||||");

        System.out.println("========================");
        System.out.println("Vetores Originais: ");
        System.out.println("Vetor 2D: " + vect.toString());
        System.out.println("Vetor 3D: " + vect3D.toString());
        System.out.println("========================");
        System.out.println("Vetor 2D Recebendo dx = 2 & dy = 3");
        System.out.println("Vetor 3D Recebendo dx = 2, dy = 3 & dz = 4");
        System.out.println("========================");
        System.out.println("Vetores após translação: ");
        System.out.println("Vetor 2D: " + translate2D(vect, 2, 3).toString());
        System.out.println("Vetor 3D: " + translate3D(vect3D, 2, 3, 4).toString());
        System.out.println("========================");


        // Métodos para rotacão:
        System.out.println("||||||||||||||||||||||||");
        System.out.println("Métodos para rotação: ");
        System.out.println("||||||||||||||||||||||||");
        System.out.println("========================");
        System.out.println("Vetores Originais: ");
        System.out.println("Vetor 2D: " + vect.toString());
        System.out.println("Vetor 3D: " + vect3D.toString());
        System.out.println("========================");
        System.out.println("Rotação em 45 graus em ambos os vetores: ");
        System.out.println("========================");
        System.out.println("Vetor 2D: " + rotation2D(vect, anguloWithPi));
        System.out.println("Vetor 3D(X): " + rotation3DX(vect3D, anguloWithPi));
        System.out.println("Vetor 3D(Y): " + rotation3DY(vect3D, anguloWithPi));
        System.out.println("Vetor 3D(Z): " + rotation3DZ(vect3D, anguloWithPi));
        System.out.println("========================");

        // Métodos para reflexão:
        System.out.println("||||||||||||||||||||||||");
        System.out.println("Métodos para reflexão: ");
        System.out.println("||||||||||||||||||||||||");
        System.out.println("========================");
        System.out.println("Vetores Originais: ");
        System.out.println("Vetor 2D: " + vect.toString());
        System.out.println("Vetor 3D: " + vect3D.toString());
        System.out.println("========================");
        System.out.println("Fazendo a reflexão: ");
        System.out.println("========================");
        System.out.println("Vetor 2D(X): " + reflection2DX(vect));
        System.out.println("Vetor 2D(Y): " + reflection2DY(vect));
        System.out.println("Vetor 3D(X): " + reflection3DX(vect3D));
        System.out.println("Vetor 3D(Y): " + reflection3DY(vect3D));
        System.out.println("Vetor 3D(Z): " + reflection3DZ(vect3D));
        System.out.println("========================");

        // Métodos para projeção:
        System.out.println("||||||||||||||||||||||||");
        System.out.println("Métodos para Projeção: ");
        System.out.println("||||||||||||||||||||||||");
        System.out.println("========================");
        System.out.println("Vetores Originais: ");
        System.out.println("Vetor 2D: " + vect.toString());
        System.out.println("Vetor 3D: " + vect3D.toString());
        System.out.println("========================");
        System.out.println("Fazendo a projeção: ");
        System.out.println("========================");
        System.out.println("Vetor 2D(X): " + projection2DX(vect));
        System.out.println("Vetor 2D(Y): " + projection2DY(vect));
        System.out.println("Vetor 3D(X): " + projection3DX(vect3D));
        System.out.println("Vetor 3D(Y): " + projection3DY(vect3D));
        System.out.println("Vetor 3D(Z): " + projection3DZ(vect3D));
        System.out.println("========================");

        // Cisalhamento
        System.out.println("||||||||||||||||||||||||");
        System.out.println("Métodos para Cisalhamento: ");
        System.out.println("||||||||||||||||||||||||");
        System.out.println("========================");
        System.out.println("Vetores Originais: ");
        System.out.println("Vetor 2D: " + vect.toString());
        System.out.println("Vetor 3D: " + vect3D.toString());
        System.out.println("========================");
        System.out.println("Cisalhamento UM: ");
        System.out.println("Valores: (Vetor2D, kx = 2, ky = 0)");
        System.out.println("========================");
        System.out.println("Resultado: " + shearing(vect, 2, 0));
        System.out.println("========================");
        System.out.println("Cisalhamento DOIS: ");
        System.out.println("Valores: (Vetor2D, kx = 0, ky = 2)");
        System.out.println("========================");
        System.out.println("Resultado: " + shearing(vect, 0, 2));
        System.out.println("========================");
        System.out.println("Cisalhamento TRES: ");
        System.out.println("Valores: (Vetor2D, kx = 2, ky = 2)");
        System.out.println("========================");
        System.out.println("Resultado: " + shearing(vect, 2, 2));


    }


}
