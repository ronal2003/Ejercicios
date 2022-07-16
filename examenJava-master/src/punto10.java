import javax.swing.*;

public class punto10 {
    public static void main(String[] args) {
        // Escribir un programa que almacene la cadena de
        // caracteres contraseña en una variable, pregunte al
        // usuario por la contraseña hasta que introduzca
        // la contraseña correcta.

        String c,con, contraseña = "udev12345";

        int contador = 0;
        boolean decicion = true;
        do {
            con = JOptionPane.showInputDialog("Ingresa la contraseña correcta");
            if(con.equals(contraseña)){
                System.out.println("Contraseña correcta");
                decicion = true;
                contador++;

            } else {
                System.out.println("Contraseña incorrecta");
                decicion = false;
            }

        } while (decicion == false);
        System.out.println("A adivinado la contraseña en " + contador + " veces ");
        contador++;
    }

}

