import java.util.Scanner;
class Factorization_Trials
{
    public static void call()
    {
        int a[], x, i, j, f;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the degree of polynomial:");
        x = sc.nextInt();
        x++;
        a = new int[x];
        for (i = 0; i < x; i++)
        {
            System.out.println("Enter " + i + "th degree coefficient:");
            a[i] = sc.nextInt();
        }
        for (i = -10; i <= 10; i++)
        {            
            f = 0;
            for (j = 0; j < x; j++)
            {
                f += a[j] * (int)Math.pow(i, j);
            }
            if (f == 0)
            {
                System.out.println("\nFor the given polynomial, f(" + i + ") = 0");
                break;
            }
        }
    }
}