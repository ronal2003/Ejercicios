import javax.swing.*;

public class punto3 {
    public static void main(String[] args) {
        //. Escribir un programa para una empresa que tiene salas de
        // juegos para todas las edades y quiere calcular de forma
        // automática el precio que debe cobrar a sus clientes por entrar.
        // El programa debe preguntar al usuario la edad del cliente y
        //mostrar el precio de la entrada. Si el cliente es menor de 4 años
        // puede entrar gratis, si tiene entre 4 y 18 años debe pagar 5000
        // y si es mayor de 18 años, 10000

        int edad;

        edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrrese su edad"));

        if (edad <= 3) {
            System.out.println("Por ser menor de 4 años su entrada es gratis");
        }
        if (edad >= 4) {
            System.out.println("costo de entrada 5000");
        }
        if (edad > 18) {
            System.out.println("costo de 10000");
        }

    }

}
