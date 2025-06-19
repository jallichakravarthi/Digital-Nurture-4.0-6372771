public interface Document {
    void open();

    void close();

    void save();

    String getContent();

    void setContent(String content);

    void appendContent(String content);
}
