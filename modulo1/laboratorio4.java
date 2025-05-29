/*
 * A – Verificando quantos dias tem cada mêsVamos criar um programa que imprime na tela a quantidade de dias existentes no mês, dada uma variável que contenha o nome do mês em questão.
 * 1. Crie uma classe e insira a estrutura básica de um programa Java;
 * 2. Declare uma variável do tipo String e armazene o nome de um mês de sua preferência, conforme o exemplo a seguir:
 * 3. Utilize uma estrutura de decisão múltipla switch, tendo a variável mes como referência, e  imprima,  para  o  mês  escolhido  a  frase:  “O  mês  escolhido  tem  XX  dias”.  
 * Utilize  strings  iniciadas com maiúsculo ou minúsculo. Padronize para evitar problemas;
 * 4.  Acrescente  um  item  default  à  estrutura  switch  com  uma  mensagem  de  erro  que  será  impressa no console, caso algum mês inexistente seja atribuído à variável mes;
 * 5. Altere os nomes atribuídos à variável mes, compile e execute seu programa algumas vezes:
 */



public class laboratorio4 {
    public static void main(String[] args) {
        String mes = "janeiro";

        switch (mes) {
            case "janeiro":
                System.out.println("O mes tem 31 dias");
                break;
            default:
            System.out.println("Error");
        }
    }
}
