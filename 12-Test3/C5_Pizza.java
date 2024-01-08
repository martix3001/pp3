public class C5_Pizza extends Food implements Extra{
    private int size;

    public C5_Pizza(String name, int size) {
        super(name);
        this.size = size;
    }
    
    @Override
    public void setPrice(float price) {
        this.price = price;
    }
    @Override
    public void setPrice() {
        this.price = size-10;  
    }

    @Override
    public float delivery() {
        if(size >= 50){
            return 8;
        }
        return 6;
    }

    @Override
    public float delivery(int n) {
        if(size >= 50){
            return 8+n;
        }
        return 6+n;
    }
    

    @Override
    public float discount() {
        if(getPrice() >= 30){
            return (float) 0.05;
        }
        return 0;
    }
    
    
}
