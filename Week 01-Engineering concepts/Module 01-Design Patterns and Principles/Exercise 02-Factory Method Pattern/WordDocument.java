public class WordDocument implements Document {
    private String content;

    public WordDocument() {
        this.content="";
    }

    @Override
    public void open() {
        System.out.println("Opening Word document...");
        System.out.println("Document content: " + content);
    }

    @Override
    public void close() {
        System.out.println("Closing Word document...");
    }

    @Override
    public void save() {
        System.out.println("Word Document saved."); 
    }

    @Override
    public String getContent() {
        return content;
    }

    @Override
    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public void appendContent(String content) {
        this.content += content;
        System.out.println("Content appended to Word document.");
    }
}
