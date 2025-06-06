package modulo2.Funcional;

public class exemplo {

    // Método fora do main
    public static double execute(double valor1, double valor2) {
        return valor1 + valor2;
    }

    public static void main(String[] args) {
        double resultado = execute(5.0, 3.0);
        System.out.println("Resultado: " + resultado);
    }
}
