package templatePattern;

public abstract class Game {
    abstract void initialise();
    abstract void start();
    abstract void end();

    public final void play(){
        initialise();
        start();
        end();
    }
}
