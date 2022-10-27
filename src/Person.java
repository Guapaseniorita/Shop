public class Person {
    private String name;
    private String possibility;
    private int countProduct;
    public Person(String name, String possibility){
        this.name = name;
        this.possibility = possibility;
    }
    public String getPossibility(){
        return possibility;
    }
    public String getName() {
        return name;
    }

    public void addThing(String thing, int countProduct){
        System.out.println(thing + " добавлен в корзину");
    }
    public void deleteThing(String thing, int countProduct){
        System.out.println(thing + " удален из корзину");
    }
    public void arrangeGoods (){
        System.out.println("Товар расставлен");
    }
    public void sellProduct(){
        System.out.println("Товар продан");
    }
    public void buyProduct(String thing){
        System.out.println(thing + " куплен");
    }


}
