/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista_de_exercicos1;
import java.util.Scanner;
/**
 *
 * @author cintia.3990
 */
public class lista_de_exercicos4 {    
    public static void main(String[] args) {


          Scanner scanner = new Scanner(System.in);
          
         int opcao;
         float num1, num2, resultado;
          
          System.out.println( "Informe a operação");
          System.out.println( "1 - SOMA");
          System.out.println( "2 - SUBTRAÇÃO");
          System.out.println( "3 - MULTIPLICAÇÃO");
          System.out.println( "4 - DIVISÃO");
          opcao = scanner.nextInt();
          
          if(opcao == 1){ //soma
               System.out.println("Informe o primeiro número: ");
               num1 = scanner.nextFloat();
               
               System.out.println("Informe o segundo número: ");
               num2 = scanner.nextFloat();
               
               resultado = num1 + num2;
               
               System.out.println("Resultado  da SOMA: " + resultado);
          }else if(opcao == 2){ //subtração
                    System.out.println("Informe o primeiro número: ");
               num1 = scanner.nextFloat();
               
               System.out.println("Informe o segundo número: ");
               num2 = scanner.nextFloat();
               
               resultado = num1 + num2;
               
               System.out.println("Resultado  da SUBTRAÇÃO: " + resultado);
          }else if(opcao == 3){ //multiplicação
                     System.out.println("Informe o primeiro número: ");
               num1 = scanner.nextFloat();
               
               System.out.println("Informe o segundo número: ");
               num2 = scanner.nextFloat();
               
               resultado = num1 + num2;
               
               System.out.println("Resultado  da MULTIPLICAÇÃO: " + resultado);                  
          }else if(opcao == 4){ //divisão
                     System.out.println("Informe o primeiro número: ");
               num1 = scanner.nextFloat();
               
               System.out.println("Informe o segundo número: ");
               num2 = scanner.nextFloat();
               
               resultado = num1 + num2;
               
               System.out.println("Resultado  da DIVISÃO: " + resultado);
          }else{
               System.out.println("Operação não cadastrada nesta calculadora!");
          }
    }
}