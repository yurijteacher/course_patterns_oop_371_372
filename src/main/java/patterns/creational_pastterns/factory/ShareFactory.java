package patterns.creational_pastterns.factory;

public class ShareFactory {

    Share shape;
    public Share getShare(String name){

        switch (name){
            case ("точка"):
                shape = new Point();
                break;
            case ("коло"):
                shape = new Circle();
                break;
            case ("квадрат"):
                shape = new Square();
                break;
        }

      return shape;
    }

}
