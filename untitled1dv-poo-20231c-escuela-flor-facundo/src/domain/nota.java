package domain;

public class nota {
    private int primerParcial;
    private int segundoParcial;
    private int trabajoPractico;

    public nota(int primerParcial, int segundoParcial, int trabajoPractico) {
        this.primerParcial = primerParcial;
        this.segundoParcial = segundoParcial;
        this.trabajoPractico = trabajoPractico;
    }

    public int getPrimerParcial() {
        return primerParcial;
    }

    public int getSegundoParcial() {
        return segundoParcial;
    }

    public int getTrabajoPractico() {
        return trabajoPractico;
    }

    public String toString() {
        return "Nota - Primer Parcial: " + primerParcial + ", Segundo Parcial: " + segundoParcial + ", Trabajo Práctico: " + trabajoPractico;
    }
}