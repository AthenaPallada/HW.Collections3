package product;

import java.util.HashMap;
import java.util.Map;

public class ProductList {
    private HashMap<Product, Integer> productList;

    private int totalCost=0;

    public ProductList(HashMap<Product, Integer> productList) {

        this.productList = productList;
    }

    public HashMap<Product, Integer> getProductList() {
        return productList;
    }

    public void setProductList(HashMap<Product, Integer> productList) {
        this.productList = productList;
    }

    public void sumTotalCost() {
        for (Map.Entry<Product, Integer> count : productList.entrySet()) {
            totalCost = count.getKey().getPrice()*count.getValue()+totalCost;
        }

        System.out.println(totalCost);
    }

//    private Set<Product> products;
//
//    public ProductList(Set<Product> products) {
//        this.products = products;
//    }
//
//    public void add(Product product) {
//        if(products.contains(product)) {
//            throw new IllegalArgumentException("Такой продукт уже есть");
//        }
//        products.add(product);
//    }
//
//    public void remove(Product product) {
//        if(!products.remove(product)) {
//            throw new IllegalArgumentException("Такого продукта нет");
//        }
//        //products.remove(product);
//    }
}