package fonte;
import java.util.Scanner;

public class mediaDiagonalPrimaria {
    private int matriz[][], diagonalPrimaria[];
    private double mediaDiagonalPrimaria;
    private Scanner scan;
    
    public mediaDiagonalPrimaria()
    {
        mediaDiagonalPrimaria = 0;
        diagonalPrimaria = new int[5];
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
    public void calcularMediaDiagonalPrimaria()
    {
        for (int i = 0; i < 5; i++)
        {
            diagonalPrimaria[i] = matriz[i][i];
        } 
        
        for (int x = 0; x < 5; x++)
        {
            mediaDiagonalPrimaria += diagonalPrimaria[x];
        }
        mediaDiagonalPrimaria /= 5;
    }
    public void imprimirMediaDiagonalPrimaria()
    {
        System.out.println("\nA média dos valores da diagonal primária é "+mediaDiagonalPrimaria);
    }
    
    public static void main(String args[])
    {
        mediaDiagonalPrimaria obj = new mediaDiagonalPrimaria();
        
        obj.inserirMatriz();
        obj.calcularMediaDiagonalPrimaria();
        obj.imprimirMediaDiagonalPrimaria();
    }
}
