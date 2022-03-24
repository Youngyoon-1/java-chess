package chess.domain.state;

public class Ready extends State {

    @Override
    public State start() {
        return new White();
    }

    @Override
    public State end() {
        return new End();
    }

    @Override
    public boolean isRunning() {
        return true;
    }
}
