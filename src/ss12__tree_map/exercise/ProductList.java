package ss12__tree_map.exercise;

public class ProductList {
    private int id=0;
    private String name;
    private double price;
    private int amount;
    private String production;

    public ProductList() {
    }

    public ProductList(int id, String name, double price, int amount, String production) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.amount = amount;
        this.production = production;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getProduction() {
        return production;
    }

    public void setProduction(String production) {
        this.production = production;
    }

    @Override
    public String toString() {
        return "ProductList có id: " + id +
                " Tên: " + name + '\'' +
                " Giá: " + price +
                " Số lượng: " + amount +
                " Nhà sản xuất: " + production;
    }
}
