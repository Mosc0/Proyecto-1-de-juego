public class HolaMundo {
    public static void main(String[] args){
       System.out.println("Hola mundo :)");
       String saludar = "Hola mundo desde una variable";
       System.out.println(saludar);
        System.out.println("saludar.toUpperCase() = " + saludar.toUpperCase());
        System.out.println(saludar.toLowerCase());
        int a = 4;
        int b = 6;
        int numero = 3;
        int numero2 = 6;
        int suma = numero + numero2;
        System.out.println("suma = numero 1: " + numero + " + numero 2: " + numero2 + " el resultado es = " + suma  );
        if(a < b){
            System.out.println("a es menor que b");
        }
    }
}