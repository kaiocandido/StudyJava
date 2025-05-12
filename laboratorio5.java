/*
 * A – Exibindo os anos das Copas do MundoVamos criar um programa que imprime na tela todos os anos em que houve Copa do Mundo de Futebol.
 * . Crie uma classe e insira a estrutura básica de um programa Java;
 * 2. Utilize a estrutura for, declarando a variável inteira ano e inicializando com o valor 1930(ano da primeira Copa do Mundo).
 *  Essa variável deverá ser incrementada de 4 em 4 (período entre as copas) até atingir o ano atual;
 * 3. Dentro do loop realizado no passo anterior, crie uma estrutura condicional if utilizada para desconsiderar  as  iterações  quando  ano  for  
 * igual  a  1942  ou  1946  (anos  em  que  não  houve  copa do mundo devido à Segunda Guerra). 
 * Em outras palavras, se o ano for 1942 ou 1946, interrompa a iteração e vá para a próxima (use a instrução continue);
 * 4. Imprima cada um dos anos de Copa do Mundo.O resultado deverá ser semelhante a este:
 */

public class laboratorio5 {
    public static void main(String[] args) {
        for (int i = 1930;  i <= 2025; i +=4) {
            if(i == 1942 || i == 1946){
                continue;
            }
            System.out.println(i);
        }
    }
}
