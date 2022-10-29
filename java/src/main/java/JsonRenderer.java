public class JsonRenderer implements Renderer {

    @Override
    public void render(Page page) {
        System.out.println("Rendering page " + page + " through  " + JsonRenderer.class.toString());

    }

}
