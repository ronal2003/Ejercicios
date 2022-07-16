import javax.swing.*;

public class punto7 {
    public static void main(String[] args) {
        //Escribir un programa que almacene la cadena de caracteres
        // contraseña en una variable, pregunte al usuario por la
        //contraseña e imprima por pantalla si la contraseña introducida
        // por el usuario coincide con la guardada en la variable sin
        //tener en cuenta mayúsculas y minúsculas.

        String contraseña1, contraseña = "UDEV12345";
        contraseña1 = JOptionPane.showInputDialog("Ingrese una contraseña");

            if (contraseña1.equals(contraseña)) {
                System.out.println("contraseña coinciden " + contraseña);
            } else {
                System.out.println("Contraseña no coinciden ");
            }
        }

}


