package com.storagenergy.website;
import java.util.List;

/**
 *
 * @author alex
 */
public class Product {
    private String productName;
    private List<String> productDescription;
    private List<Integer> productImages;
    private int layout;
    public Product(String productName, List<String> productDescription, List<Integer> productImages, int layout) {
        this.productName = productName;
        this.productDescription = productDescription;
        this.productImages = productImages;
        this.layout = layout;
    }
    
}
