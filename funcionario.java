public class funcionario {
    public static void main(String[] args) {
        motoristas m = new motoristas(010101, "kaio", 500);

        m.setCnh("3737373737");
        m.setAutomovel("Gol G5 2011");

        System.out.println("Nome: " + m.getNome());
        System.out.println("Matricula: " + m.getMatricula());
        System.out.println("Salario:" + m.getSalario());
        System.out.println("CNH: " + m.getCnh());
        System.out.println("Automovel: " + m.getAumotovel());
        System.out.println("-------------------------------------------------");
    }
}
