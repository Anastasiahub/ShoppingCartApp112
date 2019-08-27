import java.util.ArrayList;
import java.util.List;


public class ShoppingCartList {
    private double totalPrice;
    private List<Item> items = new ArrayList<Item>();


    public ShoppingCartList()
    {
        totalPrice = 0.0;
    }

    public void addItem(String productName, String model, int quantity, double unitPrice, double totalPr)
    {
        Item it = new Item(productName,model, quantity, unitPrice, totalPr);
        totalPrice = it.getTotal();
        items.add(it);
    }




}
