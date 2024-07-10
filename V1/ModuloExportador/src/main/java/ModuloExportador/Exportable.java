package ModuloExportador;

import java.util.List;
import java.util.Map;

public class Exportable {
    private Documento documento;
    private ExportarEstrategia estrategia;

    public Exportable(Documento documento, ExportarEstrategia estrategia) {
        this.documento = documento;
        this.estrategia = estrategia;
    }

    public void elegirEstrategia(ExportarEstrategia estrategia){
        this.estrategia = estrategia;
    }


    public String exportar(Documento documento){
        return this.estrategia.exportar(this);
    }

    public Map<String, List<String>> datos(){
        return documento.getDatos();
    }

    public void setDocumento(Documento documento) {
        this.documento = documento;
    }

    public void setEstrategia(ExportarEstrategia estrategia) {
        this.estrategia = estrategia;
    }
}
