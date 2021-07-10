using System;

namespace Split
{
    class Program
    {
        public void tratamento (string genero)
        {
            if (genero == "M")
            {
                Console.Write("Sr. ");
            }
            else if (genero == "F")
            {
                Console.Write("Sra. ");
            }
        }
        static void Main(string[] args)
        {
            Console.Write("Insira seu nome e sobrenome: ");
            string nome = Console.ReadLine();
            Console.Write("Informe a hora: ");
            int hora = int.Parse(Console.ReadLine());
            Console.Write("Informe seu gênero (M ou F): ");
            string genero = Console.ReadLine();
            
            Program p = new Program();
            string[] v = nome.Split();

            if (hora > 5 && hora < 12)
            {
                Console.Write("\nBom dia ");
                p.tratamento(genero);
                Console.Write(v[0] + " " + v[1]);
            }
            else if (hora > 11 && hora < 18)
            {
                Console.Write("\nBoa tarde ");
                Console.WriteLine(v[0]);
            }
            else
            {
                Console.Write("\nBoa noite ");
                p.tratamento(genero);
                Console.Write(v[1]);
            }
        }
    }
}
