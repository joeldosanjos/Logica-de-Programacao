package fonte;
import java.util.Scanner;

public class classificarPeso {
    
    private double altura, peso;
    private String sexo;
    private Scanner scan;
    public classificarPeso()
    {
        altura = 0;
        peso = 0;
        scan = new Scanner(System.in);
    }
    
    public void inserirDados()
    {
        System.out.println("Sexo (escreva M ou F):");
        sexo = scan.nextLine();
        System.out.println("Altura:");
        altura = scan.nextDouble();
    }
    public void calcularPeso()
    {
        switch(sexo)
        {
            case "M":
                peso = (72.7 * altura) - 58;
                break;
            case "F":
                peso = (62.1 * altura)-44.7;
                break;
            default:
                System.out.println("Sexo não detectado. Insira M ou F.");
        }
    }
    public void imprimirPeso()
    {
        System.out.println("Seu peso ideal é "+peso);
    }
    
    public static void main(String args[])
    {
        classificarPeso obj = new classificarPeso();
        
        obj.inserirDados();
        obj.calcularPeso();
        obj.imprimirPeso();
    }
}
