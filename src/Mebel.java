public abstract class Mebel {
    private String material;
    private String color;
    private int height;
    private int weight;
    public Mebel(String material, String color, int height, int weight){
        this.material = material;
        this.color = color;
        this.height = height;
        this.weight = weight;
    }

    public abstract void collect();
    public abstract void dismantle();

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    public String getMaterial() {
        return material;
    }
}
