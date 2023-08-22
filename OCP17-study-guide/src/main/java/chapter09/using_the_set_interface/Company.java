package chapter09.using_the_set_interface;

import java.util.Objects;

public class Company {

    private int id;

    private String name;

    private String country;

    public Company(int id, String name, String country) {
        this.id = id;
        this.name = name;
        this.country = country;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Company company = (Company) o;
        return id == company.id && Objects.equals(name, company.name) && Objects.equals(country, company.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, country);
    }
}
