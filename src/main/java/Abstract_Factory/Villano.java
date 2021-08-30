package Abstract_Factory;

public class Villano implements Factory_Personaje{

    @Override
    public Marvel getMarvel() {
        return new Marvel_Villano("Thanos");
    }

    @Override
    public DC_Comics getDC_Comics() {
        return new DC_Villano("Joker");
    }

    @Override
    public Nintendo getNintendo() {
        return new Nintendo_Villano("Wario");
    }
}