public class FindEven
{
    public static void main(String[] args)
    {
        int counter = 1;
        int input = 10;

        while (counter <= input)
        {
            if (counter % 2 == 0)
            {
                System.out.println(counter);
            }
            counter++;
        }

        for(int i = 1; i <= 10; i++)
        {
            System.out.println("Durchlauf: " + i);
            if(i % 2 == 0)
            {
                System.out.println("Ausgabe durch for: " + i);
            }
        }
    }
}
