package patterns.creational_pastterns.prototype;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Robot> robotList = new ArrayList<>();

        // Ор
        Robot robot = new Robot();
        // Копія
        robot.clone("T100", "wqe", "red");

        for (int i = 0; i < 100; i++) {
            robotList.add((Robot)robot.clone("name" + i, "model" + i, "color" + i) );
        }

        for (Robot el : robotList
             ) {
            System.out.println(el);
        }

       // robotList.stream().forEach(e-> System.out.println(e));
    }

}
