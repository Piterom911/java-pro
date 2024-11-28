package com.telran.practice.practice09;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {

    public static void main(String[] args) {
        Data data1 = new Data(1, "A");
        Data data2 = new Data(2, "B");
        Data data3 = new Data(3, "C");

//        Set<Data> set1 = new TreeSet<>();
//        set1.add(data1);
//        set1.add(data2);
//        set1.add(data3);

        Set<Data> set2 = new HashSet<>();
        set2.add(data1);
        set2.add(data2);
        set2.add(data3);
        System.out.println(set2);
    }

    static class Data {

        private int intData;

        private String strData;

        public Data(int intData, String strData) {
            this.intData = intData;
            this.strData = strData;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Data data = (Data) o;
            return intData == data.intData && Objects.equals(strData, data.strData);
        }

        @Override
        public int hashCode() {
            return Objects.hash(intData, strData);
        }

        @Override
        public String toString() {
            return "Data{" +
                    "intData=" + intData +
                    ", strData='" + strData + '\'' +
                    '}';
        }
    }
}
