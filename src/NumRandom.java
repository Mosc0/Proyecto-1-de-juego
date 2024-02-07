import java.util.Random;
import java.util.Scanner;
//import java.io.IOException;

public class NumRandom {
    public static void main(String[] args){
        Scanner opciones = new Scanner(System.in);
        int opcion2;
        int opcion3;
        int cuentaRegresiva = 3;
        boolean mensajeMostrado = false;
        System.out.println("        !!Bienvenido al menu!!".toUpperCase());
        do {
            System.out.println("||////////////////////////////////////||");
            System.out.println("||  A continuacion elija una opcion   ||".toUpperCase());
            System.out.println("||  Opcion 1: Comenzar el juego       ||");
            System.out.println("||  Opcion 2: Salir del juego         ||");
            System.out.println("||////////////////////////////////////||");
            opcion2 = opciones.nextInt();
            while (cuentaRegresiva > 0){
                if(!mensajeMostrado){
                    System.out.println("Luego de elegir la opcion jugar tendra que esperar 3 segundos para que se ejecute el programa");
                    mensajeMostrado = true;
                }
                System.out.println(cuentaRegresiva);
                cuentaRegresiva--;
                try{
                    Thread.sleep(1000);
                }
                catch (InterruptedException e){
                    System.out.println("Error al pausar el programa".toUpperCase());
                }
            }
            limpiarConsola();
            switch (opcion2){
                case 1:
                    System.out.println("A elegido la opcion 1:");
                    System.out.println("Tiene que intentar adivinar un numero random entre 0 y 100");
                    Scanner entrada = new Scanner(System.in);
                    System.out.println("Por favor ingrese su numero: ");
                    int a;
                    boolean primerIfCumplido = false;
                    a = entrada.nextInt();
                    if(a < 0 || a > 100){
                        try{
                            Thread.sleep(1000);
                        }
                        catch (InterruptedException e){
                            System.out.println("Error al pausar el programa".toUpperCase());
                        }
                        limpiarConsola();
                        System.out.println("El numero ingresdo " + a + " no es valido");
                        System.out.println("Intentelo de nuevo y recuerde que debe ingresar un numero entre 1 y 100");
                    }
                    else{
                        Random rand = new Random();
                        int randomNumber = rand.nextInt(100);
                        try{
                            Thread.sleep(1000);
                        }
                        catch (InterruptedException e){
                            System.out.println("Error al pausar el programa".toUpperCase());
                        }
                        limpiarConsola();
                        System.out.println("El numero aleatorio fue: " + randomNumber);
                        System.out.println("El numero ingresado por el usuario fue: " + a);
                        if (a != randomNumber) {
                            primerIfCumplido = true;
                            System.out.println(a + " es distinto a " +randomNumber);
                            System.out.println("A casa malo");
                        }
                        else {
                            System.out.println("Adivino el numero".toUpperCase());
                            System.out.println("GG EZ");
                        }
                        if (primerIfCumplido){
                            do {
                                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                                System.out.println("|  Que desea hacer a continuacion:      |");
                                System.out.println("|  Presione 1 para volver a intentar    |");
                                System.out.println("|  Presione 2 para salir del programa   |");
                                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                                opcion3 = opciones.nextInt();
                                try{
                                    Thread.sleep(1000);
                                }
                                catch (InterruptedException e){
                                    System.out.println("Error al pausar el programa".toUpperCase());
                                }
                                limpiarConsola();
                                switch (opcion3) {
                                    case 1:
                                        break;
                                    case 2:
                                        System.out.println("Gracias por jugar".toUpperCase());
                                        System.out.println("Vuelva prontos");
                                        System.out.println("Saliendo del programa....");
                                        System.exit(0);
                                        break;
                                    default:
                                        System.out.println("Opcion no valida".toUpperCase());
                                }
                            }
                            while(opcion3 != 1);
                        }
                    }
                    break;
                 case 2:
                     System.out.println("Gracias por jugar".toUpperCase());
                     System.out.println("Vuelva prontos");
                     System.out.println("Saliendo del programa");
                    break;
                default:
                    System.out.println("Opcion no valida por favor vuelva a intentarlo".toUpperCase());
            }

       }
       while (opcion2 != 2);
       opciones.close();

       /* System.out.println("A continuacion lija una opción:");
        System.out.println("Opción 1: Salir del programa");
        int c;
        Scanner opcion = new Scanner(System.in);
        c = opcion.nextInt();
        if (c == 1) System.out.println("Gracias por usar nuestro programa vuelva pronto :)");

        */
    }
    /*public static void limpiarConsola(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

     */
    public static void limpiarConsola() {
        for (int i = 0; i < 50; i++ ){
            System.out.println();
        }
        /*try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                new ProcessBuilder("clear").inheritIO().start().waitFor();
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }

         */
    }
}
public class PiedraPapelTijera{
    public class void main(String[] args){
        System.out.println("Bienvenido al juego de piedra-papel-tijera");
        int
    }
}
