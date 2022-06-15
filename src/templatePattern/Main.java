package templatePattern;

public class Main {


    public static void main(String[] args) {
        Game cricket = new Cricket();
        Game football = new Football();

        cricket.play();
        football.play();
    }
}
