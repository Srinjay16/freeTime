import java.util.Scanner;
class Banking
{
    public static void call()
    {
        float A, p, m, n, r, a, b, c, d;
        Scanner sc = new Scanner(System.in);
        System.out.println("    Choices\nFind the:\n1. Amount\n2. Interest\n3. Principal\n4. Rate\n5. Time\nEnter your choice:");
        switch (sc.nextInt())
        {
            case 1:
                System.out.println("Enter principal, time (in months) and rate:");
                p = sc.nextFloat();
                n = sc.nextFloat();
                r = sc.nextFloat();
                System.out.println("Amount: Rs." + ((p * n) + ((p * n * (n + 1.0f) * r) / (2.0f * 12.0f * 100.0f))));
                break;
            case 2:
                System.out.println("Enter principal, time (in months) and rate:");
                p = sc.nextFloat();
                n = sc.nextFloat();
                r = sc.nextFloat();
                System.out.println("Interest: Rs." + (p * n * (n + 1.0f) * r) / (2.0f * 12.0f * 100.0f));
                break;
            case 3:
                System.out.println("Enter amount, rate and time (in months):");
                A = sc.nextFloat();
                r = sc.nextFloat();
                n = sc.nextFloat();
                System.out.println("Principal: Rs." + A / (n + (n * (n + 1.0f) * r) / (2.0f * 12.0f * 100.0f)));
                break;                    
            case 4:
                System.out.println("Enter principal, time (in months) and amount:");
                p = sc.nextFloat();
                n = sc.nextFloat();
                A = sc.nextFloat();
                A -= p * n;
                System.out.println("Rate: " + (A * 100.0f * 12.0f * 2.0f) / (p * n * (n + 1)) + "% p.a.");
                break;
            case 5:
                System.out.println("Enter principal, rate and amount:");
                p = sc.nextFloat();
                r = sc.nextFloat();
                A = sc.nextFloat();
                a = p * r;
                b = (2400.0f * p) + (p * r);
                c = (-1) * 2400.0f * A;
                d = (float)Math.sqrt(b * b - 4.0f * a * c);
                n = (float)((d - 1.0f * b) / (2.0f * a));
                n = Math.round(n * 100) / 100.0f;
                m = (float)((-1.0f) * (d + b) / (2.0f * a));
                m = Math.round(m * 100.0f) / 100.0f;
                if (m > 0)
                {
                    n = m;
                }
                System.out.println("Time: " + (int)n + " months or " + (int)(n / 12) + " years.");
                break;
            default:
                System.out.println("Wrong Input");
        }
    }
}