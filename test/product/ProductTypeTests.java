package product;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProductTypeTests
{
    @Test
    public void convertStringToProperProductType()
    {
        Assertions.assertEquals(ProductType.TEE, ProductType.convertString("tee"));
        Assertions.assertEquals(ProductType.MILK, ProductType.convertString("  MiLk"));
        Assertions.assertEquals(ProductType.BREAD, ProductType.convertString("BREAD  "));
        Assertions.assertEquals(ProductType.BUTTER, ProductType.convertString("Butter"));
        Assertions.assertEquals(ProductType.NOTYPE, ProductType.convertString("XYZ"));
    }

    @Test
    public void getStringFromProductType()
    {
        Assertions.assertEquals("Tee", ProductType.getString(ProductType.TEE));
        Assertions.assertEquals("Milk", ProductType.getString(ProductType.MILK));
        Assertions.assertEquals("Bread", ProductType.getString(ProductType.BREAD));
        Assertions.assertEquals("Butter", ProductType.getString(ProductType.BUTTER));
        Assertions.assertEquals("NoType", ProductType.getString(ProductType.NOTYPE));
    }
}