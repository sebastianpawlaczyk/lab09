package product;

public enum ProductType
{
    TEE,
    MILK,
    BREAD,
    BUTTER,
    NOTYPE;

    public static ProductType convertString(String string)
    {
        string = string.trim().toLowerCase();
        switch (string)
        {
            case "tee" : return TEE;
            case "milk" : return MILK;
            case "bread" : return BREAD;
            case "butter" : return BUTTER;
            default: return NOTYPE;
        }
    }

    public static String getString(ProductType type)
    {
        switch (type)
        {
            case TEE : return "Tee";
            case MILK : return "Milk";
            case BREAD : return  "Bread";
            case BUTTER : return "Butter";
            default: return "NoType";
        }
    }
}
