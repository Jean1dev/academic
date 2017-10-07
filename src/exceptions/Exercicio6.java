package exceptions;

import java.util.Random;

/**
 * Exercicio Exceptions
 *
 * O tamanho do array numeros e definido randomicamente atraves da classe Random.
 * Logo apos a definicao do tamanho do array utilizasse novamente a classe Random para 
 *   imprimir um elemento do array aleatoriamente.
 * O problema concentra-se nos blocos onde ao iniciar o array gerasse um numero entre 0 e 100
 *   e apos tentasse acessar um elemento aleatorio de 0 a 150.
 * Deve-se garantir que quanto um elemento valido seja selecionado, este seja impresso (Ex.: "Elemento [<indice>]:<valor>").
 * 
 * Outro erro pode surgir na chamada do metodo toString() para o elemento do array s.
 *
 * (1) Tratar as exceptions individualmente imprimindo sua stack trace.
 *
 * (2) Independente do lancamento ou nao de qualquer exceptions a mensagem "fim" deve ser impressa.
 *
 */
public class Exercicio6 {
    
    
    public static void main(String[] args) {
        System.out.println("Inicio");
        
        int[] numeros = new int[new Random().nextInt(100)];
        System.out.println("Tamanho array: " + numeros.length);
        
        int index = new Random().nextInt(150);
        System.out.println("Indice: " + index);
        
        System.out.println("Elemento [ " + index + " ] : " + numeros[index]);
        
        String s[] = new String[2];
        s[0] = "abc";
        index = new Random().nextInt(2);
        System.out.println(s[index].toString());
        
        int i = index / 0;
        
        System.out.println("Fim");
    }
    
}
