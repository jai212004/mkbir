import java.util.ArrayList;
import java.util.Random;

public class order {
    private ArrayList<products> order;
    private int orderno;

    public ArrayList<products> getOrder() {
        return order;
    }

    public void setOrder(ArrayList<products> order) {
        this.order = order;
    }

    public int getOrderno() {
        return orderno;
    }

    public order() {
        this.order = new ArrayList<products>();
        int alpha = orderno();
        this.orderno = alpha;
    }

    public int orderno(){
        Random rand = new Random();
        int orderno = rand.nextInt(1000 , 2000);
        return orderno;
    }

    public boolean addproduct(products product){
        if (findproduct(product)){
            order.add(product);
            return true;
        }else {
            return false;
        }
    }

    public boolean findproduct(products products){
        order.add(products);
        return true;
    }
}
