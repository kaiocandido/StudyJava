/*
 * Expressão lambda
 * Nomeclatura d codigo ultilziado na implementação de interfaces funcionais

 */

package modulo2.Funcional;

public class lambda {
    // Interface funcional
    @FunctionalInterface
    interface Operacao {
        double calcular(double valor1, double valor2);
    }

    public static void main(String[] args) {
        // Implementação da interface funcional usando expressão lambda
        Operacao soma = (valor1, valor2) -> valor1 + valor2;

        // Chamada do método da interface funcional
        double resultado = soma.calcular(5.0, 3.0);
        System.out.println("Resultado: " + resultado);
    }
}
