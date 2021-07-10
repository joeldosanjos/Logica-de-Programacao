package fonte;
import java.util.Scanner;
// Author: Joel dos Anjos - joeel@outlook.com

public class somaSalario {
    
    private double salario, soma;
    private Scanner scan;
    public somaSalario()
    {
        salario = 0;
        soma = 0;
        scan = new Scanner(System.in);
    }
    
    public void inserirSalario()
    {
        System.out.println("Insira seu salário: ");
        salario = scan.nextDouble();
    }
    public void somarSalario()
    {
        soma = salario * 0.25;
        salario = salario + soma;
    }
    public void imprimirSalario()
    {
        System.out.println("Seu salário com aumento é: "+salario);
    }
    
    public static void main(String args[])
    {
        somaSalario scan = new somaSalario();
        
        scan.inserirSalario();
        scan.somarSalario();
        scan.imprimirSalario();
    }
}
