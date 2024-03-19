import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//HacerCondicional();
        HacerSwitch();
    }

    public static void EntradaYSalida() {
        System.out.println("Hello and welcome!");
        Scanner ComoSea = new Scanner(System.in);
        System.out.println("Your name");
        String nombre = ComoSea.nextLine();
        System.out.println("Your age:");
        int edad = ComoSea.nextInt();

        System.out.println(nombre + " " + edad);
    }

    public static void HacerCondicional() {
        if (18 == 19) {
            System.out.println("Error logico");
        } else if (10 > 11) {
            System.out.println("Error logico");
        } else {
            System.out.print("Todo esta bien");
        }
    }

    public static void HacerSwitch() {
        Scanner ComoSea = new Scanner(System.in);
        int opcion;
        float a, b;
        do {
            System.out.println("---Calculadora---");
            System.out.println("1-Suma");
            System.out.println("2-Resta");
            System.out.println("3-Multiplicacion");
            System.out.println("4-Division");
            System.out.println("5-Salir del programa");
            System.out.println("Ingrese una opcion");
            opcion = ComoSea.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("---Suma---");
                    System.out.println("Ingrese el primer numero");
                    a = ComoSea.nextInt();
                    System.out.println("Ingrese el segundo numero");
                    b = ComoSea.nextInt();
                    System.out.println(a + b);
                    break;
                case 2:
                    System.out.println("---Resta---");
                    System.out.println("Ingrese el primer numero");
                    a = ComoSea.nextInt();
                    System.out.println("Ingrese el segundo numero");
                    b = ComoSea.nextInt();
                    System.out.println(a - b);
                    break;
                case 3:
                    System.out.println("---Multiplicacion---");
                    System.out.println("Ingrese el primer numero");
                    a = ComoSea.nextInt();
                    System.out.println("Ingrese el segundo numero");
                    b = ComoSea.nextInt();
                    System.out.println(a * b);
                    break;
                case 4:
                    System.out.println("---Division---");
                    System.out.println("Ingrese el primer numero");
                    a = ComoSea.nextFloat();
                    System.out.println("Ingrese el segundo numero");
                    b = ComoSea.nextFloat();
                    System.out.println(a / b);
                    break;
                case 5:
                    System.out.println("Saliendo del programa....");
                    break;
            }
        } while (opcion != 5);
    }
}
