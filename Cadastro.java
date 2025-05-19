

public class Cadastro {
    private String name;
    private String nameMiddle;
    private int age;

    public Cadastro(String no, String nm, int ag){
        name = no;
        nameMiddle = nm;
        age = ag;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setSobrename(int age){
        this.age = age;
    }

        public void setSobrename(String nameMiddle){
            this.nameMiddle = nameMiddle;
    }

    public String getInfos(){
        return "nome: " + name + " idade: " + age + " Nome do meio:" + nameMiddle;
    }
}
