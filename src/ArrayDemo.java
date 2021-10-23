public class ArrayDemo
{
    public static void main(String[] args)
    {
        double[] articles = new double[5];
        double sum = 0.0;
        //neues Kommentar
        articles[0] = 2.4;
        articles[1] = 2.0;
        articles[2] = 2.9;

        for(int i = 0; i < articles.length; i++)
        {
            sum = sum + articles[i];
        }

        System.out.println(sum);

        int[] array1 = {3, 4, 5};
        int[] array2 = {7, 1, 3};

        for(int i = 0; i < array1.length && i < array2.length; i++)
        {
            System.out.println("+: " + (array1[i] + array2[i]));
        }

        for(int i = 0; i < array1.length && i < array2.length; i++)
        {
            System.out.println("*: " + (array1[i] * array2[i]));
        }
    }
}
