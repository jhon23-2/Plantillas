package Pdf_Document;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;
import java.time.LocalDate;

public class Plantilla_Jefe {

    public static final String meses[] = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto",
        "Septiembre", "Octubre", "Noviembre", "Diciembre"};

    public static final int numMes = LocalDate.now().getMonth().getValue();
    private Document documento = null;
    private Image imagen = null;
    private String seniores, nombreComplet;
    private int cc;

    public Plantilla_Jefe(String seniores, String nombreComplet, int cc) {
        documento = new Document();
        this.seniores = seniores;
        this.nombreComplet = nombreComplet;
        this.cc = cc;
    }

    public void plantillaPDF(String nombrePdf) {

        String date = "Bogotá D.C., " + getDate(numMes, meses);

        try (FileOutputStream archivo = new FileOutputStream(nombrePdf + ".pdf")) {
            PdfWriter.getInstance(documento, archivo);
            documento.open();
            documento.setPageSize(PageSize.LETTER);

            //Imagen
            imagen = Image.getInstance("C:\\Users\\lcamp\\Pictures\\Screenshots\\Captura de pantalla (2).png");
            imagen.scaleAbsolute(145, 50);
            imagen.setAbsolutePosition(415, 712);
            documento.add(imagen);

            //fecha
            formatoTexto(date, "Calibri", 12, Font.NORMAL, BaseColor.BLACK);
            System.out.println("Documento Escrito Correctamente...");
            documento.close();

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

    private void formatoTexto(String texto, String formatoTexto, float tam, int style, BaseColor color) {

        try {

            Paragraph text = new Paragraph();
            text.setFont(FontFactory.getFont(formatoTexto, tam, style, color));
            text.setAlignment(Chunk.ALIGN_JUSTIFIED);
            text.add(text);
            documento.add(text);

        } catch (Exception e) {

            System.out.println("Error: " + e.getMessage());

        }
    }

    public void planrillaCorreo(String user, String password, String userDestino) {
        // TODO...
    }

    public static String getDate(int numMes, String meses[]) {

        String date = "";
        int numDia = LocalDate.now().getDayOfMonth();
        int numAnio = LocalDate.now().getYear();

        for (int i = 0; i < meses.length; i++) {

            if (numMes - 1 == i) {
                date = numDia + " de " + meses[i] + " de " + numAnio;
                break;
            }

        }

        return date;
    }
}
