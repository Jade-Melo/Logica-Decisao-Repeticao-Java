package logica;

public class IfAninhado {
    public static void main(String[] args) {
        double nota = 7.5;
        int frequencia = 80;
        if (nota >= 7) {
            if (frequencia >= 75) {
                System.out.println("Aprovado!");
            } else {
                System.out.println("Reprovado por frequência.");
            }
        }else{
            System.out.println("Reprovado por nota.");
        }
    }
}
