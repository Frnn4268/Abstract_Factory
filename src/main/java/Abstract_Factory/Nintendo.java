package Abstract_Factory;

public abstract class Nintendo {
    private String Nombre;
    
    public Nintendo(String Nombre){
        this.Nombre = Nombre;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
}
