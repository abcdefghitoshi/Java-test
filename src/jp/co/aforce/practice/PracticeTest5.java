package jp.co.aforce.practice;

import java.util.ArrayList;
import java.util.Calendar;

public class PracticeTest5 {
	public static void main(String[] args) {
		
		/*-----練習問題2---------*/
		ArrayList<String> animals = new ArrayList<>();
		animals.add("犬");
		animals.add("猫");
		animals.add("うさぎ");
		animals.add("へび");
		
		
		/*-----練習問題3---------*/
		String animal = "猫";
		 if (animals.contains(animal)) {
			 System.out.println(animal +"はリストに含まれています");
		 }else{
			 System.out.println(animal + "はリストに含まれていません");
		 }

		
		/*-----練習問題4---------*/
		 Calendar calendar =Calendar.getInstance();
		 int month = calendar.get(Calendar.MONTH);
	//	 System.out.println(month + 1 );
		
		
		/*-----練習問題5---------*/
        switch (month) {
        case 0:
        	System.out.println("冬物セール");
        	break;
        case 1:
        	System.out.println("春物を売る");
        	break;
        case 2:
        	System.out.println("春物を売る");
        	break;
        case 3:
        	System.out.println("春物を売る");
        	break;
        case 4:
        	System.out.println("春物セール");
        	break;
        case 5:
        	System.out.println("夏物を売る");
        	break;
        case 6:
        	System.out.println("夏物を売る");
        	break;
        case 7:
        	System.out.println("夏物セール");
        	break;
        case 8:
        	System.out.println("冬物セール");
        	break;
        case 9:
        	System.out.println("冬物を売る");
        	break;
        case 10:
        	System.out.println("冬物を売る");
        	break;
        case 11:
        	System.out.println("冬物セール");
        	break;
        default:
        	System.out.println("不正な月です");
        	break;
        
       
        }
		
	}
}
