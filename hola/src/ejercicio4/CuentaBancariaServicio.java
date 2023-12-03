package ejercicio4;

import java.util.Scanner;


public class CuentaBancariaServicio {

    public CuentaBancaria crearCuenta(){
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese su numero de cuenta: ");
        int numeroCuenta = sc.nextInt();
        System.out.println("Ingrese su DNI: ");
        long dni = sc.nextLong();
        System.out.println("Ingrese su saldo actual: ");
        double saldoActual = sc.nextDouble();
        return new CuentaBancaria(numeroCuenta,dni,saldoActual);
    }

    public void ingresarDinero(CuentaBancaria cuentaBancaria){
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese la cantidad que desea ingresr: ");
        double ingreso = sc.nextDouble();
        if(ingreso > 0){
            cuentaBancaria.setSaldoActual(cuentaBancaria.getSaldoActual() + ingreso);
        }else{
            System.out.println("Debe ingresar un monto mayor");
        }
    }
    public void retirarDinero(CuentaBancaria cuentaBancaria){
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el dinero que desea retirar: ");
        double retiro = sc.nextDouble();
        if(retiro <= cuentaBancaria.getSaldoActual()){
            cuentaBancaria.setSaldoActual(cuentaBancaria.getSaldoActual() - retiro);
        }else{
            System.out.println("No cuenta con el saldo suficiente ");
        }
    }
    public void extraccionRapida(CuentaBancaria cuentaBancaria){
        System.out.println("Se retiro " + cuentaBancaria.getSaldoActual() * 0.2);
        cuentaBancaria.setSaldoActual(cuentaBancaria.getSaldoActual() * 0.8);
    }
    public void consultarSaldo(CuentaBancaria cuentaBancaria){
        System.out.println("El saldo actual es: " + cuentaBancaria.getSaldoActual());
    }

    public void consultarDatos(CuentaBancaria cuentaBancaria){
        System.out.println(cuentaBancaria.toString());
    }


}



