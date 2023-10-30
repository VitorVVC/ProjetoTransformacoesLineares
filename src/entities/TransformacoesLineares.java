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

        resultElements.remove(resultElements.size() - 1);
        return new Vector(resultElements.size(), resultElements);
    }
    // Função de translação em 3D

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

    // Método para rotacionar um vetor 2D
    public static Vector rotation2D(Vector vector, double angle) {
        double cosTheta = Math.cos(angle);
        double sinTheta = Math.sin(angle);

        ArrayList<Float> elementos = new ArrayList<>(vector.getElementos());

        double x = elementos.get(0);
        double y = elementos.get(1);

        double newX = x * cosTheta - y * sinTheta;
        double newY = x * sinTheta + y * cosTheta;

        elementos.set(0, (float) newX);
        elementos.set(1, (float) newY);

        return new Vector(vector.getDim(), elementos);
    }

    // Método para rotacionar um vetor 3D em função do eixo X
    public static Vector rotation3DX(Vector vector, double angle) {
        double cosTheta = Math.cos(angle);
        double sinTheta = Math.sin(angle);

        ArrayList<Float> elementos = new ArrayList<>(vector.getElementos());

        double y = elementos.get(1);
        double z = elementos.get(2);

        double newY = y * cosTheta - z * sinTheta;
        double newZ = y * sinTheta + z * cosTheta;

        elementos.set(1, (float) newY);
        elementos.set(2, (float) newZ);

        return new Vector(vector.getDim(), elementos);
    }
    // Método para rotacionar um vetor 3D em função do eixo Y
    public static Vector rotation3DY(Vector vector, double angle) {
        double cosTheta = Math.cos(angle);
        double sinTheta = Math.sin(angle);

        ArrayList<Float> elementos = new ArrayList<>(vector.getElementos());

        double x = elementos.get(0);
        double z = elementos.get(2);

        double newX = x * cosTheta + z * sinTheta;
        double newZ = -x * sinTheta + z * cosTheta;

        elementos.set(0, (float) newX);
        elementos.set(2, (float) newZ);

        return new Vector(vector.getDim(), elementos);
    }

    // Método para rotacionar um vetor 3D em função do eixo Z
    public static Vector rotation3DZ(Vector vector, double angle) {
        double cosTheta = Math.cos(angle);
        double sinTheta = Math.sin(angle);

        ArrayList<Float> elementos = new ArrayList<>(vector.getElementos());

        double x = elementos.get(0);
        double y = elementos.get(1);

        double newX = x * cosTheta - y * sinTheta;
        double newY = x * sinTheta + y * cosTheta;

        elementos.set(0, (float) newX);
        elementos.set(1, (float) newY);

        return new Vector(vector.getDim(), elementos);
    }
    // Método para refletir um vetor 2D em função do eixo X
    public static Vector reflection2DX(Vector vector) {
        ArrayList<Float> elementos = new ArrayList<>(vector.getElementos());
        elementos.set(0, -elementos.get(0));
        return new Vector(vector.getDim(), elementos);
    }

    // Método para refletir um vetor 2D em função do eixo Y
    public static Vector reflection2DY(Vector vector) {
        ArrayList<Float> elementos = new ArrayList<>(vector.getElementos());
        elementos.set(1, -elementos.get(1));
        return new Vector(vector.getDim(), elementos);
    }
    // Método para refletir um vetor 3D em função do eixo X
    public static Vector reflection3DX(Vector vector) {
        ArrayList<Float> elementos = new ArrayList<>(vector.getElementos());
        elementos.set(0, -elementos.get(0));
        return new Vector(vector.getDim(), elementos);
    }

    // Método para refletir um vetor 3D em função do eixo Y
    public static Vector reflection3DY(Vector vector) {
        ArrayList<Float> elementos = new ArrayList<>(vector.getElementos());
        elementos.set(1, -elementos.get(1));
        return new Vector(vector.getDim(), elementos);
    }

    // Método para refletir um vetor 3D em função do eixo Z
    public static Vector reflection3DZ(Vector vector) {
        ArrayList<Float> elementos = new ArrayList<>(vector.getElementos());
        elementos.set(2, -elementos.get(2));
        return new Vector(vector.getDim(), elementos);
    }

    // Método para projetar um eixo X em um vetor 2D
    public static Vector projection2DX(Vector vector) {
        ArrayList<Float> elementos = new ArrayList<>();
        elementos.add(vector.getElementos().get(0));
        elementos.add(0F);
        return new Vector(2, elementos);
    }

    // Método para projetar um eixo Y em um vetor 2D
    public static Vector projection2DY(Vector vector) {
        ArrayList<Float> elementos = new ArrayList<>();
        elementos.add(0F);
        elementos.add(vector.getElementos().get(1));
        return new Vector(2, elementos);
    }

    // Método para projetar um eixo X em um vetor 3D
    public static Vector projection3DX(Vector vector) {
        ArrayList<Float> elementos = new ArrayList<>();
        elementos.add(vector.getElementos().get(0));
        elementos.add(0F);
        elementos.add(0F);
        return new Vector(3, elementos);
    }

    // Método para projetar um eixo Y em um vetor 3D
    public static Vector projection3DY(Vector vector) {
        ArrayList<Float> elementos = new ArrayList<>();
        elementos.add(0F);
        elementos.add(vector.getElementos().get(1));
        elementos.add(0F);
        return new Vector(3, elementos);
    }

    // Método para projetar um eixo Z em um vetor 3D
    public static Vector projection3DZ(Vector vector) {
        ArrayList<Float> elementos = new ArrayList<>();
        elementos.add(0F);
        elementos.add(0F);
        elementos.add(vector.getElementos().get(2));
        return new Vector(3, elementos);
    }

    // Método para "cisalhar" um vetor 2D em qualquer eixo, oque inclue obviamente ambos na mesma chamada de método
    public static Vector shearing(Vector vector, double kx, double ky) {
        ArrayList<Float> elementos = new ArrayList<>();
        double x = vector.getElementos().get(0);
        double y = vector.getElementos().get(1);

        elementos.add((float) (x + kx * y));
        elementos.add((float) (y + ky * x));

        return new Vector(2, elementos);
    }


}
