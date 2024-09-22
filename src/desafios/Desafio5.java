package desafios;

import java.util.Scanner;
import java.util.Stack;

/**
 * 5) Escreva um programa que inverta os caracteres de um string.
 * 
 * IMPORTANTE:
 * a) Essa string pode ser informada através de qualquer entrada de sua
 * preferência ou pode ser previamente definida no código;
 * b) Evite usar funções prontas, como, por exemplo, reverse
 */

public class Desafio5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite uma frase: ");
        String str = scan.nextLine();
        scan.close();

        byte[] letras = str.getBytes();
        
        Stack<Byte> letrasInversas = new Stack<>();
        for (int i = 0; i < letras.length; i++) {
            letrasInversas.add(letras[i]);
        }
        
        int tamanho = letrasInversas.size();
        letras = new byte[tamanho];
        for (int i = 0; i < tamanho; i ++) {
            letras[i] = letrasInversas.pop();
        }

        str = new String(letras);
        System.out.println(str);
    }
}
