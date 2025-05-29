package modulo2.Arrays;

public class exemplo {
    public static void main(String[] args) {
        funcionario[] func = new funcionario[5];

        func[0] = new funcionario(1, "João", 1500.00);
        func[1] = new funcionario(2, "Maria", 2000.00);
        func[2] = new funcionario(3, "José", 2500.00);
        func[3] = new funcionario(4, "Ana", 3000.00);
        func[4] = new funcionario(5, "Pedro", 3500.00);

        for (funcionario f : func) {
            System.out.println("Matrícula: " + f.getMatricula());
            System.out.println("Nome: " + f.getNome());
            System.out.println("Salário: " + f.getSalario());
            System.out.println("-----------------");
        }
    }
}
