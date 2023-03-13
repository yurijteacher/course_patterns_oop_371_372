package patterns.structural_patterns.facade;

public class Facade {

    public void  print(){
        First first = new First();
        Second second = new Second();
        first.print();
        second.print();
    }
}
