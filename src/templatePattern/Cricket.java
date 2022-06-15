package templatePattern;

public class Cricket extends Game{
    @Override
    void initialise() {
        System.out.println("Cricket Initialised");
    }

    @Override
    void start() {
        System.out.println("Cricket Started");
    }

    @Override
    void end() {
        System.out.println("Cricket Ended");
    }
}
