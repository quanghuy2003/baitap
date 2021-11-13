import java.util.ArrayList;

public class CategoryManage implements Interface<Category> {
    private ArrayList<Category> listCategory ;

    public CategoryManage() {
        listCategory = new ArrayList<>();
    }

    public CategoryManage(ArrayList<Category> listCategory) {
        this.listCategory = listCategory;
    }

    public ArrayList<Category> getListCategory() {
        return listCategory;
    }

    public void setListCategory(ArrayList<Category> listCategory) {
        this.listCategory = listCategory;
    }

    @Override
    public void add(Category category) {
        listCategory.add(category);
    }

    @Override
    public void delete(String name) {
        int index = findByName(name);
        listCategory.remove(index);
    }

    @Override
    public void update(String name, Category category) {
      int index = findByName(name);
      listCategory.set(index,category);
    }


    @Override
    public void display() {
        for (Category category : listCategory) {
            System.out.println(category);
        }
    }

    @Override
    public int findByName(String name) {
        for (int i = 0; i < listCategory.size(); i++) {
            if (listCategory.get(i).getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }
}
