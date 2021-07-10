package fonte;
import java.util.Scanner;

public class matrizMenorMaior {
    private int matriz[][], maior, menor, maiorI, maiorX, menorI, menorX;
    private Scanner scan;
    
    public matrizMenorMaior()
    {
        maior = 0;
        menor = 0;
        maiorI = 0;
        maiorX = 0;
        menorI = 0;
        menorX = 0;
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
    public void armazenarValorMenorMaior()
    {
        maior = matriz[0][0];
        menor = matriz[0][0];
        for (int i = 0; i < 5; i++)
        {
            for (int x = 0; x < 5; x++)
            {
                if (matriz[i][x] < menor)
                {
                    menor = matriz[i][x];
                }
                else if (matriz[i][x] > maior)
                {
                    maior = matriz[i][x];
                }
            }
        } 
    }
    public void buscarPosicao()
    {
        for (int i = 0; i < 5; i++)
        {
            for (int x = 0; x < 5; x++)
            {
                if (matriz[i][x] == maior)
                {
                    maiorI = i + 1;
                    maiorX = x + 1;
                }
                else if (matriz[i][x] == menor)
                {
                    menorI = i + 1;
                    menorX = x + 1;
                }
            }
        } 
    }
    public void imprimirParesImpares()
    {
        System.out.println("\nPosição do maior valor - Coluna "+maiorX+" Linha "+maiorI);
        System.out.println("Posição do menor valor - Coluna "+menorX+" Linha "+menorI);
    }
    
    public static void main(String args[])
    {
        matrizMenorMaior obj = new matrizMenorMaior();
        
        obj.inserirMatriz();
        obj.armazenarValorMenorMaior();
        obj.buscarPosicao();
        obj.imprimirParesImpares();
    }
}
