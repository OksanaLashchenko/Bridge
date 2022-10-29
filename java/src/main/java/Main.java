public class Main {

    public static void main(String[] args) {
        Product product = new Product("1", "Mug", "White Mug with dogs printed", "pic");
        Page simplePage = new SimplePage("header", "content");
        Page productPage = new ProductPage(product);

        Renderer renderer = new HtmlRenderer();
        renderer.render(simplePage);
        renderer.render(productPage);

        Renderer renderer1 = new JsonRenderer();
        renderer1.render(simplePage);
        renderer1.render(productPage);

        Renderer renderer2 = new XmlRenderer();
        renderer2.render(simplePage);
        renderer2.render(productPage);
    }

}
