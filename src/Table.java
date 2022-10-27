public class Table extends Mebel{

    public Table(String material, String color, int height, int weight) {
        super(material, color, height, weight);
    }

    @Override
    public void collect() {
        System.out.println("Стол собран");
    }

    @Override
    public void dismantle() {
        System.out.println("Стол разобран");
    }
}
