public  abstract class Food {
    protected String name;
    protected float price;

    public Food(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public float getPrice() {
        return price;
    }

    public abstract void setPrice(float price);
    public abstract void setPrice();
    

}
