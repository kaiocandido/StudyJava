public class MinhaString {
    public static void main(String[] args) {
        
        StringBuilder nome = new StringBuilder("Kaio");
        nome.append(" Candido");
        nome.append(" De Oliveira");
        nome.insert(4, "gostoso");
        nome.delete(4, 11);
        nome.append("  'E legal'");
        nome.toString();
        System.out.println("Nome: " + nome);
    }
}
