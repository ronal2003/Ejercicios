import javax.swing.*;
import java.sql.SQLIntegrityConstraintViolationException;

public class punto8 {

    public static void main(String[] args) {
        //Escribir un programa que pida al usuario un número entero
        // positivo y muestre por pantalla la cuenta atrás desde
        // ese número hasta cero separados por comas.

        int numero;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));


        for (int i = 10; i >= 0; i--) {
            if(numero>0){
                System.out.println(numero);
                numero--;

            }

        }
    }
}


