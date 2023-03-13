package patterns.creational_pastterns.abstract_factory;

public abstract class Robot {

    private Head head;
    private Leg leg;
    private Hand hand;

    public Robot() {
    }

    public Robot(Head head, Leg leg, Hand hand) {
        this.head = head;
        this.leg = leg;
        this.hand = hand;
    }

    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    public Leg getLeg() {
        return leg;
    }

    public void setLeg(Leg leg) {
        this.leg = leg;
    }

    public Hand getHand() {
        return hand;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }

    @Override
    public String toString() {
        return
                "head=" + head +
                ", leg=" + leg +
                ", hand=" + hand;
    }
}
