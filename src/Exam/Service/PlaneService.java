package Exam.Service;

import Exam.model.Plane;

import java.util.Scanner;

public class PlaneService {

    public Plane create() {
        Scanner scanner = new Scanner(System.in);
        String model = null;

        while (model == null || model.isEmpty()) {
            System.out.print("Enter plane model: ");
            model = scanner.next();
        }

        String country = null;
        while (country == null || country.isEmpty()) {
            System.out.print("Enter plane country: ");
            country = scanner.next();
        }

        int year = 0;
        while (year < 1903 || year > 2020) {
            System.out.print("Enter plane year: ");
            year = scanner.nextInt();
        }

        int hours = -1;
        while (hours < 0 || hours > 10000) {
            System.out.print("Enter plane hours: ");
            hours = scanner.nextInt();
        }

        System.out.print("Enter plane military (y/n): ");
        boolean isMilitary = scanner.next().charAt(0) == 'y';

        int weight = 0;
        while (weight < 1000 || weight > 10000) {
            System.out.print("Enter plane weight: ");
            weight = scanner.nextInt();
        }

        int topSpeed = -1;
        while (topSpeed < 0) {
            System.out.print("Enter plane top speed: ");
            topSpeed = scanner.nextInt();
        }

        int seats = -1;
        while (seats < 0) {
            System.out.print("Enter plane seats: ");
            seats = scanner.nextInt();
        }

        double cost = -1;
        while (cost < 0) {
            System.out.print("Enter plane cost: ");
            cost = scanner.nextDouble();
        }

        Plane plane = new Plane(model, country, year);
        plane.setHours(hours);
        plane.setMilitary(isMilitary);
        plane.setWeight(weight);
        plane.setTopSpeed(topSpeed);
        plane.setSeats(seats);
        plane.setCost(cost);

        return plane;
    }

    public void checkMilitary(Plane plane) {
        if (plane.isMilitary()) {
            System.out.printf("Cost: %f\n" + plane.getCost());
            System.out.printf("Top speed: %d\n" + plane.getCost());
        } else {
            System.out.printf("Model: %s\n" + plane.getModel());
            System.out.printf("Country: %s\n" + plane.getCountry());
        }
    }

    public Plane newerPlane(Plane plane1, Plane plane2) {
        return plane1.getYear() >= plane2.getYear() ? plane1 : plane2;
    }

    public void smallestSeatsCount(Plane plane1, Plane plane2, Plane plane3) {
        Plane planeSmallestSeats = plane1.getSeats() <= plane2.getSeats() ? plane1 : plane2;

        if (plane3.getSeats() < planeSmallestSeats.getSeats())
            planeSmallestSeats = plane3;

        System.out.println(planeSmallestSeats.getCountry());
    }

    public void printNotMilitaryPlanes(Plane[] planes) {
        for (Plane plane : planes) {
            if (!plane.isMilitary()) {
                plane.printInfo();
            }
        }
    }

    public void printMilitaryHoursMoreHundredPlanes(Plane[] planes) {
        for (Plane plane : planes) {
            if (plane.isMilitary() && plane.getHours() > 100) {
                plane.printInfo();
            }
        }
    }

    public Plane getPlaneWithMinimalWeight(Plane[] planes) {
        Plane planeWithMinimalWeight = planes[0];

        for (int i = 1; i < planes.length; i++) {
            if (planes[i].getWeight() <= planeWithMinimalWeight.getWeight()) {
                planeWithMinimalWeight = planes[i];
            }
        }

        return planeWithMinimalWeight;
    }

    public Plane getMilitaryPlaneWithMinimalCost(Plane[] planes) {
        Plane p = planes[0];
        int i;
        for (i = 0; i < planes.length; i++) {
            if (planes[i].isMilitary()) {
                p = planes[i];
            }
        }

        for (int j = i + 1; j < planes.length; j++) {
            if (planes[j].isMilitary() && planes[j].getCost() < p.getCost()) {
                p = planes[j];
            }
        }

        return p;
    }

    public void orderAscByYear(Plane[] planes) {
        boolean check = true;
        int count = 0;
        while (check) {
            check = false;
            for (int i = 0; i < planes.length - 1 - count; i++) {
                if (planes[i + 1].getYear() < planes[i].getYear()) {
                    Plane temp = planes[i];
                    planes[i] = planes[i + 1];
                    planes[i + 1] = temp;
                }
            }
            count++;
        }

        for (Plane plane : planes) {
            plane.printInfo();
        }
    }
}
