/*
    A – Verificando se um número é par ou ímpar1.
    1.Crie uma classe e insira a estrutura básica de um programa Java;
    2. Declare uma variável do tipo int com o nome valor e atribua um valor;
    3. Usando o operador ternário, verifique se o número é par ou ímpar e imprima na tela;
    4. Compile e execute o programa.O resultado deve ser como o exibido a seguir:
 */


public class laboratory2 {
    public static void main(String[] args) {
        int valor = 13;
        int result = valor % 2;
        System.out.println(result == 0 ? "par" : "impar");
    }
}
