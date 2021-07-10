package fonte;

import java.util.Arrays;
import java.util.Scanner;

public class vetorDecrescente {
    private int numeros[], menorNumero;
    private Scanner scan;
    
    public vetorDecrescente()
    {
        menorNumero = 0;
        numeros = new int[10];
        scan = new Scanner(System.in);
    }
    
    public void inserirNumeros()
    {
        for (int i = 1; i < 11; i++)
        {
            System.out.println("Insira o "+i+"º numero: ");
            numeros[i - 1] = scan.nextInt();
        }
    }
    public void ordenarNumeros()
    {
        Arrays.sort(numeros);
    }
    public void imprimirNumerosOrdenados()
    {
        System.out.println("\nNúmeros ordenados do maior para menor:\n");
        for (int i = 9; i >= 0; i--)
        {
            System.out.println(numeros[i]);
        }
    }
    
    public static void main(String args[])
    {
        vetorDecrescente obj = new vetorDecrescente();
        
        obj.inserirNumeros();
        obj.ordenarNumeros();
        obj.imprimirNumerosOrdenados();
    }
}
