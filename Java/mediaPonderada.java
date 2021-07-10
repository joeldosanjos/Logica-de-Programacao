package fonte;
import java.util.Scanner;

public class mediaPonderada {
    private double notas[], soma, media;
    private Scanner scan;
    
    public mediaPonderada()
    {
        media = 0;
        soma = 0;
        notas = new double[4];
        scan = new Scanner(System.in);
    }
    
    public void inserirNotas()
    {
        for (int i = 1; i < 5; i++)
        {
            System.out.println("Insira a "+i+"º nota: ");
            notas[i - 1] = scan.nextDouble();
        }
    }
    public void media()
    {
        for (int i = 0; i < 4; i++)
        {
            soma += notas[i];
        }
        media = soma / 4;
    }
    public void imprimirMedia()
    {
        
        if (media < 3)
        {
            System.out.println("\nMédia: "+media);
            System.out.println("Situação: Reprovado");
        }
        else if (media >= 3 && media < 7)
        {
            System.out.println("\nMédia: "+media);
            System.out.println("Situação: Exame");
        }
        else if (media >= 7)
        {
            System.out.println("\nMédia: "+media);
            System.out.println("Situação: Aprovado");
        }
    }
    
    public static void main(String args[])
    {
        mediaPonderada obj = new mediaPonderada();
        
        obj.inserirNotas();
        obj.media();
        obj.imprimirMedia();
    }
}
