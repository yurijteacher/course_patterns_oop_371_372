package patterns.behavioral_patterns.template_metod;

public interface Game {

    void init();
    void startGame();
    void endGame();

    default void play(){
        init();
        startGame();
        endGame();
    }


}
