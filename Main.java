package DesignPatterns_Facade;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Combos dispoíveis:");
        System.out.println("1. Duplo Completo");
        System.out.println("2. Vegetariano");
        System.out.print("Digite o número correspondente ao combo escolhido:");

        Scanner input = new Scanner(System.in);

        int tipo = input.nextInt();
        Combo combo = new Combo();
        combo.FazerCombo(tipo);
        System.out.println(combo);
    }

    @Override
    public String toString() {
        return "Main []";
    }
}