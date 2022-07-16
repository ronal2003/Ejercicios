import javax.swing.*;

public class punto9 {
    public static void main(String[] args){
        //Escribir un programa que pida al usuario una palabra y
        // la muestre por pantalla 10 veces.

        String nombre;
        nombre = JOptionPane.showInputDialog("Dime una palabra");

        for(int i =0; i<=10; i++){
            System.out.println(nombre);
        }
    }
}
