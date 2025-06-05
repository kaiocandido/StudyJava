

/*
Transferindo Exceções

throws

 * Ao ultilizar exceções que exigem o tratamento de exceptions, temos duas oções:
- Tratar a exception com try/ catch, conforme ja visto
- Transferir a exception para quem chamou o medoto atual através da clusula throws
    EX:
        void abrirArqu() throws FileNotFoundException{
            FileReader texto;
            texto = new FileReader("arquivo.txt");
            // Aqui, se o arquivo não for encontrado, uma FileNotFoundException será lançada
        }

Clausula finally

-Bloco de codigo associado ao try/catch que garante a execução de instruções, mesmo quando
não ocorre exeções
- Define um bloco de codigo que será executado 100% das vezes
- Geralemente ultilizado para finalizar alguma pendencia que o metodo deixou
    EX:

        Conexao cn = null;
        try {
            cn = new Conexao();
            cn.abrir();
            cn.fechar();
        } catch (Exception e) {
            System.out.println("Ocorreu um erro: " + e.getMessage());
        } finally {
            if (cn != null) {
                cn.fechar();
            }
        }

Clausula throw

-Força a ocorrencia de uma exception sinalizando que há algum problema ao executar
a operação em questão
  *EX:
        public void exibeParabens(int idade) throws Exception {
        if (idade < 18) {
            throw new Exception("Você não pode acessar este conteúdo, pois é menor de idade.");
        } else {
            System.out.println("Parabéns! Você é maior de idade.");
        }
    }

 */

public class transferindo {
    public static void main(String[] args) {
        
    }
}
