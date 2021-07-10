package fonte;
import java.util.Scanner;

public class numerosPrimos {
    
    private int numeros[];
    private double cubo;
    private Scanner scan;
    
    public numerosPrimos()
    {
        numeros = new int[10];
        cubo = 0;
        scan = new Scanner(System.in);
    }
    
    public void inserirNumeros()
    {
        System.out.println("Insira 10 números: ");
        for (int i = 0; i < 10; i++)
        {
            numeros[i] = scan.nextInt();
        }
    }
    public void calcularCubo()
    {
        for (int i = 0; i < 10; i++)
        {	  	  
            cubo = Math.cbrt(numeros[i]);
            System.out.println("Raíz cúbida de "+numeros[i]+": "+cubo);
        }
    }
    public static void main(String args[])
    {
        numerosPrimos obj = new numerosPrimos();
        
        obj.inserirNumeros();
        obj.calcularCubo();
    }
}
