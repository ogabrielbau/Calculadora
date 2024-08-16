import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("======CALCULADORA======");
        System.out.println("| Operações possíveis |");
        System.out.println("|  1 - ADIÇÃO         |");
        System.out.println("|  2 - SUBTRAÇÃO      |");
        System.out.println("|  3 - MULTIPLICAÇÃO  |");
        System.out.println("|  4 - DIVISÃO        |");
        System.out.println("=======================");

        System.out.print("Digite o primeiro valor: ");
        double valor1 = scanner.nextDouble();

        System.out.print("Digite o segundo valor: ");
        double valor2 = scanner.nextDouble();

        System.out.print("Escolha a operação (1/2/3/4): ");
        int operacaoEscolhida = scanner.nextInt();

        Operacoes operacoes = new Operacoes(valor1, valor2);

        double resultado = 0;
        switch (operacaoEscolhida) {
            case 1:
                resultado = operacoes.adicao();
                break;
            case 2:
                resultado = operacoes.subtracao();
                break;
            case 3:
                resultado = operacoes.multiplicacao();
                break;
            case 4:
                resultado = operacoes.divisao();
                break;
            default:
                System.out.println("Operação inválida!");
                return;
        }

        System.out.println("O resultado da operação é: " + resultado);
    }
}