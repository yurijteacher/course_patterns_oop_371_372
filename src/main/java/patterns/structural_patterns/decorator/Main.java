package patterns.structural_patterns.decorator;

import java.util.Calendar;

public class Main {

    public static void main(String[] args) {

        Component drawText = new TextComponent();

        Component drawTextAndPanelAndBorder =

                new BorderDecorator( new PanelDecorator(new BorderDecorator(new PanelDecorator(new TextComponent()))));


    }
}
