public class ExcelDocument implements Document {
    private String content;

    public ExcelDocument() {
        this.content = "";
    }

    @Override
    public void open() {
        System.out.println("Opening Excel document...");
        System.out.println("Document content: " + content);
    }

    @Override
    public void close() {
        System.out.println("Closing Excel document...");
    }

    @Override
    public void save() {
        System.out.println("Excel Document saved.");
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
        System.out.println("Content appended to Excel document.");
    }

}
