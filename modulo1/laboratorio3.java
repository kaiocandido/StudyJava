/*
 * 
 * A – Verificando se um número é primoVamos criar um programa que verifica se um número é primo. Lembre-se de que um número primo só é divisível por 1 e por ele mesmo.
 * 1. Crie uma classe e insira a estrutura básica de um programa Java;
 * 2. Declare duas variáveis do tipo int com os nomes numero e divisoes e atribua um valor para numero e 0 para divisoes;
 * 3.  Crie  um  laço  de  repetição  for  com  uma  variável  declarada  e  iniciada  em  1  e  que  rode  enquanto ela for menor que a variável numero, incrementando a variável a cada iteração;
 * 4. Dentro do for, verifique se o módulo entre a variável i e a variável numero é igual a 0. Caso seja verdadeiro, incremente a variável divisoes;
 * 5. Logo após a estrutura de repetição for, verifique se a variável divisoes é menor ou igual a 2. Caso seja verdadeiro, imprima que o número é primo; caso contrário, imprima que não é primo;
 * 6. Compile e execute o programa:

 */


public class laboratorio3 {
    public static void main(String[] args) {
        int numero = 4;
        int divisoes = 0;

        for (int i = 1; i < numero; i++) {
            if(numero % i == 0 ){
                divisoes ++;
            }else if (divisoes == 2) {
                System.out.println("Numero é PRIMO");
            }else{
                System.out.println("Numero NÃO É PRIMO");
            }
        }

    }
}
