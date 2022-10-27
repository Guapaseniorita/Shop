public class Chair extends Mebel{

    public Chair(String material, String color, int height, int weight) {
        super(material, color, height, weight);
    }

    @Override
    public void collect() {
        System.out.println("Стул собран");
    }

    @Override
    public void dismantle() {
        System.out.println("Стул разобран");
    }
}
