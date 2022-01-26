package Polimorfizm;

public class DocumentTest {
    public static void main(String[] args) {

        Document pdfDoc = new PdfDocument();  // można utworzyć obiekct który jest childem zarówno poprzez odwołanie do Parenta jak i do samego obiektu
        PdfDocument pdfDoc2 = new PdfDocument();

        Document xlsDoc = new XlsDocument();  // można utworzyć obiekct który jest childem zarówno poprzez odwołanie do Parenta jak i do samego obiektu
        XlsDocument xlsDoc2 = new XlsDocument();


        pdfDoc.Describe();
        pdfDoc2.Describe();
        xlsDoc.Describe();
        xlsDoc2.Describe();
    }
}
