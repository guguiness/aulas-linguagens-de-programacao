/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadorcondicional;

import java.util.Scanner;

/**
 *
 * @author Gustavo Nogueira
 */
public class OperadorCondicional {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // condicional simples
        Scanner teclado = new Scanner(System.in);
        System.out.print("Nota 1: ");
        float n1 = teclado.nextFloat();
        System.out.print("Nota 2: ");
        float n2 = teclado.nextFloat();
        float media = (n1 + n2) / 2;
        System.out.println("Média: " + media);
        System.out.print("Status: ");
        if(media >= 7)
            System.out.println("APROVADO");
        // condicional composta
        else
            System.out.println("Exame");
    }
    
}
