package DesignPatterns_Facade;

import java.util.Scanner;


public class Main {
    /**
     * @param args
     */
    public static void main(String[] args) {

    
        System.out.println("Combos dispoíveis:");
        System.out.println("1. Duplo Completo");
        System.out.println("2. Vegetariano");
        System.out.print("Digite o número correspondente ao combo escolhido:");
  

        Scanner input = new Scanner(System.in); 
 
        int escolha = input.nextInt();
       FazCombo combo = new FazCombo();
        combo.Combos(escolha);
        System.out.println(combo);
        }
    }

    