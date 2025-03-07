import java.util.Scanner;
class Age_Calculator
{
    public static void main(String args[])
    {
        String x, y; int b, g, h, i;
        Scanner sc = new Scanner(System.in);
        do
        {
            System.out.println("Enter the starting date (DD.MM.YYYY):");
            x = sc.next();
            b = Integer.valueOf(x.substring(x.indexOf(".") + 1, x.lastIndexOf(".")));
            System.out.println("Enter the ending date (DD.MM.YYYY):");
            y = sc.next();
            g = Integer.valueOf(y.substring(0, y.indexOf("."))) - Integer.valueOf(x.substring(0, x.indexOf(".")));
            i = Integer.valueOf(y.substring(y.lastIndexOf(".") + 1)) - Integer.valueOf(x.substring(x.lastIndexOf(".") + 1));
            h = Integer.valueOf(y.substring(y.indexOf(".") + 1, y.lastIndexOf("."))) - b;
            if (g < 0)
            {
                h--;
                if (h < 0)
                {
                    i--;
                    h += 12;
                }
                if (b == 0 || b == 1 || b == 3 || b == 5 || b == 7 || b == 8 || b == 10)
                {
                    g += 31;
                }
                else if (b == 4 || b == 6 || b == 9 || b == 11)
                {
                    g += 30;
                }
                else if (b == 2)
                {
                    if (Integer.valueOf(x.substring(x.lastIndexOf(".") + 1)) % 100 == 0)
                    {
                        if (Integer.valueOf(x.substring(x.lastIndexOf(".") + 1)) % 400 == 0)
                        {
                            g += 29;
                        }
                        else
                        {
                            g += 28;
                        }
                    }
                    else
                    {
                        if (Integer.valueOf(x.substring(x.lastIndexOf(".") + 1)) % 4 == 0)
                        {
                        g += 29;
                    }
                    else
                        {
                            g += 28;
                        }
                    }
                }
            }
            else if (h < 0)
            {
                i--;
                h += 12;
            }
            System.out.println("The age is " + i + " years, " + h + " months and " + g + " days.");
            System.out.println("\n1. Reset\n2. Exit\nEnter your choice:");
            if (sc.nextInt() == 2)
            {
                System.exit(0);
            }
            System.out.print((char)12);
        } while (true);
    }
}