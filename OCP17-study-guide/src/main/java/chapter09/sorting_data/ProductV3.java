package chapter09.sorting_data;

import java.util.Objects;

public class ProductV3 implements Comparable<ProductV3> {
    private int id;
    private String name;

    public ProductV3(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductV3 productV2 = (ProductV3) o;
        return id == productV2.id && Objects.equals(name, productV2.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public int compareTo(ProductV3 obj) {
        int result = this.name.compareTo(obj.name);
        if (result != 0) {
            return id - obj.id;
        }
        return result;
    }

    @Override
    public String toString() {
        return "ProductV2{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}