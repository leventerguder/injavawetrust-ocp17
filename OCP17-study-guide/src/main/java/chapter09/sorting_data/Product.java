package chapter09.sorting_data;

public class Product implements Comparable<Product> {
    private int id;
    private String name;

    public Product(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int hashCode() {
        return id;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Product)) return false;
        var other = (Product) obj;
        return this.id == other.id;
    }
    // Product class defines a compareTo() method that is not consistent with equals:
    public int compareTo(Product obj) {
        return this.name.compareTo(obj.name);
    }
}