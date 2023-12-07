package ejercicio9;

public class Arreglo {
    int[] arregloA = new int[50];
    double[] arregloB = new double[20];

    public Arreglo() {
    }

    public Arreglo(int[] arregloA, double[] arregloB) {
        this.arregloA = arregloA;
        this.arregloB = arregloB;
    }

    public int[] getArregloA() {
        return arregloA;
    }

    public void setArregloA(int[] arregloA) {
        this.arregloA = arregloA;

    }

    public double[] getArregloB() {
        return arregloB;
    }

    public void setArregloB(double[] arregloB) {
        this.arregloB = arregloB;
    }

}
