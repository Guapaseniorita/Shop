public class Main {
    public static void main(String[] args) {
        Table tableWood = new Table("дерево", "коричневый", 150, 50);
        Chair chairWood = new Chair("дерево", "коричневый", 100, 100);
        Warehouse tables = new Warehouse("стол", 35);
        Warehouse chairs = new Warehouse("стул", 100);
        Buyer sasha = new Buyer("Саша", "нет");
        Seller vika = new Seller("Вика", "все");
        sasha.addThing("стул", 2);
        vika.sellProduct();
    }
}