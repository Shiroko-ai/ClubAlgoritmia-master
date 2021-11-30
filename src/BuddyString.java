import java.util.Scanner;
import java.util.StringTokenizer;

public class BuddyString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cadena = sc.nextLine();
        
        StringTokenizer st = new StringTokenizer(cadena);
        int tamano = Integer.parseInt(st.nextToken());
        int n_operaciones = Integer.parseInt(st.nextToken());
        String palabra = sc.nextLine();
        String operacion = new String();
        boolean esta_mayuscula = false;
        for (int i = 0; i < n_operaciones; i++) {
            operacion = sc.nextLine();
            StringBuilder palabra_modificada = new StringBuilder(palabra);
            switch (operacion) {
                case "M":
                    palabra = palabra.toUpperCase();
                    esta_mayuscula = true;
                    break;
                case "I":
                    palabra = palabra_modificada.reverse().toString();
                case "C":
                palabra = palabra.toLowerCase();
                StringBuilder reemplazos = new StringBuilder(palabra);
                    for(int j = 0; j < palabra.length(); j++) {
                        
                        if(palabra.charAt(j) > 109){
                            
                        }
                    }
            }
        }

    }
}
