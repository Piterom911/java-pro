package com.telran.practice.practice10;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class CardApp {

    public static void main(String[] args) {
        MasterCard masterCardOne = new MasterCard(12);
        MasterCard masterCardTwo = new MasterCard(13);
        MasterCard masterCardThree = new MasterCard(14);

        VisaCard visaCardOne = new VisaCard(45);
        VisaCard visaCardTwo = new VisaCard(41);
        VisaCard visaCardThree = new VisaCard(37);

        Set<Card> cardSet = new TreeSet<>(Arrays.asList(masterCardOne, masterCardTwo, masterCardThree,
                visaCardOne, visaCardTwo, visaCardThree));

        System.out.println(cardSet);
    }
}