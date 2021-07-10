package fonte;
import java.util.Arrays; 
import java.util.Scanner;

public class vetorCrescente {
    private int numeros[], menorNumero;
    private Scanner scan;
    
    public vetorCrescente()
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
        System.out.println("\nNúmeros ordenados do menor para maior:\n");
        for (int i = 0; i < 10; i++)
        {
            System.out.println(numeros[i]);
        }
    }
    
    public static void main(String args[])
    {
        vetorCrescente obj = new vetorCrescente();
        
        obj.inserirNumeros();
        obj.ordenarNumeros();
        obj.imprimirNumerosOrdenados();
    }
}
