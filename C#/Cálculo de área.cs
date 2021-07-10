using System;

namespace Calculo_Area
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("-------------------- SISTEMA PARA CÁLCULO DE ÁREA --------------------");
            Console.Write("\nInsira o valor de A: ");
            float a = float.Parse(Console.ReadLine());
            Console.Write("Insira o valor de B: ");
            float b = float.Parse(Console.ReadLine());
            Console.Write("Insira o valor de C: ");
            float c = float.Parse(Console.ReadLine());

            string opcao; do
            {
                Console.WriteLine("\n----------------------------------------");
                Console.WriteLine("Selecione alguma das opções para calcular");
                Console.WriteLine("----------------------------------------");
                Console.WriteLine("A para área do triângulo retângulo que tem A por base e C por altura;");
                Console.WriteLine("B para área do círculo de raio C;");
                Console.WriteLine("C para área do trapézio que tem A e B por bases e C por altura;");
                Console.WriteLine("D para área do quadrado que tem lado B;");
                Console.WriteLine("E para área do retângulo que tem lados A e B;");
                Console.WriteLine("S para encerrar o programa.");
                Console.Write("\nOpção: ");
                opcao = Console.ReadLine();

                switch(opcao)
                {
                    case "A":
                    case "a":
                        double resultado = (a * c) / 2;
                        Console.WriteLine("\nResultado: {0:F2}",resultado);
                        break;

                    case "B":
                    case "b":
                        resultado = 3.14159 * Math.Pow(c, 2.0);
                        Console.WriteLine("\nResultado: {0:F2}", resultado);
                        break;

                    case "C":
                    case "c":
                        resultado = ((a + b) * c) / 2;
                        Console.WriteLine("\nResultado: {0:F2}", resultado);
                        break;

                    case "D":
                    case "d":
                        resultado = b * b;
                        Console.WriteLine("\nResultado: {0:F2}", resultado);
                        break;

                    case "E":
                    case "e":
                        resultado = a * b;
                        Console.WriteLine("\nResultado: {0:F2}", resultado);
                        break;

                    case "S":
                    case "s":
                        Console.WriteLine("\nPrograma encerrado.");
                        break;

                    default:
                        Console.WriteLine("\nComando inválido.");
                        break;
                }

            } while (opcao != "S" && opcao != "s");
        }
    }
}
