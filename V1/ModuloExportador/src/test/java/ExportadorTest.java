import Exportadores.AdapterApachePDFBox;
import Exportadores.ExportarAExcel;
import ModuloExportador.Exportable;
import ModuloExportador.Documento;
import PDFexport.AdapterPDFBox;
import PDFexport.ExportarPDF;
import config.Config;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ExportadorTest {
    private Exportable exp;
    private Documento doc;

     @Before
    public void init(){
         Documento d = new Documento();
         d.agregarDatos("0","nombre","apellido","edad");
         this.doc= d;
         this.exp= new Exportable(this.doc,new ExportarAExcel("datos.xlsx"));
     }

     @Test
    public void exportarExel(){
         this.doc.agregarDatos("1","pepe","perez","23");
         this.exp.setDocumento(this.doc);
         Assert.assertEquals(Config.RUTA_EXPORTACION+"datos.xlsx",this.exp.exportar((doc)));
     }

     @Test
    public void exportarPDF(){
         this.doc.agregarDatos("1","oo","ee","123");
         this.exp = new Exportable(this.doc, new ExportarPDF(new AdapterPDFBox(new AdapterApachePDFBox("datos.pdf"))));
         Assert.assertEquals(Config.RUTA_EXPORTACION+"datos.pdf",this.exp.exportar((doc)));

     }

}
