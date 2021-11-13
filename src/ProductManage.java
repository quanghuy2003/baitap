import java.util.ArrayList;

public class ProductManage implements Interface<Product> {
    private ArrayList<Product> listProduct = new ArrayList<>();
//    int id = -1;

    public ProductManage(ArrayList<Product> listProduct) {
        this.listProduct = listProduct;
    }

    public ProductManage() {

    }

    public ArrayList<Product> getListProduct() {
        return listProduct;
    }

    public void setListProduct(ArrayList<Product> listProduct) {
        this.listProduct = listProduct;
    }

    @Override
    public void add(Product product) {
//        id++;
        listProduct.add(product);
//        getListProduct().get(id).setId(id);
    }



    @Override
    public void delete(String name) {
        int index = findByName(name);
        listProduct.remove(index);
    }

    @Override
    public void update(String name, Product product) {
        int index = findByName(name);
        listProduct.set(index, product);
    }


    @Override
    public void display() {
        for (Product product : listProduct) {
            System.out.println(product);
        }
    }

    @Override
    public int findByName(String name) {
        for (int i = 0; i < listProduct.size(); i++) {
            if (listProduct.get(i).getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }
}
