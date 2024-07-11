package PDFexport;
import ModuloExportador.Documento;
import ModuloExportador.Exportable;

public interface PDFAdapter {
    String exportar (Exportable exportable);
}
