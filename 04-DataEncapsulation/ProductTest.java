public class ProductTest {
    public static void main(String[] args) {
        Product p1 = new Product();
        Product p2 = new Product();

        p1.setProductName("apple");
        p1.setVege(true);
        p2.setProductName("meat");
        p2.setVege(false);
        System.out.println(p1.getProductName()+" "+p1.isVege());
        System.out.println(p2.getProductName()+" "+p2.isVege());
    }
}
