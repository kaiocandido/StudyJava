public class metodos2 {
    
    static double hipotenusa(double cateto1, double cateto2){
        double temp1 = Math.pow(cateto1, 2);
        double temp2 = Math.pow(cateto2, 2);
        double temp3 = temp1 + temp2;
        double temp4 = Math.sqrt(temp3);
        return  temp4;
    }

    static void hipotenusa(String name){
        System.out.println("O seu nome e: " + name);
    }

    static void hipotenusa(){
        int sum = 2 + 4;
        System.out.println("A soma dos numero e: " + sum);
    }

    public static void main(String[] args) {
        double result = hipotenusa(4, 8);
        System.out.println(result);


        hipotenusa("Leila");
        
        hipotenusa();
        

    }



}
