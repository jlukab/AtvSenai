package Condicao_Ternaria;

import java.util.Scanner;

public class CondTern02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe sua idade: ");
        int idade = sc.nextInt();

        sc.close();
        
        System.out.println((idade >= 18) ? "\nMaior de idade" : "\nMenor de idade");

        
    }
}
