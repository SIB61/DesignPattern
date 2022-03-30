package adapterPattern;

public class Adaptee implements IAdaptee{

    @Override
    public void createNewNote() {
        System.out.println("new note created");
    }

    @Override
    public void deleteNote() {
        System.out.println("note deleted");
    }
}
