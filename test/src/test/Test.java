package test;
/**
 * Test para la documentación
 * @author laura
 */
import java.util.Scanner;
public class Test {
    /**
     * Restará el numero b al a y dará el resultado c
     * @param a Es el primer número que se introduce
     * @param b Es el númerpo que se le restará al primero
     * @return 
     */
    public static float resta(float a, float b) {
        float c;
        c=a-b;
        return c;
    }
    /**
     * Método prinicpal
     * @param args Argumentos de entrada de la clase
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner read=new Scanner (System.in);
        float num1;
        float num2;
        float num3;
        System.out.print("Introduce el primer numero ");
        num1=read.nextFloat();
        System.out.print("Introduce el segundo numero ");
        num2=read.nextFloat();
        num3=resta(num1, num2);
        System.out.println("El resultado de la resta es: "+num3);
    }
    
}
