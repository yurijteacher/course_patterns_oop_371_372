package patterns.creational_pastterns.singleton;

import java.util.Calendar;

public class MyCalendar {

    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();

        System.out.println(calendar.get(Calendar.YEAR));



        Calendar calendar1 = Calendar.getInstance();

        System.out.println(calendar);
        System.out.println(calendar1);


        Singleton test1 = Singleton.getInstance();
        Singleton test2 = Singleton.getInstance();

        test1.print();
        test2.print();


        if(test1.getClass()==test2.getClass()){
            System.out.println(true);
        }

    }
}
