package com.gildedrose;

public class Item {

    public String name; // ��ǰ�̸�

    public int sellIn; // �Ǹű���

    public int quality; // ǰ��

    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

   @Override
   public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }
}