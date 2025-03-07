import java.util.Scanner;
class MeasuresOfCentralTendency
{
    static int c[], f[], cf[];
    public static void call()
    {
        int i, m = 0, a; double sf = 0.0, fi = 0.0, l = 0.0;
        Scanner sc=  new Scanner(System.in);
        System.out.println("    Choices\n1. Continuous class\n2. Observation value\nEnter your choice:");
        a = sc.nextInt();
        System.out.println("Enter the no. of classes:");
        c = new int[sc.nextInt()];
        f = new int[c.length];
        cf = new int[c.length];
        System.out.println("Enter the class and respective frequencies:");
        for (i = 0; i < c.length; c[i] = sc.nextInt(), f[i] = sc.nextInt(), i++);
        System.out.println("    Choices\n1. Mean\n2. Median\n3. Lower quartile\n4. Upper quartile\n5. Modal class\nEnter your choice:");
        for (i = 0; i < c.length; i++)
        {
            sf += c[i] * f[i];
            fi += f[i];
            if (i == 0)
            {
                cf[i] = f[i];
            }
            else
            {
                cf[i] = cf[i - 1] + f[i];
            }
            if (l < f[i])
            {
                m = c[i];
                l = f[i];
            }
        }
        switch (a)
        {
            case 1:
                a = sc.nextInt();
                switch (a)
                {
                    case 1:
                        System.out.println("The mean is " + ((sf / fi) - (c[1] - c[0])/2.0));
                        break;
                    case 2:
                        System.out.println("Median: " + conmid(fi / 2.0));
                        break;
                    case 3:
                        System.out.println("Lower quartile: " + conmid(fi / 4.0));
                        break;
                    case 4:
                        System.out.println("Upper quartile: " + conmid(fi / 4.0 * 3.0));
                        break;
                    case 5:
                        System.out.println("Mode: " + m);
                        break;
                    default:
                        System.out.println("Wrong input");
                }
                break;
            case 2:
                a = sc.nextInt();
                switch (a)
                {
                    case 1:
                        System.out.println("The mean is " + (sf / fi));
                        break;
                    case 2:
                        System.out.println("Median: " + mid(fi / 2.0));
                        break;
                    case 3:
                        System.out.println("Lower quartile: " + mid(fi / 4.0));
                        break;
                    case 4:
                        System.out.println("Upper quartile: " + mid(fi / 4.0 * 3.0));
                        break;
                    case 5:
                        System.out.println("Mode: " + m);
                        break;
                    default:
                        System.out.println("Wrong input");
                }
                break;
            default:
                System.out.println("Wrong input");
        }
    }
    private static int conmid(double l)
    {
        int x, i, a = 0, b = 0, e = 0, d = 0;
        for (i = 0; i < c.length; i++)
        {
            if (l >= cf[i] && l <= cf[i + 1])
            {
                a = c[i];
                b = cf[i];
                e = c[i + 1];
                d = cf[i + 1];
                break;
            }
        }
        x = (int)((((l - b) * (e - a)) / (d - b)) + a);
        return x;
    }
    private static int mid(double l)
    {
        int i, m = 0;
        for (i = 0; i < c.length; i++)
        {
            if (l >= cf[i] && l <= cf[i + 1])
            {
                m = c[i];
                break;
            }
        }
        return m;
    }
}