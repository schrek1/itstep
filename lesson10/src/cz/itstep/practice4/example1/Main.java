package cz.itstep.practice4.example1;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Builder builder = new Builder("John", "Doe", LocalDate.now().minusDays(1), 5, "carpenter", 10);
        Pilot pilot = new Pilot("Carl", "Johnson", LocalDate.now().minusDays(2), "Boeing", 5600);
        Sailor sailor = new Sailor("Travis", "Brown", LocalDate.now().minusDays(3), "Marry");

        Human[] humans = {builder, pilot, sailor};

        // procedural approach
        for (Human human : humans) {
            printHumanInfo(human);
            printHumanJobInfo(human);
        }

        // object approach
        for (Human human : humans) {
            String humanInfo = human.getHumanInfo();
            String jobInfo = human.getJobInfo();
            System.out.println(humanInfo);
            System.out.println(jobInfo);
        }

    }

    public static void printHumanInfo(Human human) {
        System.out.println("Clovek:");
        System.out.println("- jmeno: " + human.getFirstName() + " " + human.getLastName());
        System.out.println("- narozen: " + human.getBorn());
    }

    //    public static void printHumanJobInfo(Human human) {
    public static void printHumanJobInfo(Object human) {
        if (human instanceof Pilot) {
            Pilot pilot = (Pilot) human;
            System.out.println("Pilot:");
            System.out.println("- opravneni na typ:" + pilot.getPlaneTypeQualification());
            System.out.println("- pocet hodin:" + pilot.getHoursTotal());
        } else if (human instanceof Builder) {
            Builder builder = (Builder) human;
            System.out.println("Stavebnik:");
            System.out.println("- specializace:" + builder.getSpecialization());
            System.out.println("- pocet staveb:" + builder.getCountOfBuild());
            System.out.println("- pocet let praxe:" + builder.getYearOfPractice());
        } else if (human instanceof Sailor) {
            Sailor sailor = (Sailor) human;
            System.out.println("Namornik:");
            System.out.println("- lod:" + sailor.getShipName());
        }
    }
}
