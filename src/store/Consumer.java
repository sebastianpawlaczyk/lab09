package store;

import product.Product;

public class Consumer implements Runnable
{
    private int maxNumberOfProducts;
    private Store store;

    public Consumer(int no, Store st)
    {
        maxNumberOfProducts = no;
        store = st;
    }

    public void get(Product requestedProduct)
    {
        if (requestedProduct.getAmount() > maxNumberOfProducts)
        {
            return;
        }

        store.getIt(requestedProduct);
    }

    @Override
    public void run()
    {
        Product product = new Product();
        get(product);
    }
}
