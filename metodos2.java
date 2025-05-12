public class Metodos2 {
    
    static double hipotenusa(double cateto1, double cateto2){
        double temp1 = Math.pow(cateto1, 2);
        double temp2 = Math.pow(cateto2, 2);
        double temp3 = temp1 + temp2;
        double temp4 = Math.sqrt(temp3);
        return  temp4;
    }

    public static void main(String[] args) {
        double result = hipotenusa(4, 8);
        System.out.println(result);
    }



}
