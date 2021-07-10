package fonte;

import java.util.Scanner;

public class vetorSomaMedia {
    private double vetor[], soma, media;
    private Scanner scan;
    
    public vetorSomaMedia()
    {
        soma = 0;
        media = 0;
        vetor = new double[10];
        scan = new Scanner(System.in);
    }
    
    public void inserirNumeros()
    {
        for (int i = 1; i < 11; i++)
        {
            System.out.println("Insira o "+i+"º número: ");
            vetor[i - 1] = scan.nextInt();
        }
    }
    public void somaEMedia()
    {
        for (int i = 0; i < 10; i++)
        {
            soma += vetor[i];
        }
        media = soma / 10;
    }
    public void imprimirSomaMedia()
    {
        System.out.println("\nSoma total: "+soma);
        System.out.println("\nMédia total: "+media);
    }
    
    public static void main(String args[])
    {
        vetorSomaMedia obj = new vetorSomaMedia();
        
        obj.inserirNumeros();
        obj.somaEMedia();
        obj.imprimirSomaMedia();
    }
}
