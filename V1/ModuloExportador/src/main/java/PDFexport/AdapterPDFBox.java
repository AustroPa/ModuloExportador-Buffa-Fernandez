package PDFexport;

import Exportadores.AdapterApachePDFBox;
import ModuloExportador.Documento;
import ModuloExportador.Exportable;

public class AdapterPDFBox implements PDFAdapter{
    private AdapterApachePDFBox adaptador;

    public AdapterPDFBox(AdapterApachePDFBox adaptador) {
        this.adaptador = adaptador;
    }

    public String exportar(Exportable exportable) {
        return adaptador.exportar(exportable);
    }
}
