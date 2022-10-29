public class SimplePage extends Page {

    private final String header;
    private final String content;

    public SimplePage(String header, String content) {
        this.header = header;
        this.content = content;
    }

    @Override
    public String toString() {
        return "SimplePage{" +
                "header='" + header + '\'' +
                ", content='" + content + '\'' +
                '}';
    }

}
