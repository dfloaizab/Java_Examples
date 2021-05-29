public class Estudiante {

    //Atributos
    private String codigo;
    private String nombre;
    private int anio_nacimiento;
    private String email;
    private String telefono;
    private String pais;
    private boolean aprobo;

    //Métodos

    //Alt + insert (IntelliJ)
    public Estudiante() {
    }

    public Estudiante(String codigo, String nombre, String email) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.email = email;
    }

    public Estudiante(String codigo, String nombre, int anio_nacimiento, String email, String telefono, String pais, boolean aprobo) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.anio_nacimiento = anio_nacimiento;
        this.email = email;
        this.telefono = telefono;
        this.pais = pais;
        this.aprobo = aprobo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAnio_nacimiento(int anio_nacimiento) {
        this.anio_nacimiento = anio_nacimiento;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void setAprobo(boolean aprobo) {
        this.aprobo = aprobo;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getAnio_nacimiento() {
        return anio_nacimiento;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getPais() {
        return pais;
    }

    public boolean isAprobo() {
        return aprobo;
    }
}
