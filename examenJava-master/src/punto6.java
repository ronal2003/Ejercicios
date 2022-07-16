import javax.swing.*;
import java.util.Locale;

public class punto6 {
    public static void main(String[] args){
        //Escribir un programa que pregunte el nombre completo del
        // usuario y después muestre por pantalla el nombre completo
        // del usuario tres veces, una con todas las letras minúsculas,
        // otra con todas las letras mayúsculas y otra solo con la
        //primera letra del nombre y de los apellidos en mayúscula.
        // El usuario puede introducir su nombre combinando mayúsculas
        // y minúsculas como quiera.

        String usuario;
        usuario = JOptionPane.showInputDialog("Porfavot ingrese el nombre completo ");

        String caracter1 = usuario.toUpperCase();
        String caracter2 = usuario.toLowerCase();

        System.out.println(caracter1);
        System.out.println(caracter2);

    }
}
