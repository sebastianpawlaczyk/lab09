package store;

import product.Product;

public class Producer implements Runnable
{
    private int maxNumberOfProducts;
    private Store store;

    public Producer(int no, Store st)
    {
        maxNumberOfProducts = no;
        store = st;
    }

    public void deposit(Product prod)
    {
        if (maxNumberOfProducts - prod.getAmount() < 0)
        {
            return;
        }

        store.storeIt(prod);
    }

    @Override
    public void run()
    {
        Product product = new Product();
        deposit(product);
    }
}
