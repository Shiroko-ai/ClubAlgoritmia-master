import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class BebesMarcianos {
    public static void main(String[] args) {
        ArrayList<String> mujeres = new ArrayList<String>();
        ArrayList<String> bebes = new ArrayList<String>();
        ArrayList<String> mujeres_bebes = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int contador = 0;
        for (int i = 0; i < n; i++) {// F mujer, B bebe
            String s = sc.nextLine();
            StringTokenizer st = new StringTokenizer(s);

            if (st.nextToken().equals("B")) {
                mujeres_bebes.add(mujeres.get(mujeres.size() - 1));
                mujeres.remove(mujeres.size() - 1);
                bebes.add(st.nextToken());

            } else if (st.nextToken().equals("F")) {
                mujeres.add(st.nextToken());
            }
        }
        for (int i = 0; i < bebes.size(); i++) {
            System.out.println(bebes.get(i));
            System.out.println(mujeres_bebes.get(i));

        }
    }
}
