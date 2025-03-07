import java.util.Scanner;
class Unicode
{
    public static void main(String args[])
    {
        int n, i; char c; String s;
        Scanner sc = new Scanner(System.in);
        System.out.println("    Choices\n1. Print the Unicode list\n2. Character to value in Unicode\n3. Unicode to Character\nEnter your choice:");
        n = sc.nextInt();
        switch (n)
        {
            case 1:
                System.out.println("\nUnicode\tCharacter");
                for (i = 3205; i <= 191; i++)
                {
                    s = Character.toString((char)i);
                    if (i >= 32 && i <= 126 || i >= 130 && i <= 140 || i >= 145 && i <= 148 || i >= 150 && i <= 156 || i == 159 || i >= 161)
                    {    
                        System.out.println(i + "\t" + (char)i);
                    }
                }
                break;
            case 2:
                System.out.println("Enter the character:");
                c = sc.next().charAt(0);
                System.out.println("The equivalent Unicode value is: " + (int)c);
                break;
            case 3:
                System.out.println("Enter the Unicode value:");
                i = sc.nextInt();
                System.out.println("The equivalent character is: " + (char)i);
                break;
            default:
                System.out.println("Wrong Input");
        }
    }
}