package fonte;
import java.util.Scanner;

public class vetorAoContrario {
    private int vetor[];
    private Scanner scan;
    
    public vetorAoContrario()
    {
        vetor = new int[11];
        scan = new Scanner(System.in);
    }
    
    public void inserirNumeros()
    {
        for (int i = 1; i < 11; i++)
        {
            System.out.println("Insira o "+i+"º número: ");
            vetor[i] = scan.nextInt();
        }
    }
    public void imprimirNumeros()
    {
        for (int i = 10; i > 0; i--)
        {
            System.out.println(i+"º número: "+vetor[i]);
        }
    }
    
    public static void main(String args[])
    {
        vetorAoContrario obj = new vetorAoContrario();
        
        obj.inserirNumeros();
        obj.imprimirNumeros();
    }
}
