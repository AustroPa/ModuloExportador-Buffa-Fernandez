package ModuloExportador;

import Exportadores.AdapterApachePDFBox;
import Exportadores.ExportarAExcel;
import PDFexport.ExportarPDF;

public class FactoryDocumento {
    public static String elegirExportacion(String eleccion, Documento documento){
        Exportable inst = null;
        switch(eleccion){
                    case "PDF": inst = new Exportable(documento, new ExportarPDF(new AdapterApachePDFBox("datos.pdf")));
                        return inst.exportar(documento);

                    case "Exel": inst = new Exportable(documento,new ExportarAExcel("datos.xlsx"));
                        return inst.exportar(documento);

                    default: throw new RuntimeException("No Existe la Opcion");
                }
    }

}
