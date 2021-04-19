package Exam.main;

import Exam.Service.PlaneService;
import Exam.model.Plane;

import java.util.Scanner;

public class AirportTest {
    public static void main(String[] args) {
        PlaneService planeService = new PlaneService();

        Plane plane1 = planeService.create();
        Plane plane2 = planeService.create();
        Plane plane3 = planeService.create();

        Plane[] planes = new Plane[]{plane1, plane3, plane2};

        Scanner scanner = new Scanner(System.in);

        boolean isActive = true;

        while(isActive) {
            System.out.print("Enter command number: ");
            System.out.println("1. checkMilitary");
            System.out.println("2. newerPlane");
            System.out.println("3. smallestSeatsCount");
            System.out.println("4. printNotMilitaryPlanes");
            System.out.println("5. printMilitaryHoursMoreHundredPlanes");
            System.out.println("6. getPlaneWithMinimalWeight");
            System.out.println("7. getMilitaryPlaneWithMinimalCost");
            System.out.println("8. orderAscByYear");
            System.out.println("9. Exit");

            int command = scanner.nextInt();

            switch (command) {
                case 1:
                    planeService.checkMilitary(plane1);
                    break;
                case 2:
                    planeService.newerPlane(plane2, plane3);
                    break;
                case 3:
                    planeService.smallestSeatsCount(plane2, plane3, plane1);
                    break;
                case 4:
                    planeService.printNotMilitaryPlanes(planes);
                    break;
                case 5:
                    planeService.printMilitaryHoursMoreHundredPlanes(planes);
                    break;
                case 6:
                    planeService.getPlaneWithMinimalWeight(planes);
                    break;
                case 7:
                    planeService.getMilitaryPlaneWithMinimalCost(planes);
                    break;
                case 8:
                    planeService.orderAscByYear(planes);
                    break;
                case 9:
                    isActive = false;
                    System.out.println("Bye");
                    break;
                default:
                    System.out.println("Invalid command number");
                    break;
            }
        }
    }
}
