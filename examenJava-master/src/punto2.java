import javax.swing.*;

public class punto2 {
    public static void main(String[] args) {
        //Escribir un programa que pida al usuario un
        // número entero y muestre por pantalla un
        //triángulo rectángulo como el de más abajo.
        //
        // 1
        // 3 1
        // 5 3 1
        // 7 5 3 1
        int numero;


            for(int i =0; i<=4; i++) {
                System.out.println(1);
                for (int j = 0; j <= 4; j++) {
                    numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
                    if (numero%2 == 0) {
                        System.out.print(numero);
                    }
                }
            }
    }
}
