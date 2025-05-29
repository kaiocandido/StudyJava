public class Classes {
    
    public static void main(String[] args) {
        Conta c1 = new Conta();
        c1.setNumero(3232);
        c1.setName("Kaio");

        System.out.println("Dados da conta: " + c1.getName() + " N: " + c1.getNumero() + " Saldo: " + c1.getSaldo());
        System.out.println("Realizando testes");
        c1.retirar(8);
        c1.depositar(100);
        System.out.println("Dados da conta: " + c1.getName() + " N: " + c1.getNumero() + " Saldo: " + c1.getSaldo());

    }

}
