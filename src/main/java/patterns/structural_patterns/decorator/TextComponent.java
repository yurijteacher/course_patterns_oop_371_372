package patterns.structural_patterns.decorator;

public class TextComponent implements Component{
    @Override
    public void draw() {
        System.out.println("text");
    }
}
