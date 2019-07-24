package com.gildedrose;

class GildedRose {
	private static final int MAX_QUALITY = 50; //extract constant
	private static final String SULFURAS = "Sulfuras, Hand of Ragnaros";
	private static final String AGED_BRIE = "Aged Brie";
	private static final String BACKSTAGE_PASSES = "Backstage passes to a TAFKAL80ETC concert";

	Item[] items;

	public GildedRose(Item[] items) {
		this.items = items;
	}

	public void updateQuality() {
		for (int i = 0; i < items.length; i++) {
			updateQuality(items[i]); //inline local variable
			updateSellin(items[i]);
		}
	}

	private void updateQuality(Item item) {
		if (item.name.equals(AGED_BRIE)) {
			updateQualityForAgedBrie(item);
		} else if (item.name.equals(BACKSTAGE_PASSES)) {
			updateQualityForBackstagePasses(item);
		} else if (item.name.equals(SULFURAS)) {
			updateQualityForSulfuras(item);
		} else {
			updateQualityForNormalItem(item);
		}
	}

	private void updateSellin(Item item) {
		if (item.name.equals(SULFURAS)) {
		} else {
			item.sellIn = item.sellIn - 1;
		}
	}

	private void updateQualityForNormalItem(Item item) {
		if (item.quality > 0) {
			item.quality = item.quality - 1;
		}
		if (item.sellIn < 1) {
			if (item.quality > 0) {
				item.quality = item.quality - 1;

			}
		}
	}

	private void updateQualityForSulfuras(Item item) {
		if (item.quality > 0) {
		}
		if (item.sellIn < 0) {
			if (item.quality > 0) {
			}
		}
	}

	private void updateQualityForBackstagePasses(Item item) {
		if (item.quality < MAX_QUALITY) {
			item.quality = item.quality + 1;

			if (item.sellIn < 11) {
				if (item.quality < MAX_QUALITY) {
					item.quality = item.quality + 1;
				}
			}

			if (item.sellIn < 6) {
				if (item.quality < MAX_QUALITY) {
					item.quality = item.quality + 1;
				}
			}
		}
		if (item.sellIn < 1) {
			item.quality = item.quality - item.quality;
		}
	}

	private void updateQualityForAgedBrie(Item item) {
		if (item.quality < MAX_QUALITY) {
			item.quality = item.quality + 1;
		}
		if (item.sellIn < 1) {
			if (item.quality < MAX_QUALITY) {
				item.quality = item.quality + 1;
			}
		}
	}
}