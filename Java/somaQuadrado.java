package fonte;
import java.util.Scanner;

public class somaQuadrado {
    
    private double numeros[], somaQuadrado;
    private Scanner scan;
    
    public somaQuadrado()
    {
        numeros = new double[31];
        somaQuadrado = 0;
        scan = new Scanner(System.in);
    }
    
    public void imprimirNumeros()
    {
        for (int i = 1; i < 31; i++)
        {
            numeros[i] = i;
            System.out.println(numeros[i]);
        }
    }
    public void calcularQuadrado()
    {
        for (int i = 1; i < 31; i++)
        {	  	  
            somaQuadrado = somaQuadrado + (numeros[i] / 2);
        }
    }
    public void imprimirResultado()
    {
        System.out.println("\nA soma dos quadrados é "+somaQuadrado);
    }
    
    public static void main(String args[])
    {
        somaQuadrado obj = new somaQuadrado();
        
        obj.imprimirNumeros();
        obj.calcularQuadrado();
        obj.imprimirResultado();
    }
}
