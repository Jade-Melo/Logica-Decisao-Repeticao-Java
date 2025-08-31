package logica;

public class DoWhileAninhado {
    public static void main(String[] args) {
        int i = 1;
        do {
            int j = 1;
            do {
              System.out.printf("%d x %d = %d ", i, j, i*j);
                j++;
            }while (j <= 3);
            System.out.println();
            i++;
        } while (i <= 3);
    }
}
