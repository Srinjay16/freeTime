import java.util.Scanner;
class EquationStraightLine
{
    static int a, b, c, d, y, m , C;
    public static void call()
    {        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first coordinates:");
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("Enter the second coordinates:");
        c = sc.nextInt();
        d = sc.nextInt();
        y = c - a;
        m = -1 * (d - b);
        C = -1 * (b * (c - a) - a * (d - b));
        a = Math.abs(y);
        b = Math.abs(m);
        c = Math.abs(C);
        if (m == 0)
        {
            a += b;
            b = a - b;
            a = a - b;
        }
        do
        {
            d = a % b;
            if (d != 0)
            {
                a = b;
                b = d;
            }
        }while (d != 0);
        d = b;
        do
        {
            a = c % d;
            if (a != 0)
            {
                c = d;
                d = a;
            }
        }while (a != 0);
        y /= d;
        m /= d;
        C /= d;
        System.out.print("The equation of the straight line: ");
        if (m == 0)
        {
            System.out.print("");
        }
        else if (Math.abs(m) == 1)
        {
            System.out.print("x ");
            if (m == -1)
            {
                y *= -1;
                C *= -1;
            }
        }
        else if (m < -1)
        {
            System.out.print(Math.abs(m) + "x ");
            y *= -1; 
            C *= -1;
        }
        else
        { 
            System.out.print(m + "x ");
        }
        if (y == 0)
        {
            System.out.print("");
        }
        else if (y > 0)
        {
            System.out.print((Math.abs(y) == 1)? "+ y " : "+ " + y + "y ");
        }
        else
        {
            if (y == -1)
            {
                if (m == 0)
                {
                    System.out.print("y ");
                    C *= -1;
                }
                else
                {
                    System.out.print("- y ");
                }
            }
            else
            {
                if (m == 0)
                {
                    System.out.print(Math.abs(y) + "y ");
                    C *= -1;
                }
                else
                {
                    System.out.print("- " + Math.abs(y) + "y ");
                }
            }
        }
        if (C == 0)
        {
            System.out.print(" = 0");
        }
        else if (C > 0)
        {
            System.out.print("+ " + C + " = 0");
        }
        else
        {
            System.out.print("- " + Math.abs(C) + " = 0");
        }
    }
}