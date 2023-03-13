package patterns.structural_patterns.composite;

import java.util.ArrayList;
import java.util.List;

public class CompositeRobot implements Robot{

    public List<Robot> robotList = new ArrayList<>();

    public void addComposite(Robot robot){
        robotList.add(robot);
    }
    public void removeComposite(Robot robot){
        robotList.remove(robot);
    }

    @Override
    public void action() {
        for (Robot el : robotList
             ) {
            el.action();
        }
    }
}
