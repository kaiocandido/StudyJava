
/*
    A – Somando dois valores e mostrando o resultado
    1. Crie uma classe e insira a estrutura básica de um programa Java;
    2. Declare três variáveis do tipo int com os nomes valor1, valor2 e resultado;
    . Atribua valores para as variáveis valor1 e valor2;
    4. Atribua o resultado da soma das variáveis valor1 e valor2 na variável resultado;
    5. Imprima o resultado na tela;
    6. Compile e execute o programa.O resultado deve ser como o exibido a seguir
 */

public class laboratorio1 {
    public static void main(String[] args) {
        int valor1;
        int valor2;
        int resultado;

        valor1 = 10;
        valor2 = 14;

        resultado = valor1 + valor2;
        
        System.out.println("Resultado: " + resultado);
    }
}
