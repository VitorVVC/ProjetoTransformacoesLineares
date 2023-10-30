package entities;

import java.util.ArrayList;
import java.util.InputMismatchException;

public class Vector {

    // Classe vetor que possue uma dimensão e uma lista de elementos
    private int dim;

    private ArrayList<Float> elementos;

    // Construtor com argumentos antes citados
    // Neste construtor chamo o metodo pois não pode haver dimensões -1
    public Vector(int dim, ArrayList<Float> elementos) {
        this.dim = validarInt(dim);
        this.elementos = elementos;
    }

    // Método para validar um numero inteiro
    public static int validarInt(int valor) {
        if (valor < 0) {
            throw new InputMismatchException("Não aceitamos números negativos nessa entrada");
        }
        return valor;
    }

    // Métodos getters & Setters
    public int getDim() {
        return dim;
    }

    public void setDim(int dim) {
        this.dim = dim;
    }

    public ArrayList<Float> getElementos() {
        return elementos;
    }

    @Override
    public String toString() {
        return "" + elementos;
    }
}
