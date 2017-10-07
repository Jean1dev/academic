package exceptions;

import java.util.Random;

/**
 * Exercicio Exceptions
 *
 * O tamanho do array numeros e definido randomicamente atraves da classe
 * Random. Logo apos a definicao do tamanho do array utilizasse novamente a
 * classe Random para popular os elementos com valores randomicos.
 *
 * (1) Executar e analisar a exception lancada no bloco de codigo main. (2) Qual
 * exception esta sendo lancada?
 *
 *
 * (3) Porque e em qual linha esta sendo lancanda a exception?
 *  erro nessa linha   for (int i = 0; i <= numeros.length; i++) é devido ao sinal " <="
 *
 * (4) Tratar a exception de modo que seja impressa a mensagem "inicio" e "fim".
 * Consideracao: Deve ser tratado o erro referente especificamente a exception
 * lancada
 *
 * (5) Qual ou quais exception(s) foram utilizada(s) no(s) bloco(s) catch para o
 * tratamento?
 *
 */
public class Exercicio2 {

    public static void main(String[] args) {
        System.out.println("Inicio");

        int[] numeros = new int[new Random().nextInt(100)];
        for(int i: numeros){
            numeros[i] = new Random().nextInt(100);
            System.out.println(numeros[i]);
        }

        try {
            for (int i = 0; i <= numeros.length; i++) {
                numeros[i] = new Random().nextInt(100);
            }
        } catch (Exception e) {
            System.out.println("caiu aki");
        }

        System.out.println("Fim");
    }

}
