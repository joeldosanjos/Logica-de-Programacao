package fonte;
import java.util.Scanner;

public class diagonalPrincipalSecundaria {
    private int matriz[][];
    private Scanner scan;
    
    public diagonalPrincipalSecundaria()
    {
        matriz = new int[5][5];
        scan = new Scanner(System.in);
    }
    
    public void inserirMatriz()
    {
        for (int i = 0; i < 5; i++)
        {
            for (int x = 0; x < 5; x++)
            {
                System.out.println("Coluna "+(x+1)+" Linha "+(i+1)+":");
                matriz[i][x] = scan.nextInt();
            }
        }
    }
    public void imprimirDiagonais()
    {
        System.out.println("- Diagonal Principal -");
        for (int i = 0; i < 5; i++)
        {
            System.out.println(matriz[i][i]);
        } 
        
        System.out.println("\n- Diagonal Secundária -");
        for (int x = 0; x < 5; x++)
        {
            int j = 4;
            System.out.println(matriz[x][j - x]);
        } 
    }
    
    public static void main(String args[])
    {
        diagonalPrincipalSecundaria obj = new diagonalPrincipalSecundaria();
        
        obj.inserirMatriz();
        obj.imprimirDiagonais();
    }
}
