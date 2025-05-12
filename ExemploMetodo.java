

public  class  ExemploMetodo{

    static void speakName(String name, int qntd){

        int i = 1;
        while (i <= qntd) {
            i++;
            System.out.println("Exibindo nome: " + name);
        }
        
    }

    public static void main(String[] args) {
        speakName("Leila", 2);
    }
}

