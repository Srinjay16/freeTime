import java.util.Scanner;
class Mensuration
{
    public static void call()
    {
        double R, r, h; int a; final double pi;
        Scanner sc = new Scanner(System.in);        
        System.out.println("Enter the value of pi");
        pi = sc.nextDouble();
        System.out.println("    Choices\n1. Cylinder\n2. Cone\nEnter your choice:");
        switch (sc.nextInt())        
        {
            case 1:
                System.out.println("    Choices\n1. Solid cylinder\n2. Hollow cylinder\nEnter your choice:");
                switch (sc.nextInt())
                {
                    case 1:
                        System.out.println("    Choices\n1. Volume\n2. Total surface area\n3. Curved surface area\nEnter your choice:");
                        a = sc.nextInt();
                        System.out.println("Enter the radius and height:");
                        r = sc.nextDouble();
                        h = sc.nextDouble();
                        if (a == 1)
                        {
                            System.out.println("Volume: "+ (pi * r * r * h));
                        }
                        else if (a == 2)
                        {
                            System.out.println("Total surface area: "+ (2.0 * pi * r * (r + h)));
                        }
                        else
                        {
                            System.out.println("Curved surface area: "+ (2 * pi * r * h));
                        }
                        break;
                    case 2:
                        System.out.println("    Choices\n1. Volume\n2. Total surface area\n3. Internal curved surface area");
                        System.out.println("4. External curved surface area\n5. Area of Cross section\nEnter your choice:");
                        a = sc.nextInt();
                        System.out.println("Enter the larger and smaller radius and height:");
                        R = sc.nextDouble();
                        r = sc.nextDouble();
                        h = sc.nextDouble();
                        if (a == 1)
                        {
                            System.out.println("Volume: "+ (pi * (R * R - r * r) * h));
                        }
                        else if (a == 2)
                        {
                            System.out.println("Total surface area: "+ (2.0 * pi * (R * h + r * h + R * R - r * r)));
                        }
                        else if (a == 3)
                        {
                            System.out.println("Internal curved surface area: "+ (2 * pi * r * h));
                        }
                        else if (a == 4)
                        {
                            System.out.println("External curved surface area: "+ (2 * pi * r * h));
                        }
                        else
                        {
                            System.out.println("Area of cross - section: "+ (pi * (R * R - r * r)));
                        }
                        break;
                    default:
                        System.out.println("Wrong input");
                }
                break;
            case 2:
                System.out.println("    Choices\n1. Slant height\n2. Surface area\n3. Volume\nEnter your choice:");
                a = sc.nextInt();
                System.out.println("Enter the radius and height:");
                r = sc.nextDouble();
                h = sc.nextDouble();
                if (a == 1)
                {
                    System.out.println("Slant height: " + (Math.sqrt(r * r + h * h)));
                }
                else if (a == 2)
                {
                    System.out.println("Surface area: " + (pi * r * (r + Math.sqrt(r * r + h * h))));
                }
                else
                {
                    System.out.println("Volume: " + ((1 * pi * r * r * h) / 3));
                }
                break;
            default:
                System.out.println("Wrong input");
        }
    }
}