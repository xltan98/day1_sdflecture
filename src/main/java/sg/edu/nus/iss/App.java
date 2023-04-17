package sg.edu.nus.iss;

import java.io.Console;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Console cons = System.console();
        String name = cons.readLine("What is your name?");
        if (name.length() > 0) {
            System.out.printf("Hello %s. Please to meet you.\n", name);
            int age = 80;
            System.out.printf("%s is %d year old\n", name, age);

            /** another way to do it is println using concating method */
            String mother_name = "Esther";
            System.out.printf("your name is %s. Your mother name is %s", name, mother_name);
        } else {
            System.out.printf("you have not type in your name yet!");
        }

        String input = cons.readLine("\nwhat is your hobby?");
        input = input.trim();// will remove extra spaces if user put in extra spaces)

        if (input.equals("swim")) {
            System.out.println("The nearest swimming pool is in clementi");
        }

        else if (input.equals("cycle")) {
            System.out.println("you could cycle along PCN");
        }

        else if (input.equals("jog")) {
            System.out.println("How fast can you jog");
        }

        else {
            System.out.println("you are a boring person without hobby!");
        }

        switch (input.trim().toLowerCase()) {
            case "swim":
                System.out.println(" The nearest swimming pool is at clementi");
                break;
            case "jog":
                System.out.println("how fast can you jog?");
                break;
            case "cycle":
                System.out.println("you could cycle along PCN");
                break;
            default:
            System.out.println("whats your hobby" + name +"?");
            break;

        }

    }

}
