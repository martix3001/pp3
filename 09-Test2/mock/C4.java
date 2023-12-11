import java.util.ArrayList;
public class C4 {

private ArrayList<Product> shoplist = new ArrayList<Product>();    

public void add(Product product){
        shoplist.add(product);
    }

public String toString(){
    String res = "";
    for(Product product: shoplist){
        res = res + product.getName()+",";
    }
    res = res.substring(0, res.length() -1);

    return res;
}    
public int total(){
    int c = 0;
    for(Product product: shoplist){
        c = c + product.getQuantity();
    }
    return c;

}

}
