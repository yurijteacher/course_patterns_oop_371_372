package patterns.structural_patterns.fly_weight;

public class Main {

    public static void main(String[] args) {

        WlyWeightShare wlyWeightShare =  new WlyWeightShare();

       Share share1 = wlyWeightShare.getShare("коло");
       share1.draw(4,5);

        Share share2 = wlyWeightShare.getShare("квадрат");
        share2.draw(4,5);

        Share share3 = wlyWeightShare.getShare("коло");
        share3.draw(5,5);

        System.out.println(share1);
        System.out.println(share3);

    }


}
