package jp.co.aforce.practice;

public class PracticeTest2 {
	public static void main(String[] args) {
		
		/*-----練習問題1---------*/
		double TAX = 0.1;
		System.out.println(TAX*100 +"%");
		
		/*-----練習問題2---------*/
		int x=480;
		double price=x + x * TAX;
		System.out.println(Math.round(price));
		
		/*-----練習問題3---------*/
		String name = "古塚　仁志";
		System.out.println(name);
		
		/*-----練習問題4---------*/
		String syouhin ="この商品は";
		String en="円です。";
		
		System.out.println(syouhin + Math.round(price) + en);
		
		
	}
}
