package entities;

import java.util.ArrayList;

import static entities.Vector.validarInt;

public class Matrix {

    // Classe matriz que se julgou necessária para melhoria do código
    // Possue como atributos linhas, colunas e uma lista de elementos
    private int linhas;
    private int colunas;

    private ArrayList<Float> elementos;

    // Construtor recebendo os atributos anteriores como parametro
    // E há uma checagem, caso a linha * a coluna seja diferente da quantidade de elementos
    // presentes na lista, dará um erro.
    public Matrix(int linhas, int colunas, ArrayList<Float> elementos) {
        if(linhas * colunas != elementos.size()){
            throw new ArithmeticException("Erro");
        }
        this.linhas = validarInt(linhas);
        this.colunas = validarInt(colunas);
        this.elementos = elementos;
    }

    // Métodos Getters & Setters
    public int getLinhas() {
        return linhas;
    }

    public void setLinhas(int linhas) {
        this.linhas = linhas;
    }

    public int getColunas() {
        return colunas;
    }

    public void setColunas(int colunas) {
        this.colunas = colunas;
    }

    public ArrayList<Float> getElementos() {
        return elementos;
    }
}
