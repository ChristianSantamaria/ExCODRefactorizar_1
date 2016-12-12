/*
 * Examen Refactorizacion
 * 
 */
package lovivido;

import javax.swing.JOptionPane;

public class LoVivido {

    // Cambio el nombre de las variables dando click derecho refactor rename y renombra todas con el mismo nombre
    
    // Creo el metodo CalculoEdad para que en el main no se vea tan mal
    public static void calculoEdad(String edad, String nombre){
        int mes;
        int dia;
        int hora;
        int ano;
        ano = Integer.parseInt(edad);

        mes = (ano * 12);
        dia = (ano * 365);
        hora = (dia * 24);
        
        mostrarDatos(mes, dia, hora, nombre);
    }
    
    // Creo el metodo mostrarDatos para mostrar los datos unicamente
    public static void mostrarDatos(int mes, int dia, int hora, String nombre){
        JOptionPane.showMessageDialog(null, "Meses: " + mes, "Numero de meses vividos de " + nombre, JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Días: " + dia, "Numero de días vividos de " + nombre, JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Horas: " + hora, "Numero de horas vividos de " + nombre, JOptionPane.INFORMATION_MESSAGE);
    }
    
    
    public static void main(String[] args) {

        String nombre = JOptionPane.showInputDialog("Escriba su nombre: ");
        String edad = JOptionPane.showInputDialog("Escriba su edad: ");
        
        calculoEdad(edad, nombre);
        System.exit(0);

    }

}
