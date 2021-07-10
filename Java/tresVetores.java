package fonte;
import java.util.Scanner;

public class tresVetores {
    private int primeiroVetor[], segundoVetor[], terceiroVetor[];
    private Scanner scan;
    
    public tresVetores()
    {
        primeiroVetor = new int[10];
        segundoVetor = new int[10];
        terceiroVetor = new int[20];
        scan = new Scanner(System.in);
    }
    
    public void inserirVetores()
    {
        for (int i = 1; i < 11; i++)
        {
            System.out.println("Insira o "+i+"º numero do 1º vetor: ");
            primeiroVetor[i - 1] = scan.nextInt();
        }
        for (int i = 1; i < 11; i++)
        {
            System.out.println("Insira o "+i+"º numero do 2º vetor: ");
            segundoVetor[i - 1] = scan.nextInt();
        }
    }
    public void inseirNoTerceiroVetor()
    {
        for (int i = 0; i < 10; i++)
        {
            terceiroVetor[i] = primeiroVetor[i];
        }
        for (int i = 10; i < 20; i++)
        {
            terceiroVetor[i] = segundoVetor[i - 10];
        }
    }
    public void imprimirTerceiroVetor()
    {
        System.out.println("\nTerceiro vetor:");
        for (int i = 0; i < 20; i++)
        {
            System.out.println(terceiroVetor[i]);
        }
    }
    
    public static void main(String args[])
    {
        tresVetores obj = new tresVetores();
        
        obj.inserirVetores();
        obj.inseirNoTerceiroVetor();
        obj.imprimirTerceiroVetor();
    }
}
