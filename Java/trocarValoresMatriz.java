package fonte;
import java.util.Scanner;

public class trocarValoresMatriz {
    private int matriz[][], linha[], coluna[];
    private Scanner scan;
    
    public trocarValoresMatriz()
    {
        coluna = new int[4];
        linha = new int[4];
        matriz = new int[4][4];
        scan = new Scanner(System.in);
    }
    
    public void inserirMatriz()
    {
        for (int i = 0; i < 4; i++)
        {
            for (int x = 0; x < 4; x++)
            {
                System.out.println("Coluna "+(x+1)+" Linha "+(i+1)+":");
                matriz[i][x] = scan.nextInt();
            }
        }
    }
    public void lerMatriz()
    {
        for (int i = 0; i < 4; i++)
        {
            linha[i] = matriz[0][i];
        } 
        
        for (int x = 0; x < 4; x++)
        {
            coluna[x] = matriz[x][3];
        }
    }
    public void trocarPosicao()
    {
        for (int i = 0; i < 4; i++)
        {
            matriz[0][i] = coluna[i];
        }
        for (int x = 0; x < 4; x++)
        {
            matriz[x][3] = linha[x];
        }
    }
    public void imprimirMatriz()
    {
        System.out.println("\n- Matriz Modificada -");
        System.out.println(matriz[0][0]+" - "+matriz[0][1]+" - "+matriz[0][2]+" - "+matriz[0][3]
                           +"\n"+matriz[1][0]+" - "+matriz[1][1]+" - "+matriz[1][2]+" - "+matriz[1][3]
                           +"\n"+matriz[2][0]+" - "+matriz[2][1]+" - "+matriz[2][2]+" - "+matriz[2][3]
                           +"\n"+matriz[3][0]+" - "+matriz[3][1]+" - "+matriz[3][2]+" - "+matriz[3][3]);
    }
    
    public static void main(String args[])
    {
        trocarValoresMatriz obj = new trocarValoresMatriz();
        
        obj.inserirMatriz();
        obj.lerMatriz();
        obj.trocarPosicao();
        obj.imprimirMatriz();
    }
}
