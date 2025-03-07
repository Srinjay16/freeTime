import java.util.Scanner;
class AP
{
    public static void call()
    {
        int a, d, n, x, y;
        Scanner sc = new Scanner(System.in);
        System.out.println("    Choices\n1. n'th term\n2. n\n3. Sum\nEnter your choice:");
        x = sc.nextInt();
        switch (x)
        {
            case 1:
                System.out.println("Enter the first term, common difference and 'n':");
                a = sc.nextInt();
                d = sc.nextInt();
                n = sc.nextInt();
                System.out.println("n'th term is " + (a + (n - 1) * d));
                break;
            case 2:
                System.out.println("Enter the first term, common difference and n'th term:");
                a = sc.nextInt();
                d = sc.nextInt();
                x = sc.nextInt();
                System.out.println("'n' is " + ((x - a) / d + 1));
                break;
            case 3:
                System.out.println("Enter the first term, common difference and n:");
                a = sc.nextInt();
                d = sc.nextInt();
                n = sc.nextInt();
                System.out.println("Sum is " + ((n * (2 * a + (n - 1) * d)) / 2));
                break;
        }
    }    
}