using System;

namespace Calculo_Salario
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("----------------------- SISTEMA PARA CÁLCULO DE SALÁRIO -----------------------");
            Console.WriteLine("Bem-vindo, usuário. A seguir, insira algumas informações acerca do funcionário:\n");

            string opcao; do
            {
                Console.Write("* Número de matrícula: ");
                int matricula = int.Parse(Console.ReadLine());
                Console.Write("* Quantidade de horas trabalhadas: ");
                float horasTrabalhadas = float.Parse(Console.ReadLine());
                Console.Write("* Remuneração por hora: ");
                float salarioHoras = float.Parse(Console.ReadLine());

                float salarioTotal = horasTrabalhadas * salarioHoras;

                Console.WriteLine("\nO salário que este funcionário receberá é de {0:F2}", salarioTotal);
                Console.WriteLine("\nDeseja realizar a operação novamente? (Aperte ENTER para continuar ou S para sair)");
                opcao = Console.ReadLine();
            } while (opcao != "S" && opcao != "s");
            Console.WriteLine("\nSistema encerrado.");
        }
    }
}
