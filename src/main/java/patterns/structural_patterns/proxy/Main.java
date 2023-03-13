package patterns.structural_patterns.proxy;

public class Main {


    public static void main(String[] args) {
        Image image = new MyImage("/file");
        image.display();

        Image image2 = new Proxy("/file");
        image2.display();
    }


}
