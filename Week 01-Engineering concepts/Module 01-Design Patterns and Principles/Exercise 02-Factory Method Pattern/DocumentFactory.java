public abstract class DocumentFactory {
    public abstract Document createDocument();

    public Document getDocument() {
        Document document = createDocument();
        document.open();
        return document;
    }
}
