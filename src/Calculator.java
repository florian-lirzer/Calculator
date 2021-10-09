public class Calculator
{
    public static void main(String[] args)
    {
        int a = 10;
        int b = 0;
        printResult(add(a, b));
        printResult(sub(a, b));
        printResult(multi(a, b));
        printResult(div(a, b));
        printResult(modulo(a, b));


    }

    public static void printResult(int result)
    {
        System.out.println(result);
    }

    public static int add(int a, int b)
    {
        return a + b;
    }

    public static int sub(int a, int b)
    {
        return a - b;
    }

    public static int multi(int a, int b)
    {
        return a * b;
    }

    public static int div(int dividend, int divisor)
    {
        if (divisor > 0)
        {
            return dividend / divisor;
        }
        else
        {
            return 0;
        }
    }

    public static int modulo(int a, int b)
    {
        if (b > 0)
        {
            return a % b;
        }
        else
        {
            return 0;
        }
    }
}
