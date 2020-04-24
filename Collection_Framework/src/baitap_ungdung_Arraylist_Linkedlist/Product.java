package baitap_ungdung_Arraylist_Linkedlist;

public class Product implements Comparable<Product> {
    private String name;
    private String id;
    private double price;

    public Product(String name, String id, double price) {
        this.name = name;
        this.id = id;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", price=" + price +
                '}';
    }


    @Override
    public int compareTo(Product product) {
      if (this.getPrice()>product.getPrice()){
          return 1;
      } else if (this.getPrice()<product.getPrice()){
          return -1;
      } else {
          return 0;
      }
    }
}
