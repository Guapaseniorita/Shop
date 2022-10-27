public class Buyer extends Person{

    public Buyer(String name, String possibility) {
        super(name, possibility);
    }

    @Override
    public void addThing(String thing, int countProduct) {
        super.addThing(thing, countProduct);
    }

    @Override
    public void deleteThing(String thing, int countProduct) {
        super.deleteThing(thing, countProduct);
    }

    @Override
    public void buyProduct(String thing) {
        super.buyProduct(thing);
    }
}
