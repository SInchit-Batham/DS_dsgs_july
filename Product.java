import java.util.*;  
class Product{  
    int id;  
    String name;  
    float price;  
    public Product(int id, String name, float price) {  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    }  
}  
 class JavaStreamExample {  
    public static void main(String[] args) {  
        List<Product> productsList = new ArrayList<Product>();  
        //Adding Products  
        productsList.add(new Product(1,"Android Phone",25000f));  
        productsList.add(new Product(2,"Windows Phone",30000f));  
        productsList.add(new Product(3,"Linux Phone",28000f));  
        productsList.add(new Product(4,"BlackBerry Phone",28000f));  
        productsList.add(new Product(5,"Apple Phone",90000f));  
        // This is for filtering data  
        productsList.stream()  
                             .filter(product -> product.price == 30000)  
                             .forEach(product -> System.out.println(product.name));    
    }  
}
