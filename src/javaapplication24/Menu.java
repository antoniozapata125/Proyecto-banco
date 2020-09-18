/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication24;


import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Menu {

Scanner input = new Scanner(System.in);
    String opcion;
     Bancos[] arregloCuenta = new Bancos[20];
    boolean salir = false;
 Persona per =new Persona();
   
 
    public void menu() {
     
        
         arregloCuenta[1] = per.cuenta1;
         arregloCuenta[2] = per.cuenta2;
         arregloCuenta[3] = per.cuenta3;
        do {
            System.out.println("1 para Deposito.\n2 para retiros.\n3 para mostrar Saldo\n4 para Salir");
            opcion = input.next();

            switch (opcion) {
                case "1":
                   
System.out.println("Introduzca numero de cuenta: ");
         int NumeroCuenta = input.nextInt();
                    System.out.println("Introduzca cantidad a depositar: ");
                    int deposito = input.nextInt();
                    arregloCuenta[NumeroCuenta].deposito(deposito);
                    System.out.println("Depositó a la cuenta: " + deposito + ".\nEl nuevo saldo es de: " + arregloCuenta[NumeroCuenta].getSaldo());
                    break;
                    

                case "2":
System.out.println("Introduzca numero de cuena: ");
                    NumeroCuenta = input.nextInt();
                    System.out.println("Introduzca cantidad a retirar: ");
                    int retiro = input.nextInt();
                    arregloCuenta[NumeroCuenta].retiro(retiro);
                    System.out.println("Retiró de la cuenta: " + retiro + ".\nEl nuevo saldo es de: " + arregloCuenta[NumeroCuenta].getSaldo());
                    break;
                   

                case "3":

                    System.out.println("Introduzaca Número de cuenta:");
                    NumeroCuenta = input.nextInt();
                    System.out.println("El saldo es de:");
                    System.out.println(arregloCuenta[NumeroCuenta].getSaldo());
                    break;

                case "4":
                    salir = true;
                    break;
                            

            }
        } while (salir == false);
    }
}






