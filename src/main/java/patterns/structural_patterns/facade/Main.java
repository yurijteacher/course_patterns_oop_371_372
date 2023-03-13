package patterns.structural_patterns.facade;

import java.util.Set;

public class Main {


    public static void main(String[] args) {

        First first = new First();
        Second second = new Second();
        first.print();
        second.print();


        new Facade().print();

    }


}
