import java.util.ArrayList;
import java.util.List;

public class Product {
   private int id;
   private String name;
   private int price;
   private List<Category> listProduct = new ArrayList<>();

    public Product(int id, String newName, int newMoney, String category) {
    }

    public Product() {
        this.name = name;
        this.price = price;
        this.listProduct = listProduct;
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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public List<Category> getListProduct() {
        return listProduct;
    }

    public void setListProduct(List<Category> listProduct) {
        this.listProduct = listProduct;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", listProduct=" + listProduct +
                '}';
    }
}
