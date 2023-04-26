package jp.co.aforce.practice;
import java.util.Random;

public class PracticeTest6 {
	public static void main(String[] args) {
		
		/*-----練習問題1---------*/
     Random random = new Random();
         int fortune = random.nextInt();
         
        switch(fortune){
        case 1:
        	System.out.println("吉です。");
        	break;
        case 2:
        	System.out.println("中吉です。");
        	break;
        case 3:
        	System.out.println("大吉です。");
        	break;
        default:
        	System.out.println("凶です。");
        	break;
        } 
		
		/*-----練習問題2---------*/
        int number = 1;
        		while(number <= 100) {
        			if(number % 7==0) {
        				System.out.print(number+",");
        			}
        			number++;
        		}
        		System.out.println();
        		
        /*-----練習問題3---------*/
        for(int i = 1; i < 9; i ++) {
        	for(int x = 1; x < 9; x ++) {
        		int y = i*x;
        		System.out.print(" ");        		
        		if(y<10) {
        			System.out.print(" ");
        		}
        		
        		System.out.print(y);
        		
        		        	}
        	System.out.println();
        }
		



	}
}
