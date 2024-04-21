import java.util.Scanner;

public class Main {
    static String[] guests = new String[10];
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        guests[0] = "Jacob";
        guests[1] = "Edward";
        guests[2] = "Rose";
        guests[3] = "Molly";
        guests[4] = "Christopher";

        do {
            displayGuests(args);
            displayMenu(args);

            System.out.println("Option: ");
            int option = scanner.nextInt();


            if (option == 2) {

                for (int i = 0; i < guests.length; i++) {
                    if (guests[i] == null){
                        System.out.println("Name: ");
                        guests[i] = scanner.next();
                        break;
                    }
                }
            }
            else if (option == 3) {
                System.out.println("Name: ");
                String name = scanner.next();
                for (int i = 0; i < guests.length; i++) {
                    if (guests[i] != null && guests[i].equals(name)){
                        guests[i] = null;
                        break;
                    }
                }
            }
            else if (option == 4) {
                System.out.println("Exiting... ");
                break;
            }
        } while (true);
    }
    public static void displayGuests(String[] args) {
        System.out.println("____________________________\n- Guests -\n");
            for (int i = 0; i < guests.length; i++) {
                System.out.println(guests[i]== null ? "--" : guests[i]);
        }
    }

    public static void displayMenu(String[] args) {
        System.out.println("____________________________\n- Menu -\n");
        System.out.println("1- Display All Guests");
        System.out.println("2- Add Guest");
        System.out.println("3- Remove Guest");
        System.out.println("4- Exit");
    }
    public static void getOption(String[] args) {


        }
}







































