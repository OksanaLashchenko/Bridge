public class HtmlRenderer implements Renderer {

    @Override
    public void render(Page page) {
        System.out.println("Rendering page " + page + " through  " + HtmlRenderer.class.toString());
    }

}
