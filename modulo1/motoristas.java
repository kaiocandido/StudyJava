public class motoristas extends heranca {
    private String cnh;
    private String automovel;

    public motoristas(int mat, String nome, double sal) {
        super(mat, nome, sal);
    }

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

    public String getAumotovel() {
        return automovel;
    }

    public void setAutomovel(String automovel) {
        this.automovel = automovel;
    }
}
