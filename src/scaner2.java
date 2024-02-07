import java.util.Scanner;

public class scaner2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Elija una opción:");
        System.out.println("1. Opción 1");
        System.out.println("2. Opción 2");

        int opcionExterna = scanner.nextInt();

        switch (opcionExterna) {
            case 1:
                System.out.println("Ha seleccionado la Opción 1.");
                System.out.println("Elija una subopción:");
                System.out.println("a. Subopción A");
                System.out.println("b. Subopción B");

                char subopcionA = scanner.next().charAt(0);

                switch (subopcionA) {
                    case 'a':
                        System.out.println("Ha seleccionado la Subopción A.");
                        break;
                    case 'b':
                        System.out.println("Ha seleccionado la Subopción B.");
                        break;
                    default:
                        System.out.println("Opción no válida.");
                        break;
                }
                break;
            case 2:
                System.out.println("Ha seleccionado la Opción 2.");
                // Aquí puedes agregar otro switch o realizar otras acciones
                break;
            default:
                System.out.println("Opción no válida.");
                break;
        }

        scanner.close();
    }
}