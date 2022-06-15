package templatePattern;

public class Football extends Game{
    @Override
    void initialise() {
        System.out.println("Football Initialised");
    }

    @Override
    void start() {
        System.out.println("Football Started");
    }

    @Override
    void end() {
        System.out.println("Football Ended");
    }
}
