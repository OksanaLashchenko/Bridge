public class XmlRenderer implements Renderer {

    @Override
    public void render(Page page) {
        System.out.println("Rendering page " + page + " through  " + XmlRenderer.class.toString());
    }

}
