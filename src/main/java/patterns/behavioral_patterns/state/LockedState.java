package patterns.behavioral_patterns.state;

public class LockedState extends State {

    public LockedState(Player player) {
        super(player);
    }

    @Override
    public String onLock() {
        if (player.isPlaying()) {
            player.setState(new ReadyState(player));
            return "Stop playing";
        } else {
            return "Locked...";
        }
    }

    @Override
    public String onPlay() {
        player.setState(new ReadyState(player));
        return "Ready";
    }

    @Override
    public String onNext() {
        return "Locked...";
    }

    @Override
    public String onPrevious() {
        return "Locked...";
    }
}
