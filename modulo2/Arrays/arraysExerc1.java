package modulo2.Arrays;

//COMANDOS PARA COMPLICAR O CODIGO JAVA

//PS C:\Users\adm\Desktop\StudyJava> javac modulo2/Arrays/arraysExerc1.java
//PS C:\Users\adm\Desktop\StudyJava> java modulo2.Arrays.arraysExerc1
public class arraysExerc1 {

    public static void main(String[] args) {
        String[] nomes = { "João", "Maria", "José", "Ana", "Pedro" };
        System.out.println("-----------------");
        System.out.println("Usando o for tradicional");
        System.out.println("-----------------");
        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }
        System.out.println("-----------------");

        System.out.println("-----------------");
        System.out.println("Usando o for each");
        System.out.println("-----------------");
        for (String n : nomes) {
            System.out.println(n);
        }
        System.out.println("-----------------");
    }
}
