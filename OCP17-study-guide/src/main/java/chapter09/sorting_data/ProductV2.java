package chapter09.sorting_data;

import java.util.Objects;

public class ProductV2 implements Comparable<ProductV2> {
    private int id;
    private String name;

    public ProductV2(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductV2 productV2 = (ProductV2) o;
        return id == productV2.id && Objects.equals(name, productV2.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public int compareTo(ProductV2 obj) {
        return this.name.compareTo(obj.name);
    }

    @Override
    public String toString() {
        return "ProductV2{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}