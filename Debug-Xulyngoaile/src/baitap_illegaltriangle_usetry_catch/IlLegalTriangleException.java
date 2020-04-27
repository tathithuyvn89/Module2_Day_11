package baitap_illegaltriangle_usetry_catch;

import java.util.Scanner;

public class IlLegalTriangleException {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        try {
            Triangle triangle= new Triangle();
            System.out.print("Enter 1 side of Triangle: ");
            int side1= scanner.nextInt();
            triangle.setSide1(side1);
            System.out.print("Enter 2 side of Triangle: ");
            int side2= scanner.nextInt();
            triangle.setSide2(side2);
            System.out.print("Enter 3 side of Triangle: ");
            int side3= scanner.nextInt();
            triangle.setSide3(side3);

        } catch ( Exception e){
            System.out.println(e);;
        }

    }
}
