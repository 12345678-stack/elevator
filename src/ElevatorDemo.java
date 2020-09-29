/**
 * Created by Sileshi Haile Woldemariame
 * Date: 2020-09-15
 * Time: 11:36
 * Project:elevator
 * Copyright: MIT
 */
public class ElevatorDemo {
    public static void main(String[] args) {
Elevator elevator1 = new Elevator(5);
elevator1.moveDownTo(-1);
elevator1.moveUpTo(7);
elevator1.goTo(3);
elevator1.where();

Elevator elevator2 = new Elevator(5);
elevator2.where();
elevator2.goTo(8);
elevator2.moveUpTo(10);
elevator2.moveDownTo(-1);
elevator2.where();

    }
}
