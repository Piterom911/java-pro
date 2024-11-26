package com.telran.summary.sammary7.storage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class StorageApp {

    public static void main(String[] args) {
        List<List<String>> listList = new ArrayList<>();

        List<String> listStrOne = Arrays.asList("google.com", "amazon.com");
        List<String> listStrTwo = Arrays.asList("ebay.com", "ebay.com");
        List<String> listStrThree = Arrays.asList("yahoo.com", "wallmart.com");

        listList.add(listStrOne);
        listList.add(listStrTwo);
        listList.add(listStrThree);

        RequestStorage requestStorage = new RequestStorage(listList);

        List<List<String>> requestList = requestStorage.getRequestList();
        for (int i = 0; i < requestList.size(); i++) {
            List<String> list1 = requestList.get(i);
            Iterator<String> iterator = list1.iterator();
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }
        }
    }
}
