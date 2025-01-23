package com.telran.practice.practice19.cloneable;

import java.util.Objects;

public class Address implements Cloneable{

    private String street;

    public Address(String street) {
        this.street = street;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Address address)) return false;
        return Objects.equals(street, address.street);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(street);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
