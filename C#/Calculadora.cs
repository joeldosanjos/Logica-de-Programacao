using System;

namespace ICalculadora
{
    class Calculadora
    {
        static void Main(string[] args)
        {
            Console.WriteLine("- Calculadora -");

            String opcaoCalculadora; do
            {
                Console.Write("Insira o primeiro valor: ");
                float primeiroValor = float.Parse(Console.ReadLine());
                Console.Write("Insira o segundo valor: ");
                float segundoValor = float.Parse(Console.ReadLine());

                // Criação do objeto utilizado no switch case.
                Calculadora calculadora = new Calculadora();

                String opcaoOperacoes; do
                {
                    Console.WriteLine("\nInsira:");
                    Console.WriteLine("+ para Somar");
                    Console.WriteLine("- para Subtrair");
                    Console.WriteLine("x para Multiplicar");
                    Console.WriteLine("/ para Dividir");
                    Console.WriteLine("S para Sair");

                    Console.Write("\nOpção: ");
                    opcaoOperacoes = Console.ReadLine();

                    switch (opcaoOperacoes)
                    {
                        case "+":
                            int resultado = calculadora.Somar(primeiroValor, segundoValor);
                            Console.WriteLine("\nResultado: " + resultado);
                            break;

                        case "-":
                            resultado = calculadora.Subtrair(primeiroValor, segundoValor);
                            Console.WriteLine("\nResultado: " + resultado);
                            break;

                        case "X":
                        case "x":
                            resultado = calculadora.Multiplicar(primeiroValor, segundoValor);
                            Console.WriteLine("\nResultado: " + resultado);
                            break;

                        case "/":
                            // Variável foi definida como "resultadoFloat" porque ela não pode ser
                            // do tipo int ao receber um retorno do tipo float da função Dividir().
                            float resultadoFloat = calculadora.Dividir(primeiroValor, segundoValor);
                            Console.WriteLine("\nResultado: " + resultadoFloat);
                            break;

                        case "S":
                        case "s":
                            Console.WriteLine("\nOperação encerrada.");
                            break;

                        default:
                            Console.WriteLine("\nComando não reconhecido.");
                            break;
                    }

                } while (opcaoOperacoes != "S" && opcaoOperacoes != "s");

                Console.WriteLine("\nInsira:");
                Console.WriteLine("Qualquer caracter para calcular novamente");
                Console.WriteLine("S para encerrar calculadora");

                Console.Write("\nOpção: ");
                opcaoCalculadora = Console.ReadLine();

            } while (opcaoCalculadora != "S" && opcaoCalculadora != "s");

            // Mensagem exibida após o fim do programa.
            Console.WriteLine("\nCalculadora encerrada.");
        }

        #region Funções
        int Somar ( float primeiroValor, float segundoValor )
        {
            return Convert.ToInt32( primeiroValor + segundoValor );
        }

        int Subtrair (float primeiroValor, float segundoValor )
        {
            return Convert.ToInt32(primeiroValor - segundoValor);
        }

        int Multiplicar (float primeiroValor, float segundoValor )
        {
            return Convert.ToInt32(primeiroValor * segundoValor);
        }
        float Dividir (float primeiroValor, float segundoValor )
        {
            return primeiroValor / segundoValor;
        }

        #endregion
    }
}
