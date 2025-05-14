public class Conta {
    public int numero;
    public String nome;
    private double saldo = 0;

    public void depositar (double v){
        saldo += v;
    }

    public void retirar (double x){
        if (saldo >= x) {
            saldo -= x;
        }else{
            System.out.println("Saldo Insuficiente");
        }
    }

    public double getSaldo(){
        return saldo;
    }
}
