/*
    Class: CMSC203
    Instructor: Grigoriy Grinberg
    Description: Color guessing game with 10 rounds and displays the results at the end
    Due: 09/11/2023
    Platform/compiler: IntelliJ IDEA
    I pledge that I have completed the programming assignment independently. I have not copied the code from a student or any source.
    I have not given my code to any student.
    Pint your Name here: Jacob Hauptman
 */
import java.util.Scanner;
class ESPGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        short points = 0;
        final String COLOR_RED = "red", COLOR_GREEN = "green", COLOR_BLUE = "blue",
                COLOR_ORANGE = "orange", COLOR_YELLOW = "yellow";
        String name, description, dueDate;
        System.out.print("Enter your name: ");
        name = sc.nextLine();
        System.out.print("Describe yourself: ");
        description = sc.nextLine();
        System.out.print("Due Date: ");
        dueDate = sc.nextLine();
        System.out.println("CMSC203 Assignment1: Test your ESP skills!");

        for (int i = 1; i <= 10; i++) {
            String response, color = "";
            int random = (int) (Math.random() * 5);
            switch (random){
            case 0:
                color = COLOR_RED;
                break;
            case 1:
                color = COLOR_GREEN;
                break;
            case 2:
                color = COLOR_BLUE;
                break;
            case 3:
                color = COLOR_ORANGE;
                break;
            case 4:
                color = COLOR_YELLOW;
                break;
        }
            System.out.println("Round " + i + "\n");
            System.out.println("I am thinking of a color.");
            System.out.println("Is it Red, Green, Blue, Orange, or Yellow?");
            System.out.println("Enter your guess: ");
                response = sc.next();
                if (response.equalsIgnoreCase(color)) {
                    points++;
                }else{
                    while (!response.equalsIgnoreCase(COLOR_RED) && !response.equalsIgnoreCase(COLOR_GREEN)
                            && !response.equalsIgnoreCase(COLOR_BLUE) && !response.equalsIgnoreCase(COLOR_ORANGE)
                            && !response.equalsIgnoreCase(COLOR_YELLOW)){
                    System.out.println("You entered incorrect color. Is it Red, Green, Blue, Orange, or Yellow?");
                    System.out.println("Enter your guess again:");
                    response = sc.next();
                }
            }
            System.out.println("\nI was thinking of " + color + ".");
        }
        System.out.println("Game Over\n");
        System.out.println("You guessed " + points + " out of 10 colors correctly");
        System.out.println("User Name: " + name);
        System.out.println("User Description: " + description);
        System.out.println("Due Date: " + dueDate);
    }
}
