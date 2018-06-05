package leccion.extra.pkg2bim.pkg01;

/**
 * @author Renato
 */
public class LeccionExtra2bim01 {

    public static void main(String[] args) {

        // Declaración de variables
        double[] arreglo1 = {110, 220, 430, 140, 250, 460};
        double[] arreglo2 = {10, 20, 30, 40, 50, 60};
        double[] arreglo3 = new double[6];
        double promedio=0, suma=0;
        
        // Calculo del arreglo 3
        for (int n = 0; n < arreglo3.length; n++) {
            arreglo3[n] = (arreglo1[n]/arreglo2[n]) ;
        } // Fin for

        // Salida
        // Encabezado
        System.out.println("Arreglo1\tArreglo2\tResultado\n");
        
        // Calculo del promedio
        for (int n = 0; n < arreglo3.length; n++) {
            suma = suma + arreglo3[n];
        } // Fin for
        
        promedio = suma/arreglo3.length;
        
        // Para presentar los datos de una mejor manera
        for (int n = 0; n < arreglo3.length; n++) {
            System.out.printf("%.1f\t\t%.1f\t\t%.1f\n", arreglo1[n], arreglo2[n], arreglo3[n]);
        } // Fin for
        
       
        // Salida del promedio
         System.out.printf("\nEl promedio del arreglo 3 es: %.2f\n\n", promedio);
    }   

}
