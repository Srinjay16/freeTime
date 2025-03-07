import java.util.Scanner;
class SectionFormula
{
    public static void call()
    {
        double a, b, c, d, m, n;
        Scanner sc =  new Scanner(System.in);
        System.out.println("    Choices\n1. Internal point\n2. Length\n3. Centroid\n4. Ratio\nEnter your choice:");
        m = sc.nextInt();
        System.out.println("Enter the first coordinates:");
        a = sc.nextDouble();
        b = sc.nextDouble();
        System.out.println("Enter the second coordinates:");
        c = sc.nextDouble();
        d = sc.nextDouble();
        switch ((int)m)
        {
            case 1:
                System.out.println("Enter the ratio:");
                m = sc.nextDouble();
                n = sc.nextDouble();
                System.out.println("The point is (" + (m * c + n * a) / (m + n) + ", " + (m * d + n * b) / (m + n) + ")");
                break;
            case 2:
                System.out.println("The distance between the two points is " + (int)Math.sqrt((c - a) * (c - a) + (d - b) * (d - b)) + " units");
                break;
            case 3:
                System.out.println("Enter the third coordinates:");
                m = sc.nextDouble();
                n = sc.nextDouble();
                System.out.println("The centroid is (" + ((a + c + m) / 3) + ", " + ((b + d + n) / 3) + ")");
                break;
            case 4:
                System.out.println("Enter the internal point's coordinates:");
                m = sc.nextDouble();
                n = sc.nextDouble();
                if (m == 0)
                {
                    b = (m > a)? m - a : a - m;
                    d = (c > m)? c - m : m - c;
                }
                else if (n == 0)
                {
                    b = (n > b)? n - b : b - n;
                    d = (d > n)? d - n : n - d;
                }
                else
                {
                    b = (m > a)? m - a : a - m;
                    d = (c > m)? c - m : m - c;
                }
                a = b;
                n = d; 
                do
                {
                    c = n % a;
                    if (c != 0)
                    {
                        n = a;
                        a = c;
                    }
                }while (c != 0);
                System.out.println("The ratio is " + (int)(b / a) + " : " + (int)(d / a));
                break;
            default:
                System.out.println("Wrong input");
        }
    }
}