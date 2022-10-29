public class ProductPage extends Page {

    private final Product product;

    public ProductPage(Product product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "ProductPage{" +
                "product=" + product +
                '}';
    }

}
