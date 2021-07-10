package fonte;
import java.util.Scanner;

public class paresEImpares {
    private int numeros[], pares, impares;
    private Scanner scan;
    
    public paresEImpares()
    {
        pares = 0;
        impares = 0;
        numeros = new int[20];
        scan = new Scanner(System.in);
    }
    
    public void inserirNumeros()
    {
        for (int i = 1; i < 21; i++)
        {
            System.out.println("Insira o "+i+"º numero: ");
            numeros[i - 1] = scan.nextInt();
        }
    }
    public void verificarParesImpares()
    {
        for (int i = 0; i < 20; i++)
        {
            if (numeros[i] % 2 == 0)
            {
                pares++;
            }
            else
            {
                impares ++;
            }
        }
    }
    public void imprimirParesImpares()
    {
        System.out.println("------------Resultado---------------");
        for (int i = 1; i < 21; i++)
        {
            System.out.println(+i+"º numero: "+numeros[i - 1]);
        }
        System.out.println("\nTotal de pares: "+pares);
        System.out.println("Total de ímpares: "+impares);
    }
    
    public static void main(String args[])
    {
        paresEImpares obj = new paresEImpares();
        
        obj.inserirNumeros();
        obj.verificarParesImpares();
        obj.imprimirParesImpares();
    }
}
