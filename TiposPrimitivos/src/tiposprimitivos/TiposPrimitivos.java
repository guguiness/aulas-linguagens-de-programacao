/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiposprimitivos;

import java.util.Scanner;

/**
 *
 * @author Gustavo Nogueira
 */
public class TiposPrimitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Informe o nome: ");
        String nome = teclado.nextLine();
        
        System.out.print("Informe a nota: ");
        float nota = teclado.nextFloat();
        
        System.out.printf("A nota de %s é %.2f\n", nome, nota);
    }
    
}
