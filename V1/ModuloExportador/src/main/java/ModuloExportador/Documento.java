package ModuloExportador;

import java.util.*;

public class Documento {

    private HashMap<String, List<String>> datos;

    public Documento(){
        this.datos = new HashMap<>();
    }

    public void agregarDatos(String fila, String nombre, String apellido, String edad){
        ArrayList<String> datosPasados = new ArrayList<>();
        datosPasados.add(nombre);
        datosPasados.add(apellido);
        datosPasados.add(edad);
        this.datos.put(fila,datosPasados);
    }

    public Map<String, List<String>> getDatos() {
        return datos;
    }

    public void setDatos(HashMap<String, List<String>> datos) {
        this.datos = datos;
    }
}
