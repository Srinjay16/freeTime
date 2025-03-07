import java.util.Scanner;
import java.io.*;
class Timer
{
    public static void main(String args[]) throws InterruptedException, IOException
    {
        String s; int a, b, c;
        Scanner sc = new Scanner(System.in);
        BufferedReader ob = new BufferedReader(new InputStreamReader(System.in));
        do
        {
            System.out.println("Enter the time (hour : minute : second):");
            s = ob.readLine();
            a = Integer.valueOf(s.substring(0, s.indexOf(':')));
            b = Integer.valueOf(s.substring(s.indexOf(':') + 1, s.lastIndexOf(':')));
            c = Integer.valueOf(s.substring(s.lastIndexOf(':') + 1));
            if (a == 0 && b == 0 && c == 0)
            {
                break;
            }
            System.out.print((char)12 + " ");
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\t\t\t\t\t\t\t\t\t\t\t\tYour time starts now!!");
            Thread.sleep(800);
            while (true)
            {
                System.out.print((char)12 + " ");
                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\t\t\t\t\t\t\t\t\t\t\t\t\t" + a + " : " + b + " : " + c);
                c--;
                if (c == -1)
                {
                    b--;
                    c = 59;
                }
                if (b == -1)
                {
                    a--;
                    b = 59;
                }
                Thread.sleep(999);
                if (a == 0 && b == 0 && c == 0)
                {
                    break;
                }
            }
            System.out.print((char)12 + " ");
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\t\t\t\t\t\t\t\t\t\t\t\t\t" + a + " : " + b + " : " + c);
            Thread.sleep(800);
            System.out.print((char)12 + " ");
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\t\t\t\t\t\t\t\t\t\t\t\t  Your ti" + (char)7 + "me's up!!");
            Thread.sleep(600);
            System.out.print((char)12 + " ");
            Thread.sleep(600);
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\t\t\t\t\t\t\t\t\t\t\t\t  Your ti" + (char)7 + "me's up!!");
            Thread.sleep(600);
            System.out.print((char)12 + " ");
            Thread.sleep(600);
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\t\t\t\t\t\t\t\t\t\t\t\t  Your ti" + (char)7 + "me's up!!");
            Thread.sleep(600);
            System.out.print((char)12);
            System.out.println("1. Reset\n2. Exit\nEnter your choice:");
            if (sc.nextInt() == 2)
            {
                System.exit(0);
            }
            System.out.print((char)12);
        } while (true);
    }
}