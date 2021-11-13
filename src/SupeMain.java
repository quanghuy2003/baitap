import java.util.Scanner;

public class SupeMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CategoryManage categoryManage = new CategoryManage();
        categoryManage.add(new Category(1, "huy1", "size lớn"));
        categoryManage.add(new Category(2, "huy2", "size lớn"));
        categoryManage.add(new Category(3, "huy3", "size lớn"));
        categoryManage.add(new Category(4, "huy4", "size lớn"));
        ProductManage productManage = new ProductManage();
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
                case 1 -> productManage.add(input());
                case 2 -> {
                    System.out.println("nhập tên muốn xóa");
                    String deleteName = scanner.nextLine();
                    productManage.delete(deleteName);
                }
                case 3 ->{
                    System.out.println("nhập tên sản phẩm muốn sửa");
                    String updatename = scanner.nextLine();
                    System.out.println("nhập id");
                    int idWantToFix = scanner.nextInt();
                    System.out.println("nhập tên");
                    String nameWantToFix = scanner.nextLine();
                    System.out.println("nhập tiền");
                    int moneyWantToFix = scanner.nextInt();
                    System.out.println("nhập thể loại");
                    String categoryWantToFix = scanner.nextLine();
                }
            }
        }
    }

    public static Product input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập id");
        int id = scanner.nextInt();
        System.out.println("nhập tên");
        String newName = scanner.nextLine();
        System.out.println("nhập tiền");
        int newMoney = scanner.nextInt();
        System.out.println("nhâp thể loại");
        String category = scanner.nextLine();
        return new Product(id, newName, newMoney, category);
    }
}
