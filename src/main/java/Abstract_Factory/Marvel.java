package Abstract_Factory;

public abstract class Marvel {
    private String Nombre;
    
    public Marvel(String Nombre){
        this.Nombre = Nombre;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
}
