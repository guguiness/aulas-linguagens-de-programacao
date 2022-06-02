/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadoresmatematicos;

import java.util.Scanner;

/**
 *
 * @author Gustavo Nogueira
 */
public class OperadoresMatematicos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int a = 3;
        int valor1 = 5 + a++;    // Primeiro faz a operação e depois incrementa (pós-incremento)
        a = 3;
        int valor2 = 5 + ++a;    // Primeiro incrementa e depois faz a operação (pré1-incremento)
        System.out.println("Valor pós-incremento: " + valor1);
        System.out.println("Valor pré-incremento: " + valor2);
        
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Informe numerador: ");
        int n = teclado.nextInt();
        
        System.out.print("Informe denominador: ");    
        int d = teclado.nextInt();
        
        float div = n/d;
        float resto = n%d;
        System.out.println("Divisão: " + div);
        System.out.println("Resto: " + resto);
        
        double ale = Math.random();
        
        int numAle = (int) (1 + ale * (60 - 1));
        System.out.println(numAle);
    }
    
}
