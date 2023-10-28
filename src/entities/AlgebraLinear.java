package entities;

import java.util.ArrayList;

public class AlgebraLinear {
    // Aproveitando alguns códigos do trabalho anterior

    public static Matrix transpor(Object a) {
        if (a instanceof Vector) {
            Vector vetor = (Vector) a;
            ArrayList<Float> elementosTranspostos = new ArrayList<>();
            for (int i = 0; i < vetor.getDim(); i++) {
                elementosTranspostos.add(vetor.getElementos().get(i));
            }
            return new Matrix(vetor.getDim(), 1, elementosTranspostos);
        }

        if (a instanceof Matrix) {
            Matrix matriz = (Matrix) a;
            ArrayList<Float> elementosTranspostos = new ArrayList<>();
            for (int i = 1; i <= matriz.getColunas(); i++) {
                for (int j = 1; j <= matriz.getLinhas(); j++) {
                    elementosTranspostos.add(matriz.getElementos().get((j-1) * matriz.getColunas() + (i-1)));
                    elementosTranspostos.add(matriz.getElementos().get((j-1) * matriz.getColunas() + (j-1)));
                }
            }
            return new Matrix(matriz.getColunas(), matriz.getLinhas(), elementosTranspostos);
        }

        throw new IllegalArgumentException("O objeto precisa ser um vetor ou matriz para ser transposto.");
    }
}
