import java.util.Scanner;

public class SupeMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProductManage productManage = new ProductManage();
        CategoryManage categoryManage = new CategoryManage();
        categoryManage.add(new Category(1, "1", "6"));
        categoryManage.add(new Category(2, "2", "7"));
//        categoryManage.add(new Category(3, "3", "8"));
//        categoryManage.add(new Category(4, "4", "9"));
//        categoryManage.add(new Category(5, "5", "10"));
        int choice;
        while (true) {
            System.out.println("+_+_+_+_+_+_+_+_+ MENU +_+_+_+_+_+_+_+_+");
            System.out.println(" 1 : Thêm sản phẩm ");
            System.out.println(" 2 : Xóa sản phẩm ");
            System.out.println(" 3 : Sửa sản phẩm ");
            System.out.println(" 4 : Tìm kiếm sản phẩm ");
            System.out.println(" 5 : hiển thị danh sách  ");
            System.out.println(" 0 : kết thúc ");

            System.out.println("nhập lựa chọn của bạn");
            choice = scanner.nextInt();
            switch (choice) {
                case 1 -> {
                    System.out.println("nhập id");
                    int id = scanner.nextInt();
                    System.out.println("nhập tên");
                    scanner.nextLine();
                    String newName = scanner.nextLine();
                    System.out.println("nhập tiền");
                    int newMoney = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("nhâp thể loại");
                    String category = scanner.nextLine();
                    for (int i = 0; i < categoryManage.getListCategory().size(); i++) {
                        if (categoryManage.getListCategory().get(i).getName().equals(category)) {
                            productManage.add(new Product(id,newName,newMoney,categoryManage.getListCategory()));
                            System.out.println("ok");
                        }

                    }
                }
                case 2-> {
                    System.out.println("nhập tên muốn xóa");
                    String deleteName = scanner.nextLine();
                    productManage.delete(deleteName);
                }
                case 3->{
                    System.out.println("nhập tên sp muốn sửa");
                    String updateName = scanner.nextLine();
                    System.out.println("id mới");
                    int newId = scanner.nextInt();
                    System.out.println("tên mới");;
                    String newName = scanner.nextLine();
                    System.out.println("giá mới");
                    int newPrice = scanner.nextInt();
                    System.out.println("nhập vào thể loại");
                    String newCategory = scanner.nextLine();
                    productManage.update(updateName,new Product(newId,newName,newPrice,categoryManage.getListCategory()));
                }
                case 4 ->{
                    System.out.println("nhập tên sp muốn tìm");
                    String findName = scanner.nextLine();
                    productManage.findByName(findName);
                }
                case 5 ->{
                    productManage.display();
                }
            }
        }
    }
}
