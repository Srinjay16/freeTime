import java.util.Scanner;
class Reflection_Coordinate
{
    public static void call()
    {
        int x, y, a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the coordinates of the point:");
        x = sc.nextInt();
        y = sc.nextInt();
        System.out.println("    Choices\n1. y =\n2. x =");
        a = sc.nextInt();
        System.out.println("Enter the constant:");
        b = sc.nextInt();
        if (a == 1)
        {
            y = 2 * b - y;
        }
        else
        {
            x = 2 * b - x;
        }
        System.out.println("The reflection is (" + x + ", " + y + ")");
    }
}