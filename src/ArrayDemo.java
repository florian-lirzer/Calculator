public class ArrayDemo
{
    public static void main(String[] args)
    {
        double[] articles = new double[5];
        double sum = 0.0;

        articles[0] = 2.4;
        articles[1] = 2.0;
        articles[2] = 2.9;

        for(int i = 0; i < articles.length; i++)
        {
            sum = sum + articles[i];
        }

        System.out.println(sum);

    }
}
