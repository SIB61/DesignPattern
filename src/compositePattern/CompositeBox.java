package compositePattern;

import java.util.ArrayList;
import java.util.List;

public class CompositeBox extends Box{
    List<Box> children = new ArrayList<>();
    @Override
    int calculatePrice() {
        return children.stream().mapToInt(Box::calculatePrice).sum();
    }

    @Override
    int calculateItems() {
        return children.stream().mapToInt(Box::calculateItems).sum();
    }

    public void add(Box box){
         children.add(box);
    }

    public void remove(Box box){
        children.remove(box);
    }
}
