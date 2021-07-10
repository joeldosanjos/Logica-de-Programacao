package fonte;

import java.util.Scanner;

public class maiorQue50 {
    private int numero, maioresQue50;
    private Scanner scan;
    
    public maiorQue50()
    {
        numero = 0;
        maioresQue50 = 0;
        scan = new Scanner(System.in);
    }
    
    public void inserirNumeros()
    {
        for (int i = 1; i < 21; i++)
        {
            System.out.println("Insira o "+i+"º número: ");
            numero = scan.nextInt();
            
            if (numero > 50)
            {
                maioresQue50++;
            }
        }
    }
    public void imprimirMaiorNumeros()
    {
        System.out.println("\nVocê inseriu "+maioresQue50+" número(s) maior(es) que 50.");
    }
    
    public static void main(String args[])
    {
        maiorQue50 obj = new maiorQue50();
        
        obj.inserirNumeros();
        obj.imprimirMaiorNumeros();
    }
}
