package fonte;
import java.util.Scanner;

public class maiorValorDiagonalSecundaria {
    private int matriz[][], diagonalSecundaria[], maiorValorDiagonalSecundaria;
    private Scanner scan;
    
    public maiorValorDiagonalSecundaria()
    {
        maiorValorDiagonalSecundaria = 0;
        diagonalSecundaria = new int[5];
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
    public void calcularMaiorValorDiagonalSecundaria()
    {
        for (int i = 0; i < 5; i++)
        {
            int j = 4;
            diagonalSecundaria[i] = matriz[i][j - i];
        } 
        
        maiorValorDiagonalSecundaria = diagonalSecundaria[0];
        for (int x = 0; x < 5; x++)
        {
            if (diagonalSecundaria[x] > maiorValorDiagonalSecundaria)
            {
                maiorValorDiagonalSecundaria = diagonalSecundaria[x];
            }
        }
    }
    public void imprimirMaiorValorDiagonalSecundaria()
    {
        System.out.println("O maior valor da diagonal secundária é "+maiorValorDiagonalSecundaria);
    }
    
    public static void main(String args[])
    {
        maiorValorDiagonalSecundaria obj = new maiorValorDiagonalSecundaria();
        
        obj.inserirMatriz();
        obj.calcularMaiorValorDiagonalSecundaria();
        obj.imprimirMaiorValorDiagonalSecundaria();
    }
}
