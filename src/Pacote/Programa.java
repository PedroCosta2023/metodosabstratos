package Pacote;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        List <Shape> lista = new ArrayList<Shape>();
        System.out.println("Quantos shape ;)");
        int n = sc.nextInt();

        for (int i = 0; i<n; i++){
            System.out.println("Shape #" + i + "data:");
            System.out.println("Regulo ou circulo (r/c)?");
            char ch = sc.next().charAt(0);
            System.out.println("Color (BLACK/BLUE/RED):");
            Color color = Color.valueOf(sc.next());
            if (ch == 'r'){
                System.out.println("Largura: ");
                double largura = sc.nextDouble();
                System.out.println("Altura: ");
                double altura = sc.nextDouble();
                lista.add(new Retangulo(color,largura,altura));
            }else {
                System.out.println("Radios: ");
                double raio = sc.nextDouble();
                lista.add(new Circulo(color,raio));
            }
        }

        System.out.println("");
        System.out.println("Shape Areas:");
        for (Shape shape: lista) {
            System.out.printf("%.2f",shape.area());
        }
        sc.close();
    }
}