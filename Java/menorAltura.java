package fonte;
import java.util.Scanner;

public class menorAltura {
    private double altura[], menorAltura;
    private Scanner scan;
    
    public menorAltura()
    {
        altura = new double[20];
        menorAltura = 0;
        scan = new Scanner(System.in);
    }
    
    public void inserirAlturas()
    {
        for (int i = 1; i < 21; i++)
        {
            System.out.println("Insira a altura da "+i+"º pessoa: ");
            altura[i - 1] = scan.nextDouble();
        }
    }
    public void verificarMenorAltura()
    {
        menorAltura = altura[0];
        for (int i = 1; i < 20; i++)
        {
            if (altura[i] < menorAltura)
            {
                menorAltura = altura[i];
            }
        }
    }
    public void imprimirMenorAltura()
    {
        System.out.println("\nMenor altura: "+menorAltura);
    }
    
    public static void main(String args[])
    {
        menorAltura obj = new menorAltura();
        
        obj.inserirAlturas();
        obj.verificarMenorAltura();
        obj.imprimirMenorAltura();
    }
}
