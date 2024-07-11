package PDFexport;

import ModuloExportador.Documento;
import ModuloExportador.Exportable;
import ModuloExportador.ExportarEstrategia;

public class ExportarPDF implements ExportarEstrategia {
    private PDFAdapter adapter;

    public ExportarPDF(PDFAdapter adapter) {
        this.adapter = adapter;
    }

    public String exportar(Exportable exportable){
        return adapter.exportar(exportable);
    }
}