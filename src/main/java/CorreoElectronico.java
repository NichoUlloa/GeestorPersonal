public class CorreoElectronico {
    private String correoElectronico;
    private String proveedor;

    public CorreoElectronico(String correoElectronico, String proveedor) {
        this.correoElectronico = correoElectronico;
        this.proveedor = proveedor;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }
    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getProveedor() {
        return proveedor;
    }
    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }
}
