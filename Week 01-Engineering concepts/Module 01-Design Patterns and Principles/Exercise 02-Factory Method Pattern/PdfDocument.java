public class PdfDocument implements Document {
    private String content;

    public PdfDocument() {
        this.content = "";
    }

    @Override
    public void open() {
        System.out.println("Opening PDF document...");
        System.out.println("Document content: " + content);
    }

    @Override
    public void close() {
        System.out.println("Closing PDF document...");
    }

    @Override
    public void save() {
        System.out.println("PDF Document saved.");
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
        System.out.println("Content appended to PDF document.");
    }

}
