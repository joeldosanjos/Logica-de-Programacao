using System;

namespace Raiz_Quadrada
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.Write("Insira A: ");
            double a = double.Parse(Console.ReadLine());
            Console.Write("Insira B: ");
            double b = double.Parse(Console.ReadLine());
            Console.Write("Insira C: ");
            double c = double.Parse(Console.ReadLine());

            double delta = Math.Pow(b, 2.0) - 4.0 * a * c;

            if (delta > 0)
            {
                double x1 = (-b + Math.Sqrt(delta)) / (2.0 * a);
                double x2 = (-b - Math.Sqrt(delta)) / (2.0 * a);

                Console.WriteLine("\nDelta: " + delta);
                Console.WriteLine("X1: " + x1);
                Console.WriteLine("X2: " + x2);
            }
            else
            {
                Console.WriteLine("\nDelta {0} é negativo. Não é possível calcular raíz quadrada.", delta);
            }
        }
    }
}
