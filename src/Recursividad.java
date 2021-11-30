import java.util.Scanner;

public class Recursividad {
    long arreglo[] = new long[1000010];

    public long funcion_recursiva(int n) {
        if (arreglo[n] == 0) {
            if (n < 4) {
                arreglo[n] = 10;
            } else {
                arreglo[n] = funcion_recursiva(n - 2) + funcion_recursiva(n - 4) + 30;
            }

        }
        return arreglo[n];
    }

    public static void main(String[] args) {
        Recursividad r = new Recursividad();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(r.funcion_recursiva(n));
    }
}
