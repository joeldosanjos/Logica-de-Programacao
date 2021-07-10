package fontes;
import java.util.Scanner;
public class calculadora 
{
    private double n1,n2,res;
    private Scanner s;
    
    public calculadora()
    {
        s = new Scanner(System.in);
        n1=0;
        n2=0;
        res=0;
    }
    
    public void lerDados()
    {
        System.out.println("Informe n1..:");
        n1 = s.nextDouble();
        System.out.println("Informe n2..:");
        n2 = s.nextDouble();
    }
    public void somar()
    {
        res = n1 + n2;
    }
    public void subtrair()
    {
        res = n1 - n2;
    }
    public void multiplicar()
    {
        res = n1 * n2;
    }
    public void dividir()
    {
        res = n1 / n2;
    }
    public void imprimir()
    {
        System.out.println("Resultado: "+res);
    }
    public static void main(String args[])
    {
        calculadora obj = new calculadora();
        obj.lerDados();
        obj.somar();
        obj.imprimir();
        obj.subtrair();
        obj.imprimir();
        obj.multiplicar();
        obj.imprimir();
        obj.dividir();
        obj.imprimir();
    }
}
