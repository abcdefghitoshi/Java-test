package jp.co.aforce.practice;

import java.util.ArrayList;

public class PracticeTest3 {
	public static void main(String[] args) {
		
		/*-----練習問題1---------*/
		String[] pen = {"シャープペン","ボールペン","リングノート","クリップ","消しゴム"};
		
		/*-----練習問題2---------*/
		
		System.out.println(pen[1]);
		
		/*-----練習問題3---------*/
		ArrayList <String> names = new ArrayList<>();
		names.add("山田太郎");
		names.add("鈴木花子");
		names.add("佐藤二郎");
		names.add("山田太郎");
		names.add("高橋三郎");
		
		/*-----練習問題5---------*/
		String name = names.get(2);
		System.out.println(name);
		
		
	}
}
