package logicaexercicios;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        do {
            System.out.println("Digite um número (-1 para sair): ");
            num = sc.nextInt();
        } while (num != -1);
        sc.close();
    }
}
