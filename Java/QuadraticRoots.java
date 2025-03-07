import java.util.Scanner;
class QuadraticRoots
{
    static float a, b, c, d, x, y;
    public static void call()
    {        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the coefficients:");
        a = sc.nextFloat();
        b = sc.nextFloat();
        c = sc.nextFloat();
        d = (float)Math.sqrt(b * b - 4.0f * a * c);
        x = (float)((d - 1.0f * b) / (2.0f * a));
        x = Math.round(x * 100) / 100.0f;
        y = (float)((-1.0f) * (d + b) / (2.0f * a));
        y = Math.round(y * 100.0f) / 100.0f;
        System.out.println("The roots are: " + x + " and " + y);
    }
}