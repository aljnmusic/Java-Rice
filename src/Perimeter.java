import java.util.Scanner;

public class Perimeter {
    public double firstSide;
    public double secondSide;
    public double thirdSide;


    public double getSides(){
        return firstSide + secondSide + thirdSide;
    }

    public void readSides(){
        Scanner scanner = new  Scanner(System.in);

        System.out.println("Please enter the first: ");
        firstSide = scanner.nextDouble();
        System.out.println("Please enter the second: ");
        secondSide = scanner.nextDouble();
        System.out.println("Please enter the third: ");
        thirdSide = scanner.nextDouble();
    }

    public void printSides(){
        System.out.println("First Side : " + firstSide);
        System.out.println("Second Side : " + secondSide);
        System.out.println("Third Side : " + thirdSide);
        System.out.println("Total Sides : " + getSides());
    }
}
