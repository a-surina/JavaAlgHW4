//3. My own class:
public class MyClass {
    //1. Primitive:
    int id;
    double price;
    boolean inStock;
    //2. Non-primitive:
    String name;

    //Random id constructor
    public MyClass(double price, boolean inStock, String name) {
        this.id = 10_000 + (int) (Math.random() * 90_000);
        this.price = price;
        this.inStock = inStock;
        this.name = name;
    }

    //Id given constructor
    public MyClass(int id, double price, boolean inStock, String name) {
        this.id = id;
        this.price = price;
        this.inStock = inStock;
        this.name = name;
    }

    public void printer() {
        System.out.print("id: " + id + " " + name + " " + price + " " + inStock + "\n");
    }

    public boolean equals(MyClass item) {
        return ((this.id == item.id) &&
                (this.price == item.price) &&
                (this.inStock == item.inStock) &&
                (this.name.equals(item.name)));
    }
}
