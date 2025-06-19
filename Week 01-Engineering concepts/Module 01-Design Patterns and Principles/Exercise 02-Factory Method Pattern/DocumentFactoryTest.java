public class DocumentFactoryTest {
    public static void main(String []args) {
        DocumentFactory factory;

        factory = new WordDocumentFactory();
        Document wordDoc = factory.getDocument();
        wordDoc.setContent("This is a Word document.");
        wordDoc.appendContent(" Appending more content to Word document.");
        System.out.println("Word Document Content: " + wordDoc.getContent());
        wordDoc.save();
        wordDoc.close();

        factory = new PdfDocumentFactory();
        Document pdfDoc = factory.getDocument();
        pdfDoc.setContent("This is a PDF document.");
        pdfDoc.appendContent(" Appending more content to PDF document.");
        System.out.println("Pdf Document Content: " + pdfDoc.getContent());
        pdfDoc.save();
        pdfDoc.close();

        factory = new ExcelDocumentFactory();
        Document excelDoc = factory.getDocument();
        excelDoc.setContent("This is an Excel document.");
        excelDoc.appendContent(" Appending more content to Excel document.");
        System.out.println("Excel Document Content: " + excelDoc.getContent());
        excelDoc.save();
        excelDoc.close();
    }
}
