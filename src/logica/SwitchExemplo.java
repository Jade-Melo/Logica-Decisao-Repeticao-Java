package logica;

public class SwitchExemplo {
    public static void main(String[] args) {
        int dia = 3;
        switch (dia) {
            case 1 -> System.out.println("Domingo");
            case 2 -> System.out.println("Segunda");
            case 3 -> System.out.println("Terça");
            case 4 -> System.out.println("Quarta");
            default -> System.out.println("Dia inválido");
        }
    }
}
