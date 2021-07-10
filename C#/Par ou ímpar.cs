using System;

namespace _3_
{
    class Program
    {
        static void Main(string[] args)
        {
            int numero;
            numero = Convert.ToInt32(Console.ReadLine());

            if (numero % 2 == 0)
            {
                Console.WriteLine("Número é par.");
            }
            else
            {
                Console.WriteLine("Número é ímpar.");
            }
        }
    }
}
