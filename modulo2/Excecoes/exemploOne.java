package modulo2.Excecoes;

import java.io.FileReader;

public class exemploOne {
    public static void main(String[] args) {
        
        try {
            FileReader reader = new FileReader("c:\\Users\\Usuario\\Desktop\\sddasdasd");
            // Aqui você pode adicionar código para ler o arquivo, se necessário
            System.out.println("Arquivo aberto com sucesso!");
        } catch (Exception e) {
            System.err.println("Erro ao tentar abrir o arquivo: " + e.getMessage());
        }
    }
}
