/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.antonella.calculadora;

import java.util.Scanner;
import javax.swing.JOptionPane;
import java.util.Random;


public class Calculadora {

    
    public static void main(String[] args) {
        
       //Circulo();
       Hipotenusa();
       //Potencias();
       //Raiz();
       //Logaritmo();
       //Interes();
       //Aleatorio();
       //Dados();
       
    }
    private static void Circulo(){
        Scanner RadioCirculo = new Scanner(System.in);
        
        System.out.println("Ingrese el radio del circulo: ");
        double Radio =RadioCirculo.nextDouble();
        
        double Perimetro= 2 * Math.PI * Radio;
        double Area =Math.PI * (Radio * Radio);
        
        System.out.println("El Perimetro de su circulo es de: "+Perimetro);
        System.out.println("El area de su circulo es de: "+Area);
    }
    private static void Hipotenusa(){
        Scanner Catetos = new Scanner(System.in);
 
        System.out.println("Calculadora de Hipotenusa");
        System.out.println("Ingrese la longitud del cateto A : ");
        double catetoA = Catetos.nextDouble();
 
        System.out.println("Ingrese la longitud del cateto B: ");
        double catetoB = Catetos.nextDouble();
 
        double hipotenusa = Math.sqrt(Math.pow(catetoA, 2) + Math.pow(catetoB, 2));

        System.out.println("Su hipotenusa mide: "+hipotenusa);
    }
    
    private static void Potencias(){
        
        Scanner Potencias = new Scanner(System.in);
        
        System.out.println("Calculador de Potencias");
        System.out.println("Ingrese la Base a exponenciar : ");
        double Base = Potencias.nextDouble();
        
        System.out.println("Ingrese el exponente: ");
        double Exponente = Potencias.nextDouble();
        
        double resultado = Math.pow(Base, Exponente);
        
        System.out.println("El resultado de su operacion es de: "+resultado);
    }
    private static void Raiz(){
        
        Scanner Raices = new Scanner(System.in);
        
        System.out.println("Calculador de Raices");
        System.out.println("Ingrese el numero que al que le aplicaremos la raiz cuadrada: ");
        int Base = Raices.nextInt();//es para que lo reconozca el metodo scanner
        
        double resultado = Math.sqrt(Base);
        
        System.out.println("El resultado de su operacion es de: "+resultado);
            
    }
    private static void Logaritmo(){

        double numero = Double.parseDouble/*transformamos la string en un numero double*/(JOptionPane.showInputDialog("Ingrese un número:"));
//y joptionpane abrimos una ventana para qu ele usuario ingrese el valor
        if (numero > 0) {

            double logNatural = Math.log(numero);
            double logBase10 = Math.log10(numero);

            System.out.println("Logaritmo natural: " + logNatural);
            System.out.println("Logaritmo base 10: " + logBase10);

        } else {

            System.out.println("El número debe ser mayor que 0.");

        }

    }
    private static void Interes(){
        
         Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese el monto principal: ");
        double principal = leer.nextDouble();

        System.out.print("Ingrese la tasa de interés anual (%): ");
        double tasa = leer.nextDouble();

        System.out.print("Ingrese la cantidad de años: ");
        int años = leer.nextInt();

        double montoFinal = principal * Math.pow((1 + tasa / 100),años/*se eleva los años por que cada uno q pasa se vuelve a gregar interes*/);

        System.out.println("Monto final: $" + montoFinal);

    }
    private static void Aleatorio(){
        
        Random random = new Random();

        int entero = random.nextInt(100) + 1;//genera el numero random
        double decimal = random.nextDouble();//genera el random decimal

        //solicitamos los parametros para generar el ultimo random
        int minimo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número mínimo:"));
        int maximo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número máximo:"));

        int rango = random.nextInt(maximo - minimo + 1) + minimo;

        System.out.println("Número entero entre 1 y 100: " + entero);
        System.out.println("Número decimal entre 0 y 1: " + decimal);
        System.out.println("Número aleatorio entre " + minimo + " y " + maximo + ": " + rango);

    }
    private static void Dados(){
        
        Random random = new Random();

        //aca se suma uno para anular el cero que pueda a llegar a salir ya que va de 0 a 5
        int dado1 = random.nextInt(6) + 1;
        int dado2 = random.nextInt(6) + 1;

        int suma = dado1 + dado2;

        System.out.println("Dado 1: " + dado1);
        System.out.println("Dado 2: " + dado2);
        System.out.println("La suma es: " + suma);
    }

}
