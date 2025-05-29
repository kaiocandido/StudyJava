// ARRAYS

//Permite o armazenmaento em memoria de diversos valores em uma unica variavel
// Os valores armazenados em um array devem ser todos do mesmo tipo
//um array possui o tamanho fixo. Após definir o tamanho de um array, ele não pode ser aumentado, nem diminuido

package modulo2.Arrays;

public class arrays1 {
    public static void main(String[] args) {
        // Declaração e inicialização de um array de inteiros
        int[] numeros = new int[5]; // Array com 5 elementos
        // Atribuindo valores ao array
        numeros[0] = 10;
        numeros[1] = 20;
        numeros[2] = 30;
        numeros[3] = 40;
        numeros[4] = 50;
        // Imprimindo os valores do array
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Número " + (i + 1) + ": " + numeros[i]);
        }
        // DECLARANDO UM ARRAY

        // PRIMEIRA FORMA
        double[] notas;
        // SEGUNDA FORMA
        int idade[];

        // Declarando e inicializando um array

        // PRIMEIRA FORMA
        double[] saldo = new double[5];
        // SEGUNDA FORMA
        int valor[] = new int[10];

        // Declarando e inicializando um array com valores

        // PRIMEIRA FORMA
        String[] nomes = { "João", "Maria", "José", "Ana", "Pedro" };
        // SEGUNDA FORMA
        int numberss[] = { 1, 2, 3, 4, 5 };
    }

}
