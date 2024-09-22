package desafios;

/**
 *  DESAFIO 1
 *  1) Observe o trecho de código abaixo: 
 *  int INDICE = 13, SOMA = 0, K = 0;
 *  Enquanto K < INDICE faça { K = K + 1; SOMA = SOMA + K; }
 *  Imprimir(SOMA);
 *  Ao final do processamento, qual será o valor da variável SOMA?
 *  RESPOSTA: SOMA = 91
*/

public class Desafio1 {
    public static void main(String[] args) {
        int SOMA = 0;
        int K = 0;
        int INDICE = 13;
        while (K < INDICE) {
            K += 1;
            SOMA += K;
        }
        System.out.println(SOMA);
    }
}
