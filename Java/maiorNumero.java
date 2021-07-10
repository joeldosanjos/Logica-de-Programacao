package fonte;
import java.util.Scanner;

public class maiorNumero {
    
    private int numero, maiorNumero;
    private Scanner scan;
    
    public maiorNumero()
    {
        numero = 0;
        maiorNumero = 0;
        scan = new Scanner(System.in);
    }
    
    public void inserirPrimeiroNumero()
    {
        System.out.println("Insira o 1º numero: ");
        numero = scan.nextInt();
        maiorNumero = numero;
    }
    public void calcularMaiorNumero()
    {
        for (int i = 2; i < 11; i++)
        {
            System.out.println("Insira o "+i+"º número: ");
            numero = scan.nextInt();
            
            if (numero > maiorNumero)
            {
                maiorNumero = numero;
            }
        }
    }
    public void imprimirMaiorNumero()
    {
        System.out.println("\nO maior número é "+maiorNumero);
    }
    
    public static void main(String args[])
    {
        maiorNumero obj = new maiorNumero();
        
        obj.inserirPrimeiroNumero();
        obj.calcularMaiorNumero();
        obj.imprimirMaiorNumero();
    }
}
