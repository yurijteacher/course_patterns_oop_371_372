package patterns.creational_pastterns.abstract_factory;

public class Main {

    public static void main(String[] args) {

        SamsungHand hand = new SamsungHand();
        SamsungHead head = new SamsungHead();
        SonyLeg sonyLeg = new SonyLeg();

        // Robot r =new Robot();

        RobotT1000 t1000 = new RobotT1000(head, sonyLeg, hand, "T1000");
        System.out.println(t1000);


        SonyHead sonyHead = new SonyHead();
        RobotT1000 t2000 = new RobotT1000(sonyHead, sonyLeg, hand, "T2000");
        System.out.println(t2000);


    }
}
