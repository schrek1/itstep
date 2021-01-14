package cz.itstep.example5;

public class Example5 {

    public static void main(String[] args) {
        int hour = 10;

        if (hour < 0 || hour > 24) {
            System.out.println("Mimo rozsah");
            return;
        }

        // if-else if-else variant

        String greeting;
        if (hour > 0 && hour <= 6) {
            greeting = "Good night";
        } else if (hour > 6 && hour <= 13) {
            greeting = "Good morning";
        } else if (hour > 13 && hour <= 17) {
            greeting = "Good day";
        } else {
            greeting = "Good evening";
        }

        System.out.println(greeting);


        // switch variant

        switch (hour) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6: {
                System.out.println("Good night");
                break;
            }
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13: {
                System.out.println("Good morning");
                break;
            }
            case 14:
            case 15:
            case 16:
            case 17: {
                System.out.println("Good day");
            }
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 0: {
                System.out.println("Good evening");
                break;
            }

        }
    }

}
