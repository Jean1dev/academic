package exceptions;

import java.util.Random;

/**
 * Exercicio Exceptions
 *
 * O tamanho do array numeros e definido randomicamente atraves da classe
 * Random. Logo apos a definicao do tamanho do array utilizasse novamente a
 * classe Random para imprimir um elemento do array aleatoriamente. O problema
 * concentra-se nos blocos onde ao iniciar o array gerasse um numero entre 0 e
 * 100 e apos tentasse acessar um elemento aleatorio de 0 a 150. Deve-se
 * garantir que quanto um elemento valido seja selecionado, este seja impresso
 * (Ex.: "Elemento [<indice>]:<valor>"). Caso contrario a seguinte mensagem deve
 * ser impressa: "Indice <indice> invalido!!!"
 *
 * (1) Executar e analisar a exception lancada no bloco de codigo main. 
 * (2) Qual
 * exception esta sendo lancada? ArrayIndexOutOfBoundsException:
 *
 * (3) Porque e em qual linha esta sendo lancanda a exception? Linha 39: devido
 * a .nextInt(150); e o array criado é de tamanho 10
 *
 * (4) Tratar a exception de modo que seja impressa alem da mensagem
 * especificada acima a mensagem "inicio" e "fim". Consideracao: Deve ser
 * tratado o erro referente especificamente a exception lancada
 *
 * (5) Qual ou quais exception(s) foram utilizada(s) no(s) bloco(s) catch para o
 * tratamento?
 *
 */
public class Exercicio1 {

    public static void main(String[] args) {
        System.out.println("Inicio");

        int[] numeros = new int[new Random().nextInt(100)];

        System.out.println("Tamanho array: " + numeros.length);

        try {
            int index;
            index = new Random().nextInt(150);
            
            System.out.println("Elemento [ " + index + " ] : " + numeros[index]);
            System.out.println("fim do try");
        } catch (Exception e) {
            System.out.println("entro no catch");
            System.out.println(e.getMessage());
        }

        System.out.println("Fim");
    }

}
