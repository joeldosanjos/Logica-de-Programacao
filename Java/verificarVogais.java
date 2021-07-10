package fonte;
import java.util.Scanner;

public class verificarVogais {
    private String caracter[];
    private int totalVogais;
    private Scanner scan;
    
    public verificarVogais()
    {
        totalVogais = 0;
        caracter = new String[15];
        scan = new Scanner(System.in);
    }
    
    public void inserirCaracteres()
    {
        for (int i = 1; i < 16; i++)
        {
            System.out.println("Insira o "+i+"º caracter: ");
            caracter[i - 1] = scan.nextLine();
        }
    }
    public void vogais()
    {
        for (int i = 0; i < 15; i++)
        {
            if ("a".equals(caracter[i]) || "e".equals(caracter[i]) || "i".equals(caracter[i]) || "o".equals(caracter[i]) || "u".equals(caracter[i]))
            {
                totalVogais++;
            }
        }
    }
    public void imprimirQuantidadeVogais()
    {
        
        System.out.println("\nTotal de vogais: "+totalVogais);
    }
    
    public static void main(String args[])
    {
        verificarVogais obj = new verificarVogais();
        
        obj.inserirCaracteres();
        obj.vogais();
        obj.imprimirQuantidadeVogais();
    }
}
