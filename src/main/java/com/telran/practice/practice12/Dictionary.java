package com.telran.practice.practice12;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.*;

public class Dictionary {

    public static void main(String[] args) {
//      2. Имеется некоторый текст. Составить словарь используемых в нем слов с частотой их употребления.
//        Отсортировать словарь по частоте встречаемости слов (по убыванию).
        Map<String, Integer> dictionary = new HashMap<>();

        String text = getSomeText();
        Scanner scanner = new Scanner(text);

        while (scanner.hasNext()) {
            String word = scanner.next().toLowerCase();
            int count = dictionary.getOrDefault(word, 0);
            dictionary.put(word, ++count);
        }

        // IMPORTANT: a very dubious solution to the task 🫣❓❔
        List<Map.Entry<String, Integer>> entries = new ArrayList<>(dictionary.entrySet()); // O(n)
        entries.sort((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue())); // O(n * log n)

        System.out.println(entries);
    }

    public static String getSomeText() {
        try {
            HttpClient client = HttpClient.newHttpClient();

            HttpRequest request = HttpRequest.newBuilder()
                    .uri(new URI("https://www.omegle.com/"))
                    .GET()
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            System.out.println("HTTP Status: " + response.statusCode());
            return response.body();
        } catch (Exception e) {
            return "";
        }
    }
}
