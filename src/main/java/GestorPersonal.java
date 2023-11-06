import java.util.ArrayList;

public class GestorPersonal {
    private ArrayList<Persona> personas = new ArrayList<Persona>();

    public void agregarPersona(String rut, String nombre, String apellido) {
        if (rut != null && nombre != null && apellido != null) {
            personas.add(new Persona(rut, nombre, apellido));
        }
    }

    public void agregarAutomovil(Persona persona, String marca, String modelo, int anioFabricacion, double precio, Motor motor, Chasis chasis) {
        if (persona != null) {
            if (marca != null && modelo != null && anioFabricacion > 0 && precio > 0 && motor != null && chasis != null) {
                persona.agregarAutomovil(new Automovil(marca, modelo, anioFabricacion, precio, motor, chasis));
            }
        }
    }

    public void agregarCorreoElectronico(Persona persona, String direccion, String tipo) {
        if (persona != null) {
            if (direccion != null && tipo != null) {
                persona.agregarCorreoElectronico(new CorreoElectronico(direccion, tipo));
            }
        }
    }

    public ArrayList<Persona> obtenerPersonasPorMarca(String marca) {
        ArrayList<Persona> personasPorMarca = new ArrayList<Persona>();
        for (Persona persona : personas) {
            if (persona.obtenerAutomovilesPorMarca(marca) != null) {
                personasPorMarca.add(persona);
            }
        }
        return personasPorMarca;
    }

    public ArrayList<Persona> obtenerPersonasPorNombre(String nombre) {
        ArrayList<Persona> personasPorNombre = new ArrayList<Persona>();
        for (Persona persona : personas) {
            if (persona.getNombre().equals(nombre)) {
                personasPorNombre.add(persona);
            }
        }
        return personasPorNombre;
    }

    public Persona obtenerPersonaPorRut(String rut) {
        for (Persona persona : personas) {
            if (persona.getRut().equals(rut)) {
                return persona;
            }
        }
        return null;
    }
}
