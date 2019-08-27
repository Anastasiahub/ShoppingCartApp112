import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;

public class ShoppingCartListTest {

    @Test
    public void addItem() {
        List<Item> shoppingcart = new ArrayList<Item>();
        Item itemshoppingcart = new Item("iPhone", "product11", 1, 123.20, 123.20);

        shoppingcart.add(itemshoppingcart);
        assertTrue(shoppingcart.contains(itemshoppingcart));

    }
}