package Practica;

import javax.crypto.DecapsulateException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nombreApellido = "Tony Stark";
        String tipoDeCuenta = "Corriente";
        double saldo = 1599.99;
        int opcion = 1;
        Scanner teclado = new Scanner(System.in);

        System.out.println("----------------------------------------");
        System.out.println("Nombre y Apellido: " + nombreApellido);
        System.out.println("Tipo de Cuenta: " + tipoDeCuenta);
        System.out.println("Saldo Actual: " + saldo);
        System.out.println("----------------------------------------\n");

        while (opcion != 4) {
            System.out.println("Seleccione una de las siguientes opciones:\n * (1) Consultar saldo\n * (2) Retirar dinero\n * (3) Depositar dinero\n * (4) Finalizar Programa\n");
            System.out.println("Opcion Seleccionada:");
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("\n----------------------------------------");
                    System.out.println("Saldo Actual: " + saldo);
                    System.out.println("----------------------------------------\n");
                    break;
                case 2:
                    System.out.println("\n----------------------------------------");
                    System.out.println("Ingrese la cantidad de dinero a retirar: ");
                    double retirarSaldo = teclado.nextDouble();
                    if (retirarSaldo > saldo) {
                        System.out.println("ALERTA: Saldo Insuficiente para retirar");
                    } else if (retirarSaldo < 0) {
                        System.out.println("ALERTA: Retiro Invalido");
                    } else {
                        saldo = saldo - retirarSaldo;
                    }
                    System.out.println("----------------------------------------\n");
                    break;
                case 3:
                    System.out.println("\n----------------------------------------");
                    System.out.println("Ingrese la cantidad de dinero a depositar: ");
                    double depositarSaldo = teclado.nextDouble();
                    if (depositarSaldo < 0) {
                        System.out.println("ALERTA: Deposito invalido");
                    } else {
                        saldo = saldo + depositarSaldo;
                    }
                    System.out.println("----------------------------------------\n");
                    break;
                case 4:
                    System.out.println("\n----------------------------------------");
                    System.out.println("FINALIZACION DEL PROGRAMA EXITOSO");
                    System.out.println("----------------------------------------");
                    break;
                default:
                    System.out.println("\n----------------------------------------");
                    System.out.println("ALERTA: Ingreso de opcion invalida, porfavor vuelva a reingresar");
                    System.out.println("----------------------------------------\n");
                    break;
            }
        }
    }
}