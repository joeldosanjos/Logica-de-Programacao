package fonte;
import java.util.Scanner;

public class somaImpares {
    
    private int numeros[], soma;
    private Scanner scan;
    public somaImpares()
    {
        numeros = new int[10];
        soma = 0;
        scan = new Scanner(System.in);
    }
    
    public void inseirNumeros()
    {
        
        for (int i = 0; i < 10; i++)
        {
            System.out.println("Insira 10 números:");
            numeros[i] = scan.nextInt();
        }
    }
    public void somarImpares()
    {
        for (int i = 0; i < 10; i++)
        {
            if (numeros[i] % 2 != 0)
            {
                soma = soma + numeros[i];
            }
        }
    }
    public void imprimirSoma()
    {
        System.out.println("A soma dos ímpares é "+soma);
    }
    
    public static void main(String args[])
    {
        somaImpares obj = new somaImpares();
        obj.inseirNumeros();
        obj.somarImpares();
        obj.imprimirSoma();
    }
}
