import java.util.Scanner;
class Matrix
{
    public static void call()
    {
        int a[][] = new int[2][2], b[][] = new int[2][2], i, j;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of the 1st array:");
        for (i = 0; i < 2; i++)
        {
            for (j = 0; j < 2; j++)
            {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the elements of the 2st array:");
        for (i = 0; i < 2; i++)
        {
            for (j = 0; j < 2; j++)
            {
                b[i][j] = sc.nextInt();
            }
        }
        System.out.println("    Choices\n1. Addition\n2. Substraction\n3. Multiplication\nEnter your choice:");
        switch (sc.nextInt())
        {
            case 1:
                a[0][0] += b[0][0];
                a[0][0] += b[0][0];
                a[0][0] += b[0][0];
                a[0][0] += b[0][0];
                break;
            case 2:
                a[0][0] -= b[0][0];
                a[0][0] -= b[0][0];
                a[0][0] -= b[0][0];
                a[0][0] -= b[0][0];
                break;
            case 3:
                a[0][0] = a[0][0] * b[0][0] + a[0][1] * b[1][0];
                a[0][1] = a[0][0] * b[0][1] + a[0][1] * b[1][1];
                a[1][0] = a[1][0] * b[0][0] + a[1][1] * b[1][0];
                a[1][1] = a[1][0] * b[0][1] + a[1][1] * b[1][1];
                break;
            default:
                System.out.println("Wrong input");
        }        
        System.out.println("The new array is:");
        for (i = 0; i < 2; i++)
        {
            for (j = 0; j < 2; j++)
            {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
    }
}