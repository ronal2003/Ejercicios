import javax.swing.*;

public class punto4 {
    public static void main(String[] args) {
        //Escribir un programa que pregunte el nombre del
        // usuario  y un número entero e imprima
        // por pantalla en líneas distintas el nombre del usuario
        // tantas veces como el número introducido.


        String nombre;
        int numero;


        nombre = JOptionPane.showInputDialog("Ingrese su nombre");
        numero = Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero"));
        for (int i = 1; i <= numero; i++) {
            if(numero%2 == 0) {
                System.out.println(i + "-" + nombre);

            }
        }
    }
}

