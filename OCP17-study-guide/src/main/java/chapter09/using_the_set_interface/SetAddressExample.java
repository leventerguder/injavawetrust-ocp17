package chapter09.using_the_set_interface;

import java.util.HashSet;
import java.util.Set;

public class SetAddressExample {

    public static void main(String[] args) {

        Set<Address> addressSet = new HashSet<>();

        Address address1 = new Address(1, "Istanbul", "Istiklal");
        Address address2 = new Address(1, "Istanbul", "Istiklal");


        System.out.println("address1 == address2 : " + (address1 == address2));
        System.out.println("address1.equals(address2) : " + address1.equals(address2));

        addressSet.add(address1);
        addressSet.add(address2);

        System.out.println("addressSet.size() : " + addressSet.size());
        System.out.println(addressSet);

    }
}
