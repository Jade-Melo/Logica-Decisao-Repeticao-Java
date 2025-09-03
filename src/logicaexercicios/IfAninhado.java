package logicaexercicios;

public class IfAninhado {
    public static void main(String[] args) {
        double nota = 7.5;
        int frequencia = 65;
        if(nota >= 7) {
            if (frequencia >= 75) {
                System.out.println("Sua nota é suficiente");
            } else {
                System.out.println("Sua frequência está abaixo da média");
            }
        } else {
            System.out.println("Sua nota está abaixo da média");
        }
    }
}
