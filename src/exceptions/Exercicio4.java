package exceptions;

import java.util.Random;

/**
 * Exercicio Exceptions
 *
 * (1) Executar e analisar a exception lancada no bloco de codigo main.
 * (2) Garantir que a mensagem "fim" seja impressa independente de ser lancada
 *  ou nao exception no bloco try.
 *
  */
public class Exercicio4 {
    
    
    public static void main(String[] args) {
        System.out.println("Inicio");
        
        String nome = null;
        
        try {
            System.out.println("Nome: " + nome.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException");
            return;
        }
        
        System.out.println("Fim");
        
    }
    
}
