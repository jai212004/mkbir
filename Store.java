import java.util.ArrayList;

public class Store {
    public static void main(String[] args) {
        products burger = new products("burger" , 50);
        products pizza = new products("pizza" , 70);
        order jai = new order();
        System.out.println(jai.getOrderno());
        jai.addproduct(burger);
        System.out.println(jai.getOrder());
        jai.addproduct(pizza);
        System.out.println(jai.getOrder());
    }
}
