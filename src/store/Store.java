package store;

import product.ProductType;
import product.Product;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class Store
{
    private Map<ProductType, Integer> depot = new TreeMap<>(Collections.reverseOrder());

    public void stocktaking()
    {
        System.out.println("STOCKTAKING IN ALPHABETICAL ORDER:");
        for (ProductType name : depot.keySet())
        {
            System.out.println(name + " " + depot.get(name));
        }
    }

    public synchronized void storeIt(Product product2Store)
    {
        if (!depot.containsKey(product2Store.getType()))
        {
            depot.put(product2Store.getType(), product2Store.getAmount());
            return;
        }

        int currentAmount = depot.get(product2Store.getType());
        if (currentAmount + product2Store.getAmount() > 10)
        {
            return;
        }

        depot.put(product2Store.getType(), currentAmount + product2Store.getAmount());
    }

    public synchronized void getIt(Product requestedProduct)
    {
        if (!depot.containsKey(requestedProduct.getType()))
        {
            return;
        }

        int currentAmount = depot.get(requestedProduct.getType());
        if (currentAmount - requestedProduct.getAmount() < 0)
        {
            return;
        }

        depot.put(requestedProduct.getType(), currentAmount - requestedProduct.getAmount());
    }
}
