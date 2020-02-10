package basicconcept;

import java.util.ArrayList;
import java.util.List;

public class ShopCart {
    List<Fruit> items = new ArrayList<>();
    public void addFruit(Fruit fruit){
        items.add(fruit);
    }

    public float calculateTotalPrice(){
        float total = 0.0f;
        for(Fruit fruit: items)
            total += fruit.getPrice();
        return total;
    }
}
