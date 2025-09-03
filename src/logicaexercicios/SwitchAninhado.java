package logicaexercicios;

public class SwitchAninhado {
    public static void main(String[] args) {
        int categoria = 2;
        int opcao = 1;
        switch (categoria) {
            case 1 -> {
                System.out.println("Categoria: Doces");
                switch (opcao) {
                    case 1 -> System.out.println("Bolo");
                    case 2 -> System.out.println("Sorvete");
                }
            }
            case 2 -> {
                System.out.println("Categoria: Salgados");
                switch (opcao) {
                    case 1 -> System.out.println("Esfiha");
                    case 2 -> System.out.println("Coxinha");
                }
            }
        }
    }
}
