
import ModuloExportador.Documento;
import ModuloExportador.FactoryDocumento;
import config.Config;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ExportadorTest {
    private Documento doc;

     @Before
    public void init(){
         Documento d = new Documento();
         d.agregarDatos("0","nombre","apellido","edad");
         this.doc= d;
     }

     @Test
    public void exportarPDF(){
         this.doc.agregarDatos("1","poop","peer","123");
         Assert.assertEquals(Config.RUTA_EXPORTACION+"datos.pdf",FactoryDocumento.elegirExportacion("PDF",doc));
     }

     @Test
    public void exportarExel(){
         this.doc.agregarDatos("1","wiw","wee","12");
         Assert.assertEquals(Config.RUTA_EXPORTACION+"datos.xlsx",FactoryDocumento.elegirExportacion("Exel",doc));
     }

}
