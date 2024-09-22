package desafios;

/**
 * DESAFIO 2:
 * 2) Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor
 * sempre será a soma dos 2 valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8,
 * 13, 21, 34...), escreva um programa na linguagem que desejar onde, informado
 * um número, ele calcule a sequência de Fibonacci e retorne uma mensagem
 * avisando se o número informado pertence ou não a sequência.
 * 
 * IMPORTANTE: Esse número pode ser informado através de qualquer entrada de sua
 * preferência ou pode ser previamente definido no código;
 */

public class Desafio2 {
    public static void main(String[] args) {

        int numero = 22;

        int elemento1 = 0;
        int elemento2 = 1;
        int aux = 0;

        String msg = "não pertence";
        while (true) {

            aux = elemento1 + elemento2;
            elemento1 = elemento2;
            elemento2 = aux;

            if (numero == 1) {
                msg = "pertence";
                break;
            } else if (elemento1 == numero || elemento2 == numero) {
                msg = "pertence";
                break;
            } else if (elemento1 > numero || elemento2 > numero) {
                break;
            }
        }
        System.out.println(numero + " " +  msg + " a sequencia de Fibonacci");
    }
}
