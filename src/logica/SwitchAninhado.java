package logica;

public class SwitchAninhado {
    public static void main(String[] args) {
        int categoria = 1;
        int opcao = 2;
        switch (categoria) {
            case 1 -> {
                System.out.println("Categoria: Matemática");
                switch (opcao) {
                    case 1 -> System.out.println("Soma");
                    case 2 -> System.out.println("Subtração");
                }
            }
            case 2 -> {
                System.out.println("Categoria: Texto");
                switch (opcao) {
                    case 1 -> System.out.println("Contar letras");
                    case 2 -> System.out.println("Inverter String");
                }
            }
        }
    }
}
