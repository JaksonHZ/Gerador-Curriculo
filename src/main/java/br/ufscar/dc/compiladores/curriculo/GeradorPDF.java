package br.ufscar.dc.compiladores.curriculo;

import com.openhtmltopdf.pdfboxout.PdfRendererBuilder;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class GeradorPDF {
    public void gerarPDF(String html, String caminhoSaida) throws IOException {
        try (OutputStream os = new FileOutputStream(caminhoSaida)) {
            PdfRendererBuilder builder = new PdfRendererBuilder();
            builder.withHtmlContent(html, null);
            builder.toStream(os);
            builder.run();
        } catch (Exception e) {
            throw new IOException("Erro ao gerar PDF: " + e.getMessage(), e);
        }
    }
} 