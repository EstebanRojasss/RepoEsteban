package ejercicio8;

public class Libro {
    private String titulo;
    private String autor;
    private int numEjemplares;
    private int ejemplaresPrestados;
    public Libro() {
    }

    public Libro(String titulo, String autor, int numEjemplares, int ejemplaresPrestados) {
        this.titulo = titulo;
        this.autor = autor;
        this.numEjemplares = numEjemplares;
        this.ejemplaresPrestados = ejemplaresPrestados;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumEjemplares() {
        return numEjemplares;
    }

    public void setNumEjemplares(int numEjemplares) {
        this.numEjemplares = numEjemplares;
    }

    public int getEjemplaresPrestados() {
        return ejemplaresPrestados;
    }

    public void setEjemplaresPrestados(int ejemplaresPrestados) {
        this.ejemplaresPrestados = ejemplaresPrestados;
    }

    @Override
    public String toString() {
        return "Libro: " +
                " \nTitulo: " + titulo +
                " \nAutor: " + autor +
                " \nNumEjemplares: " + numEjemplares +
                " \nejemplaresPrestados: " + ejemplaresPrestados ;
    }
}
