/*
    Exceptions
    * Mecanismo ultilizado pelo java para informar que algo inesperado aconteeu
    * Quando sua aplicação não contorna situações de exceptions, ocorre a interrupção abrupta do programa

    metodos

    * getMessage() - Retorna uma mensagem de erro
    * printStackTrace() - Imprime a pilha de chamadas do erro, útil para depuração


    NullpointerException
    * Execeção não verifiada pertence ao pacote java.lang
    * Ocorre ao tentar executar um metodo sobre uma variavel que não possui um objeto
    referenciado

    EX:
    Cliente  c = null;
    c.setNome("João"); // Isso causará um NullPointerException

    numberFormatException
    * Execeção não verificada e pertence ao pacote java.lang
    * Ocorre ao tentar realizr a conversão de um string para um valor numerico
    
    EX:
    String texto = "10xp";
    int idade = Interger.parseInt(texto); // Isso causará um NumberFormatException

    ArrayIndexOutOfBoundsException
    & Execeção não verificada e pertence ao pacote java.lang
    * Ocorre ao tentar obter um intem inexistente de um array

    EX:
    double[] notas = {10, 2, 11};
    double nota = notas[3]; // Isso causará um ArrayIndexOutOfBoundsException

    AritmeticException
    * Execeção não verificada e pertence ao pacote java.lang
    * Ocorre em operações aritméticas com inteiros, que possuem resultados invalido
    
    EX:
    int valor = 10;
    int quantidade = 0;
    int rateio = valor / quantidade; // Isso causará um ArithmeticException

    ClassCastException
    * Execeção não verificada e pertence ao pacote java.lang
    * Ocorre ao tentar realizar o cast(tipagem) para um tipo incompativel como o objeto

    EX:
    Conta c = new ContaPoupanca();
    ContaCorrente cc = (ContaCorrente) c; // Isso causará um ClassCastException

    IOException
    * Execeção verificada e pertence ao pacote java.io
    * Ocorre em operações de entrada e saída, como leitura de arquivos ou conexões de rede
    EX:
    FileInputStream fis = new FileInputStream("arquivo.txt");
    BufferedReader br = new BufferedReader(new InputStreamReader(fis));
    String linha = br.readLine(); // Isso pode causar um IOException se o arquivo não existir
    * Para tratar exceções verificadas, é necessário usar try-catch ou declarar a exceção na assinatura do método

    SQLException
    * Execeção verificada e pertence ao pacote java.sql
    * Ocorre em operações de banco de dados, como consultas ou atualizações
    EX:
    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/meubanco", "usuario", "senha");
    Statement stmt = conn.createStatement();
    ResultSet rs = stmt.executeQuery("SELECT * FROM tabela"); // Isso pode causar um SQLException se houver um erro na consulta
 */

public class execoesOne {
    public static void main(String[] args) {
        try {
            //Intruções sujeitas a falhas
        } catch (Exception e) {
            //Instruções a serem executados em caso de falha
            System.err.println("Ocorreu um erro: " + e.getMessage());
        }
    }
}
