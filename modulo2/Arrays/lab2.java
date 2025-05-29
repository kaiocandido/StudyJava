/*
A - Criando a estrutura do projeto e a classe principal
1.  Crie  um  projeto  denominado  Aula1Lab02  e  uma  classe  nesse  projeto,  de  nome  Aula1_Lab2, com o método main declarado em seu interior;
2. Dentro do método main, crie uma estrutura de decisão if, que faça a verificação do tamanho do array args: Se for maior que zero, entraremos com a lógica a seguir, caso não seja maior que  zero,  
imprima  na  tela  uma  mensagem  de  erro  e  auxílio  do  tipo:  “Entre  com  valores  válidos para as idades”;
3. Dentro do corpo do if que validou o tamanho do array como maior do que zero, crie uma variável local chamada soma, de tipo int, e inicialize-a com zero;
4. Ainda nesse bloco, crie um laço for para iterar nos elementos desse array, somando cada um ao anterior, acumulando esse valor na variável soma:soma += Integer.parseInt(args[i]);
5. Após o fechamento do corpo deste laço, declare outra variável local adequada para guardar a média dos valores e calcule-a, usando a variável soma já calculada e 
o comprimento do array como parâmetro final;
6. Exiba na tela o resultado da média conforme a saída a seguir
*/

package modulo2.Arrays;

public class lab2 {
    public static void main(String[] args) {

        int numbersArr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        if (numbersArr.length > 0) {
            int soma = 0;
            for (int i = 0; i < numbersArr.length; i++) {
                soma += numbersArr[i];
            }
            int media = soma / numbersArr.length;
            System.out.println("A media é:" + media + "Sendo a soma: " + soma);
        } else {
            System.out.println("“Entre  com  valores  válidos para as idades”");
        }
    }
}
