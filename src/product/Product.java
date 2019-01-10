package product;

import java.util.Random;

public class Product
{
    private int amount;
    private ProductType type;

    public Product()
    {
        Random rand = new Random();

        amount = rand.nextInt(10);

        int n = rand.nextInt(4);
        type = ProductType.values()[n];
    }

    public int getAmount()
    {
        return amount;
    }

    public ProductType getType()
    {
        return type;
    }

    public static void main(String args[])
    {
        Product product = new Product();
    }
}
