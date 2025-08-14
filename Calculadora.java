import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);
        
      System.out.println("Ingrese primer numero: ");
      double numero1 = escaner.nextDouble();
      escaner.nextLine();

      System.out.println("Ingrese segundo numero: ");
      double numero2 = escaner.nextDouble();
      escaner.nextLine();
      
      double suma, resta, multiplicacion, modulo, division; 
      suma = sumar(numero1, numero2);//Invocar un metodo
      resta = restar(numero1, numero2);
      multiplicacion = producto(numero1, numero2);
      resModulo = modulo(numero1, numero2);
      dividir = division(numero1, numero2);
      System.out.println("El resultado de la suma es: " + suma);
      System.out.println("El resultado de la resta es: " + resta);
      System.out.println("El resultado de la multiplicacion es: " + multiplicacion);
      System.out.println("El resultado del modulo es: " + resModulo);
      System.out.println("El resultado de la division es: " + dividir);
      //System.out.println("Ingresaste: " + numero1);
      
      

    }

    public static double sumar(double a, double b){
        return a + b;
    } 
    public static double restar(double a, double b){
        return a - b;
    } 
    public static double producto(double a, double b){
        return a * b;
    } 
    public static double modulo(double a, double b){
        return a % b;
    }
    public static double division(double a, double b){
        return a / b;
    } 
}