package entities;

import java.util.ArrayList;

public class Vector {

    private int dim;

    private ArrayList<Float> elementos;

    public Vector(int dim, ArrayList<Float> elementos) {
        this.dim = dim;
        this.elementos = elementos;
    }

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
        return "{" + elementos +
                '}';
    }
}
