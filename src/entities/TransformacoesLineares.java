package entities;

import java.util.ArrayList;

public class TransformacoesLineares {

    // Função para multiplicar uma matriz 3x3 por um vetor 3x1 (coordenadas homogêneas)
    private static Matrix multiplyMatrixVector(double[][] matrix, Vector vector) {
        ArrayList<Float> resultElements = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            double sum = 0;
            for (int j = 0; j < vector.getElementos().size(); j++) {
                sum += matrix[i][j] * vector.getElementos().get(j);
            }
            resultElements.add((float) sum);
        }
        return new Matrix(matrix.length, 1, resultElements);
    }

    // Função de translação em 2D
    public static Vector translate2D(Vector vector, double dx, double dy) {
        ArrayList<Float> elementos = new ArrayList<>(vector.getElementos());
        elementos.add(1.0F);
        Vector copy = new Vector(vector.getDim() + 1, elementos); // Aumenta a dimensão do vetor
        double[][] translationMatrix = {
                {1, 0, dx},
                {0, 1, dy},
                {0, 0, 1}
        };
        Matrix resultMatrix = multiplyMatrixVector(translationMatrix, copy);

        // Extrair os elementos da matriz para um novo vetor
        ArrayList<Float> resultElements = resultMatrix.getElementos();

        resultElements.remove(resultElements.size() -1);
        return new Vector(resultElements.size(), resultElements);
    }

    public static Vector translate3D(Vector vector, double dx, double dy, double dz) {
        ArrayList<Float> elementos = new ArrayList<>(vector.getElementos());
        elementos.add(1.0F);
        Vector copy = new Vector(vector.getDim() + 1, elementos); // Aumenta a dimensão do vetor
        double[][] translationMatrix = {
                {1, 0, 0, dx},
                {0, 1, 0, dy},
                {0, 0, 1, dz},
                {0, 0, 0, 1}
        };
        Matrix resultMatrix = multiplyMatrixVector(translationMatrix, copy);

        // Extrair os elementos da matriz para um novo vetor
        ArrayList<Float> resultElements = resultMatrix.getElementos();

        resultElements.remove(resultElements.size() - 1);
        return new Vector(resultElements.size(), resultElements);
    }




}
