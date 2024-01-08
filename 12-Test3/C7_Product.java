public class C7_Product implements Comparable<C7_Product> {
    private String name;
    private float price;
    
   
    @Override
    public int compareTo(C7_Product otherProduct) {
        // Compare products based on price in descending order
        return Float.compare(otherProduct.getPrice(), this.price);
    }
    
    public C7_Product(String name, float price) {
        this.name = name;
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public float getPrice() {
        return price;
    }
    public void setPrice(float price) {
        this.price = price;
    }
    
}
