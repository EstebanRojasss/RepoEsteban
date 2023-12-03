package ejercicio4;

import java.util.Scanner;

/*
Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los
atributos: numeroCuenta (entero), el DNI del cliente (entero largo), el saldo actual. Las
operaciones asociadas a dicha clase son:
• Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
• Agregar los métodos getters y setters correspondientes
• Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
• Método ingresar(double ingreso): el método recibe una cantidad de dinero a
ingresar y se la sumara a saldo actual.
• Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y
se la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
pondrá el saldo actual en 0.
• Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar
que el usuario no saque más del 20%.
• Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
• Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
 */
public class Main {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        CuentaBancariaServicio cuentaService = new CuentaBancariaServicio();
        CuentaBancaria cuentaBancaria = cuentaService.crearCuenta();
        int menu;
        do{
            System.out.println("CUENTA BANCARIA");
            System.out.println("1. Ingresar dinero");
            System.out.println("2. Retirar dinero");
            System.out.println("3. Extraccion rapida (20%)");
            System.out.println("4. Consultar saldo");
            System.out.println("5. Consultar datos");
            System.out.println("6. Salir");
            menu = sc.nextInt();
            switch (menu){
                case 1 :cuentaService.ingresarDinero(cuentaBancaria);
                    break;
                case 2: cuentaService.retirarDinero(cuentaBancaria);
                    break;
                case 3:cuentaService.extraccionRapida(cuentaBancaria);
                    break;
                case 4:cuentaService.consultarSaldo(cuentaBancaria);
                    break;
                case 5:cuentaService.consultarDatos(cuentaBancaria);
                    break;
                case 6:
                    System.out.println("Que tenga un buen dia. ");
                    break;
                default:
                    System.out.println("Debe ingresar una de las opciones.");
            }
        }while(menu != 6);

    }
}
