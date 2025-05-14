public class Classes {
    
    public static void main(String[] args) {
        Conta c1 = new Conta();
        c1.numero = 3232;
        c1.nome = "Kaio";

        System.out.println("Dados da conta: " + c1.nome + " N: " + c1.numero + " Saldo: " + c1.getSaldo());
        System.out.println("Realizando testes");
        c1.retirar(8);
        c1.depositar(100);
        System.out.println("Dados da conta: " + c1.nome + " N: " + c1.numero + " Saldo: " + c1.getSaldo());

    }

}
