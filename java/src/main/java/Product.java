public class Product {

    private final String productId;
    private final String name;
    private final String description;
    private final String picture;

    public Product(String productId, String name, String description, String picture) {
        this.productId = productId;
        this.name = name;
        this.description = description;
        this.picture = picture;
    }

    public String getProductId() {
        return productId;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId='" + productId + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", picture='" + picture + '\'' +
                '}';
    }

}
