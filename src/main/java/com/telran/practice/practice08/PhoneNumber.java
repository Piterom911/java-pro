package com.telran.practice.practice08;

public class PhoneNumber {

    private String code;

    private String number;

    public PhoneNumber(String code, String number) {
        this.number = number;
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    @Override
    public String toString() {
        return "PhoneNumber{" +
                "code='" + code + '\'' +
                ", number='" + number + '\'' +
                '}';
    }
}
