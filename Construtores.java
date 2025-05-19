public class Construtores {

    private int numero;
    private String nome;
    private  double saldo;

    public Construtores(int num, String nm, double  sal){
        numero = num;
        nome = nm;
        saldo = sal;
    }

    public int getNumero() {
        return  numero;
    }

    public void setNumero(int numero){
        this.numero = numero;
    }

        public String getName() {
        return nome;
    }

    public void setName(String nome){
        this.nome = nome;
    }


        public double  getSaldo() {
        return saldo;
    }

    public String getDados(){
        return numero + "- - " + nome +" - -" + saldo;
    }

}