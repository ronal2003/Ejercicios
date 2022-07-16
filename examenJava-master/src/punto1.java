public class punto1 {
    public static void main(String[] args){
        // Escribir un programa que muestre por pantalla
        // la tabla de multiplicar del 1 al 10 usando ciclos.

        for(int i =0; i<=10; i++){
            System.out.println("Tabla del " + i);
            for(int j=1; j<=10; j++){
                System.out.println(i + "x" + j +"=" + i*j);
            }
        }
    }
}
