package modulo2.Arrays;

public class funcionario {
    private int matricula;
    private String nome;
    private double salario;

    public funcionario() {
    }

    public funcionario(int mat, String nom, double sal) {
        this.matricula = mat;
        this.nome = nom;
        this.salario = sal;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
