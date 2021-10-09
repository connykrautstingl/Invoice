public class ArrayDemoApp {


    public static void main(String[] args) {

        double [] articles = new double[5];
        articles[0] = 2.4;
        articles[1] = 2.0;
        articles[2] = 2.9;

        double sum = articles[0] + articles[1] + articles[2] + articles[3] + articles[4];
        System.out.println(sum);

        double sum2 = 0;
        sum2 = sum2 + articles[0];
        System.out.println(sum2);
        sum2 = sum2 + articles[1];
        System.out.println(sum2);
        sum2 = sum2 + articles[2];
        System.out.println(sum2);
        sum2 = sum2 + articles[3];
        System.out.println(sum2);
        sum2 = sum2 + articles[4];
        System.out.println(sum2);
    }
}



