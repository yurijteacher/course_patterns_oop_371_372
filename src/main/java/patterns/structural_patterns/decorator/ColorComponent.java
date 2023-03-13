package patterns.structural_patterns.decorator;

public class ColorComponent implements Component{
    @Override
    public void draw() {
        System.out.println(" + color");
    }
}
