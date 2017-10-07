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
 * (1) Criar uma exception estendendo a classe Exception denominada IndiceInvalidoException para tratamento de indices invalidos.
 *
 * (2) Tratar o indice gerado verificando se o mesmo e maior que o tamanho do array.
 *  Caso seja maior disparar a exception criada.
 *
  */
public class Exercicio5 {
    
    
    public static void main(String[] args) {
        System.out.println("Inicio");
        
        int[] numeros = new int[new Random().nextInt(100)];
        System.out.println("Tamanho array: " + numeros.length);
        
        int index = new Random().nextInt(150);
        System.out.println("Indice: " + index);
        
        System.out.println("Elemento [ " + index + " ] : " + numeros[index]);
        
        System.out.println("Fim");
    }
    
}
