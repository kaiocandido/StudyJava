public class Conta {
    private  int numero;
    private  String nome;
    private double saldo = 0;

    public int getNumero(){
        return numero;
    }
    public void setNumero(int x){
        numero = x;
    }

    public String getName(){
        return nome;
    }

    public void setName(String x){
        nome = x;
    }

    public double getSaldo(){
        return saldo;
    }

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
}
