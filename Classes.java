public class Classes {
    
    public static void main(String[] args) {
        Conta c1 = new Conta();
        c1.numero = 3232;
        c1.nome = "Kaio";
        c1.saldo = 10;

        System.out.println("Dados da conta: " + c1.nome + " N: " + c1.numero + " Saldo: " + c1.saldo);
    }

}
