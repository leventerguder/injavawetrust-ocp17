package chapter09.sorting_data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductExample {

    public static void main(String[] args) {

        ProductV2 product1 = new ProductV2(10 ,"mobilephone");
        ProductV2 product2 = new ProductV2(50 ,"tablet");
        ProductV2 product3 = new ProductV2(30 ,"mobilephone");
        ProductV2 product4 = new ProductV2(40 ,"pc");
        ProductV2 product5 = new ProductV2(10 ,"mobilephone");

        System.out.println(product1.equals(product5)); // true
        System.out.println(product1.compareTo(product5)); // 0

        System.out.println(product1.equals(product3)); //false
        System.out.println(product1.compareTo(product3)); // 0

        List<ProductV2> products = new ArrayList<>();
        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product4);
        products.add(product5);


        System.out.println("### Before Collections.sort ###");
        System.out.println(products);

        Collections.sort(products);

        System.out.println("### After Collections.sort ###");
        System.out.println(products);
    }
}
