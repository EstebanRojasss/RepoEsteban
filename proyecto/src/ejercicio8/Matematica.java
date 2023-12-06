package ejercicio8;
/*
Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor
valor
• Método calcularPotencia() para calcular la potencia del mayor valor de la clase
elevado al menor número. Previamente se deben redondear ambos valores.
• Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
 */
public class Matematica {
    private int numeroReal1;
    private int numeroReal2;

    public Matematica() {

    }

    public Matematica(int numeroReal1, int numeroReal2) {
        this.numeroReal1 = numeroReal1;
        this.numeroReal2 = numeroReal2;
    }

    public int getNumeroReal1() {
        return numeroReal1;
    }

    public void setNumeroReal1(int numeroReal1) {
        this.numeroReal1 = numeroReal1;
    }

    public int getNumeroReal2() {
        return numeroReal2;
    }

    public void setNumeroReal2(int numeroReal2) {
        this.numeroReal2 = numeroReal2;
    }


    protected int devolverMayor(int numeroReal1, int numeroReal2){
       if(numeroReal1 > numeroReal2){
           System.out.println("El mayor es: " + numeroReal1);
           return numeroReal1;
       }
        System.out.println("El mayor es: " + numeroReal2);
       return numeroReal2;
    }

    protected  void calcularPotencia(int numeroReal1, int numeroReal2){
        float numRedondeado1 = Math.round(numeroReal1);
        float numRedondeado2 = Math.round(numeroReal2);

        if(numRedondeado1 > numRedondeado2){
            System.out.println("Potencia del mayor numero: "+ Math.pow(numRedondeado1, numRedondeado2));
        }else{
            System.out.println("Potencia del mayor numero : " + Math.pow(numRedondeado2, numRedondeado1));
        }
    }


    protected void calcularRaiz(int numeroReal1, int numeroReal2){
        int numeroAbsoluto1 = Math.abs(numeroReal1);
        int numeroAbsoluto2 = Math.abs(numeroReal1);
        if(numeroReal1 > numeroReal2){
            System.out.println("Raiz del numero menor: " + Math.sqrt(numeroAbsoluto2));
        }else{
            System.out.println("Raiz del numero menor: " + Math.sqrt(numeroAbsoluto1));
        }
    }

    @Override
    public String toString() {
        return "" +
                "numeroReal1: " + numeroReal1 +
                "numeroReal2: " + numeroReal2;
    }


}
