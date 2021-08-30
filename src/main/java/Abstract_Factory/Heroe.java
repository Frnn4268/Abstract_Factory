package Abstract_Factory;

public class Heroe implements Factory_Personaje{

    @Override
    public Marvel getMarvel() {
        return new Marvel_Heroe("Spiderman");
    }

    @Override
    public DC_Comics getDC_Comics() {
        return new DC_Heroe("Wonder Woman");
    }

    @Override
    public Nintendo getNintendo() {
        return new Nintendo_Heroe("Mario");
    }
}