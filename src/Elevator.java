import javax.swing.*;
import java.util.Scanner;

/**
 * Created by Sileshi Haile Woldemariame
 * Date: 2020-09-15
 * Time: 11:31
 * Project:elevator
 * Copyright: MIT
 */

//A class that describe an Elevator
public class Elevator {

    //instance variables and stores the current floor

    int level;
    //Scanner
    Scanner sc = new Scanner(System.in);

    //Creating a constructor that has a parameter that determines the current plane.
    public Elevator(int currentfloor) {
        this.level = currentfloor;
        System.out.println("The current postion of the elevator is : " + level);

    }
    //An instance method that returns an integer with the floor number (level).


    public int where() {
        /**Test code
         * The current postion of the elevator is : 5
         * On Which floor are you waiting the elevator 10
         * The elevator is on its way up ...
         * 6
         * 7
         * 8
         * 9
         * 10
         * The elevator has arrived
         *  the elevator is going up to  :10
         * Enter to the elevator
         * To which floor do you want to go 6
         * The elevator is on its way down ...
         * 9
         * 8
         * 7
         * 6
         * The elevator has arrived
         *  the elevator is going down to : 6
         * Leave the elevator
         */


        System.out.print("On Which floor are you waiting the elevator ");
        int userFloor = sc.nextInt();
        if (userFloor < -2 || userFloor > 10) {
            System.out.println("Invalid floor number or doesn't exist");
        } else
            goTo(userFloor);
        System.out.println("Enter to the elevator");


        System.out.print("To which floor do you want to go ");
        int destinationFloor = sc.nextInt();
        goTo(destinationFloor);
        System.out.println("Leave the elevator");
        return destinationFloor;

    }

    //Instance method that moves the elevator
    public void goTo(int destinationFloor) {
        /** Test code
         * The current postion of the elevator is : 5
         * The elevator is on its way down ...
         * 4
         * The elevator has arrived
         *  the elevator is going down to : 4
         */
        if (destinationFloor == level) {
            System.out.println(" already the elevator is  " + destinationFloor + " floor");
        } else if (destinationFloor > level) {
            moveUpTo(destinationFloor);
            System.out.println(" the elevator is going up to  :" + destinationFloor);
        } else {
            moveDownTo(destinationFloor);
            System.out.println(" the elevator is going down to : " + destinationFloor);
        }
    }

    public void moveUpTo(int destinationFloor) {
        /** Test code
         *The current postion of the elevator is : 5
         * The elevator is on its way up ...
         * 6
         * 7
         * 8
         * The elevator has arrived
         */
        System.out.println("The elevator is on its way up ...");
        while (level < destinationFloor) {
            level++;
            System.out.println(level);
        }
        System.out.println("The elevator has arrived");
    }

    public void moveDownTo(int destinationFloor) {
        /**Test code
         * The current postion of the elevator is : 5
         * The elevator is on its way down ...
         * 4
         * 3
         * 2
         * 1
         * 0
         * -1
         * The elevator has arrived
         */
        System.out.println("The elevator is on its way down ...");
        while (level > destinationFloor) {
            level--;
            System.out.println(level);
        }
        System.out.println("The elevator has arrived");
    }


}















