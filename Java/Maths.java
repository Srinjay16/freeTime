import java.util.Scanner;
class Maths
{
    public static void main(String args[])
    {
        int n;
        Scanner sc = new Scanner(System.in);
        do 
        {
            System.out.println("    Choices\n1. Quadratic\n2. Banking\n3. Factorization\n4. AP\n5. Matrix\n6. Section formula\n7. Reflection");
            System.out.println("8. Equation of Straight Line\n9. Mensuration\n10. Measures of Central Tendency\n\nEnter your choice:");
            n = sc.nextInt();
            switch (n)
            {
                case 1:
                    new QuadraticRoots().call();
                    break;
                case 2:
                    new Banking().call();
                    break;
                case 3:
                    new Factorization_Trials().call();
                    break;
                case 4:
                    new AP().call();
                    break;
                case 5:
                    new Matrix().call();
                    break;
                case 6:
                    new SectionFormula().call();
                    break;
                case 7:
                    new Reflection_Coordinate().call();
                    break;
                case 8:
                    new EquationStraightLine().call();
                    break;
                case 9:
                    new Mensuration().call();
                    break;
                case 10:
                    new MeasuresOfCentralTendency().call();
                    break;
                default:
                    System.out.println("Wrong input");
            }
            System.out.println("\n1. Reset\n2. Exit\nEnter your choice:");
            if (sc.nextInt() == 2)
            {
                System.out.print((char)12);
                System.exit(0);
            }
            System.out.print((char)12);
        } while (true);
    }
}