package exceptions;

/**
 * Exercicio Exceptions
 *
 * (1) Executar e analisar a exception lancada no bloco de codigo main. (2) Qual
 * ou quais exceptions estao sendo lancadas? ArithmeticException
 *
 * (3) Porque e em qual ou quais linhas estao sendo lancandas as exceptions? na
 * linha 44 estava sendo executada uma divisao por 0, tratado exception com try catch
 *
 * (4) Tratar a(s) exception(s) lancada(s) de modo que sejam impressas as
 * mensagens relacionadas abaixo independentemente das exceptions: Consideracao:
 * Deve ser tratado o erro referente especificamente a exception lancada
 *
 * Inicio byte int 1 int 2 long Fim
 *
 * (5) Qual ou quais exception(s) foram utilizada(s) no(s) bloco(s) catch para o
 * tratamento?
 *
 */
public class Exercicio3 {

    public static void main(String[] args) {
        System.out.println("Inicio");

        String nome = null;

        System.out.println("Nome: esta vazio ");

        System.out.println("byte");
        byte b = (byte) 12345;

        System.out.println("int 1");
        int i = 0;

        System.out.println("int 2");
        try {
            int j = (int) b / (int) i;
        } catch (ArithmeticException a) {
            System.out.println("erro de logica aritimetica");
        }
        

        System.out.println("long");
        long l = 8;

        System.out.println("Fim");
    }

}
