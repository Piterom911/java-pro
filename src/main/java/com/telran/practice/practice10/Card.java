package com.telran.practice.practice10;

/**
 * 2. Имеются банковские карты разных платежных систем:
 * public class MasterCard {
 *     private int masterCardId;
 * }
 *
 * public class Visa {
 *     private int visaId;
 * }
 * Реализовать возможность их хранения в общем TreeSet.
 */

public abstract class Card implements Comparable<Card>{

    public abstract int getCardId();

    @Override
    public int compareTo(Card o) {
        return this.getCardId() - o.getCardId();
    }
}
