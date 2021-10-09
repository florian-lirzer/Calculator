public class ArithmetischeOperationen {
    public static void main(String[] args) {
        int a = 53;
        int b = 17;

        int add = a + b;
        int sub = a - b;
        int multi = a * b;
        double div = a / (b * 1.0);
        boolean even = (a + b) % 2 == 0;

        System.out.println(add);
        System.out.println(sub);
        System.out.println(multi);
        System.out.println(div);
        System.out.println(even);

        int o = 3;
        int l = o++;
        System.out.println(o);
        System.out.println(l);

        String eins = "Hallo";
        String zwei = "Hallo";

        boolean sameValue = eins.equals(zwei);
        System.out.println(sameValue);

        System.out.println(2 == 2 && 3 == 3);
        System.out.println(2 == 2 || 3 == 4);
        System.out.println(!(2 == 2 || 3 == 4));

    }
}
