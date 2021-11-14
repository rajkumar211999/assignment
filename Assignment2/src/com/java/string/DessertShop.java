package com.java.string;

public class DessertShop {
	public static void main(String[] args) {
		Candy item1 = new Candy("Peanut Butter Fudge", 2.25, 3.99);
		Cookie item2 = new Cookie("Oatmeal Raisin Cookies", 4, 3.99);
		IceCream item3 = new IceCream("Vanilla Ice Cream", 2, 1.05, 0.45);

		System.out.println(item1);
		System.out.println(item2);
		System.out.println(item3);
		}
}
