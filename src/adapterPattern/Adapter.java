package adapterPattern;

public class Adapter implements IAdapter{
    IAdaptee adaptee;
    Adapter(IAdaptee adaptee){
        this.adaptee=adaptee;
    }


    @Override
    public void addNewNote() {
       adaptee.createNewNote();
    }

    @Override
    public void removeNote() {
       adaptee.deleteNote();
    }
}
