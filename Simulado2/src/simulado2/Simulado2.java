/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package simulado2;

import static java.lang.System.out;
import java.util.Scanner;

/**
 *
 * @author Rah
 */
public class Simulado2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int fases_faceis, fases_dificeis, horas_faceis, horas_dificeis, horas_totais, valor_jogatina,
                
        System.out.println("Há quantas fases faceis? ");
        
        fases_faceis = entrada.nextInt();
        
        fases_dificeis = 96 - fases_faceis;
         
        horas_faceis = fases_faceis;
        horas_dificeis = fases_dificeis * 2;
        
        horas_totais = horas_faceis + horas_dificeis;
        
        valor_jogatina = horas_totais * 5; 
        
        System.out.println("Quantidade de fases faceis " + fases_faceis);
        System.out.println("Qunatidade de fases dificeis " + fases_dificeis );
        System.out.println("Quantidade de horas gastas em fases fáceis: " + horas_faceis);
        System.out.println("Quantidade de horas gastas em fases dificeis: " + horas_dificeis);
        System.out.println("Horas gastas jogando: ");
        System.out.printl("Valor que se deverá ajudar em casa: " + valor_jogatina);
       
        
        
    }
    
}
