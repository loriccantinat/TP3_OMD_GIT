public class Calculette {

    public static int addition(int a, int b) {
        return a + b;
    }

    public static int soustraction(int a, int b) {
        return a - b ;
    }
    public static int multiplication(int a, int b) {
        return a * b ;
    }

    //je mets des commentaires pour fait chier 
    public static float division_modif(int a, int b) {
        return a / b ;
    }
    //test

        public static void main(String[] args) {
        System.out.println("1 + 3 = " + addition(1,3));
    }
}