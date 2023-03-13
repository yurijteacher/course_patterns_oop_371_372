package patterns.structural_patterns.fly_weight;

import java.util.HashMap;
import java.util.Map;

public class WlyWeightShare {

    private final static Map<String, Share> shares = new HashMap<>();


    public Share getShare(String name){

        Share share = shares.get(name);

        if(share == null) {
            switch(name) {
                case ("точка"):
                    share = new Point();
                    break;
                case ("коло"):
                    share = new Circle();
                    break;
                case ("квадрат"):
                    share = new Square();
                    break;
            }
            shares.put(name, share);
        }
        return share;
    }









}
