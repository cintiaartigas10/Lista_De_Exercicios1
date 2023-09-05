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
public class lista_de_exercicios5 {
    
    public static void main(String[] args) {
        int num2;
        Scanner scanner = new Scanner(System.in);
       System.out.println("informe o numero da contagem");
      num2 = scanner.nextInt();
             
       for(int num = num2; num>=1; num = num -= 1) {
           System.out.println(num);
       }
}
}