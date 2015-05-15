package kadai5;

import java.util.Scanner;

public class IntToEng {
	static String[] number = {"zero","one","two","three","four","five","six","seven","eight","nine"};
	static String[] number1 = {"ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
	static String[] number2 = {"null","null","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
	
    // メインメソッド
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        System.out.println(translateEng(input));

    }

    // 数値を英訳する変換するメソッド
    static String translateEng(int n) {
    	String s = null;
    	int units = n % 10;
    	int ten = n / 10;
    	
    	if(n/10000>0){
    		s="ten thousand";
    	}else if(n/1000>0){
    		s=thousand(n);
    	}else if(n/100>0){
    		s=hundred(n);
    	} else {
    		s=tens(ten,units);
    	}
    	return s;
    }
    static String hundred(int n){
    	String s = null;
    	int hund = n / 100;
    	int tmp = n % 100;
    	int ten = tmp / 10;
    	int units = tmp % 10;
    	if(ten==0&&units==0) s=number[hund]+" hundred";
    	else if(ten==0) s=number[hund]+" hundred "+number[units];
    	else if(ten==1) s=number[hund]+" hundred "+number1[units];
    	else s=number[hund]+" hundred "+number2[ten]+" "+number[units];
    	return s;	
    }
    static String thousand(int n){
    	String s = null; 
    	int a = n / 100;
		int b = a / 10;
		int c = a % 10;
		int d = n % 100;
		int e = d /10;
		int f = d % 10;
    	int tho = n / 1000;
    	if(n%1000==0) s = number[tho]+" thousand";
    	else if(n%100==0) {
    		
    		s=tens(b,c)+" hundred";
    	}else if(c==0){
    		s=number[tho]+" thousand "+tens(e,f);
    	}
    	else{
    		s = tens(b,c)+ " hundred "+tens(e,f);
    	}
    	return s;
    }
    static String tens(int ten,int units){
    	String s=null;
    	if(ten==0)s=number[units];
    	else if(ten==1) s=number1[units];
    	else{
    		if(units==0)s=number2[ten];
    		else s=number2[ten] +" "+number[units];
    	}
    	return s;
    }
}