package fonte;
import java.util.Scanner;

public class tabuada {
    
    private int n, x;
    private Scanner scan;
    public tabuada()
    {
        n = 0;
        x = 0;
        scan = new Scanner(System.in);
    }
    
    public void inserirN()
    {
        System.out.println("Insira o número da tabuada:");
        n = scan.nextInt();
    }
    public void calcularTabuada()
    {
        for (int i = 0; i <= n; i++)
        {
            x = i * n;
            System.out.println(""+x);
            x = 0;
        }
    }
    
    public static void main(String args[])
    {
        tabuada obj = new tabuada();
        obj.inserirN();
        obj.calcularTabuada();
    }
}
