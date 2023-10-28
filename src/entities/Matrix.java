package entities;

import java.util.ArrayList;

public class Matrix {

    private int linhas;
    private int colunas;

    private ArrayList<Float> elementos;

    public Matrix(int linhas, int colunas, ArrayList<Float> elementos) {
        if(linhas * colunas != elementos.size()){
            throw new IllegalArgumentException("Erro");
        }
        this.linhas = linhas;
        this.colunas = colunas;
        this.elementos = elementos;
    }

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
