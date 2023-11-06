import java.util.ArrayList;

public class Persona {
    private String rut;
    private String nombre;
    private String apellido;
    private ArrayList<CorreoElectronico> correosElectronicos = new ArrayList<CorreoElectronico>();
    private ArrayList<Automovil> automoviles = new ArrayList<Automovil>();

    public Persona(String rut, String nombre, String apellido) {
        this.rut = rut;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getRut() {
        return rut;
    }
    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public ArrayList<CorreoElectronico> getCorreosElectronicos() {
        return correosElectronicos;
    }
    public void setCorreosElectronicos(ArrayList<CorreoElectronico> correosElectronicos) {
        this.correosElectronicos = correosElectronicos;
    }

    public ArrayList<Automovil> getAutomoviles() {
        return automoviles;
    }
    public void setAutomoviles(ArrayList<Automovil> automoviles) {
        this.automoviles = automoviles;
    }

    public void agregarCorreoElectronico(CorreoElectronico correoElectronico) {
        correosElectronicos.add(correoElectronico);
    }

    public void agregarAutomovil(Automovil automovil) {
        automoviles.add(automovil);
    }

    public ArrayList<Automovil> obtenerAutomovilesPorMarca(String marca) {
        ArrayList<Automovil> automovilesPorMarca = new ArrayList<Automovil>();
        for (Automovil automovil : automoviles) {
            if (automovil.getMarca().equals(marca)) {
                automovilesPorMarca.add(automovil);
            }
        }
        return automovilesPorMarca;
    }
}
