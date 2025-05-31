package Calculadora;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Operacoes operacoes = new Operacoes();
        Scanner in = new Scanner(System.in);

        System.out.println("Escolha uma operação:\n1- Soma\n2- Subtração\n3- Multiplicação\n4- Divisão ");
        int perguntaOp = in.nextInt();

        System.out.println("Digite um numero: ");
        int pergunta1 = in.nextInt();
        System.out.println("Digite outro numero: ");
        int pergunta2 = in.nextInt();

        switch (perguntaOp){

            case 1 : {
                int resultado = operacoes.soma(pergunta1, pergunta2);
                System.out.printf("%d + %d = %d", pergunta1, pergunta2, resultado);
                break;
            }
            case 2: {
                int resultado = operacoes.subtracao(pergunta1, pergunta2);
                System.out.printf("%d - %d = %d", pergunta1, pergunta2, resultado);
                break;
            }
            case 3: {
                int resultado = operacoes.multiplicacao(pergunta1, pergunta2);
                System.out.printf("%d X %d = %d", pergunta1, pergunta2, resultado);
                break;
            }
            case 4: {
                int resultado = operacoes.divisao(pergunta1, pergunta2);
                System.out.printf("%d / %d = %d", pergunta1, pergunta2, resultado);
                break;
            }
        }
    }
}
