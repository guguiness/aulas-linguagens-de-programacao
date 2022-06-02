/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula04;

// Importação de bibliotecas
import java.util.Date;
import java.util.Locale;
import java.awt.Toolkit;
import java.awt.Dimension;

/**
 *
 * @author Gustavo Nogueira
 */
public class Aula04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Hora do sistema
        Date relogio = new Date();
        System.out.print("A hora do sistema é: ");
        System.out.println(relogio.toString());
        
        // Linguagem do sistema
        Locale lang = Locale.getDefault();
        System.out.print("A linguagem do sistema é: ");
        System.out.println(lang.getDisplayLanguage());
        
        // Resolução de tela
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension dim = tk.getScreenSize();
        System.out.println("A resolução de tela é: " + dim.width + " X " + dim.height);
        
    }
    
}
