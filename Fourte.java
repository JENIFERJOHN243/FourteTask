package fourte;

import java.util.Scanner;

public class Fourte {
	public static void main(String[] args) {
		Fourte fourte=new Fourte();
		fourte.Start();
	}

	private void Start() {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the resultant Value");
		int result=scanner.nextInt();
		System.out.println("Enter the four Numbers");
		int num1=scanner.nextInt();
		int num2=scanner.nextInt();
		int num3=scanner.nextInt();
		int num4=scanner.nextInt();
		System.out.println();
		equationAddition(num1,num2,num3,num4,result);
		equationSubtraction(num1,num2,num3,num4,result);
		equationDoubleCombination(num1,num2,num3,num4,result);
		equationTripleCombination(num1,num2,num3,num4,result);
	}

	private void equationTripleCombination(int num1, int num2, int num3, int num4, int result) {
		boolean boolValue=false;
		while(!boolValue) {
			if(num1+(num2-num3-num4)==result) {
				System.out.println(num1+"+("+num2+"-"+num3+"-"+num4+")");
				boolValue=true;
			}else if(num1+(num3-num2-num4)==result) {
				System.out.println(num1+"+("+num3+"-"+num2+"-"+num4+")");
				boolValue=true;
			}else if(num1+(num4-num3-num2)==result) {
				System.out.println(num1+"+("+num4+"-"+num3+"-"+num2+")");
				boolValue=true;
			}else if(num1+(num2-num4-num3)==result) {
				System.out.println(num1+"+("+num2+"-"+num4+"-"+num3+")");
				boolValue=true;
			}else if(num2+(num1-num3-num4)==result) {
				System.out.println(num2+"+("+num1+"-"+num3+"-"+num4+")");
				boolValue=true;
			}else if(num2+(num3-num1-num4)==result) {
				System.out.println(num2+"+("+num3+"-"+num1+"-"+num4+")");
				boolValue=true;
			}else if(num2+(num4-num3-num1)==result) {
				System.out.println(num2+"+("+num4+"-"+num3+"-"+num1+")");
				boolValue=true;
			}else if(num2+(num1-num4-num3)==result) {
				System.out.println(num2+"+("+num1+"-"+num4+"-"+num3+")");
				boolValue=true;
			}else if(num3+(num1-num2-num4)==result) {
				System.out.println(num3+"+("+num1+"-"+num2+"-"+num4+")");
				boolValue=true;
			}else if(num3+(num2-num1-num4)==result) {
				System.out.println(num3+"+("+num2+"-"+num1+"-"+num4+")");
				boolValue=true;
			}else if(num3+(num4-num2-num1)==result) {
				System.out.println(num3+"+("+num4+"-"+num1+"-"+num1+")");
				boolValue=true;
			}else if(num3+(num1-num4-num2)==result) {
				System.out.println(num3+"+("+num1+"-"+num4+"-"+num2+")");
				boolValue=true;
			}else if(num4+(num1-num2-num3)==result) {
				System.out.println(num4+"+("+num1+"-"+num2+"-"+num3+")");
				boolValue=true;
			}else if(num4+(num2-num1-num3)==result) {
				System.out.println(num4+"+("+num2+"-"+num1+"-"+num3+")");
				boolValue=true;
			}else if(num4+(num3-num2-num1)==result) {
				System.out.println(num4+"+("+num3+"-"+num2+"-"+num1+")");
				boolValue=true;
			}else if(num4+(num1-num3-num2)==result) {
				System.out.println(num4+"+("+num1+"-"+num3+"-"+num2+")");
				boolValue=true;
			}
		}
		
	}

	private void equationDoubleCombination(int num1, int num2, int num3, int num4, int result) {
		boolean boolValue=false;
		while(!boolValue) {
		if(((num1+num2)-(num3+num4))==result) {
			System.out.println("("+num1+"+"+num2+")-("+num3+"+"+num4+")");
			boolValue=true;
		}else if(((num1+num3)-(num2+num4))==result){
			System.out.println("("+num1+"+"+num3+")-("+num2+"+"+num4+")");
			boolValue=true;
		}else if(((num1+num4)-(num2+num3))==result){
			System.out.println("("+num1+"+"+num4+")-("+num2+"+"+num3+")");
			boolValue=true;
		}else if(((num2+num3)-(num1+num4))==result){
			System.out.println("("+num2+"+"+num3+")-("+num1+"+"+num4+")");
			boolValue=true;
		}else if(((num2+num4)-(num1+num3))==result){
			System.out.println("("+num2+"+"+num4+")-("+num1+"+"+num3+")");
			boolValue=true;
		}else if(((num3+num4)-(num1+num2))==result){
			System.out.println("("+num3+"+"+num4+")-("+num1+"+"+num2+")");
			boolValue=true;
		}else if(((num1-num2)+(num3-num4))==result){
			System.out.println("("+num1+"-"+num2+")+("+num3+"+"+num4+")");
			boolValue=true;
		}else if(((num2-num1)+(num4-num3))==result){
			System.out.println("("+num2+"-"+num1+")+("+num4+"-"+num3+")");
			boolValue=true;
		}else if(((num1-num3)+(num2-num4))==result){
			System.out.println("("+num1+"-"+num3+")+("+num2+"-"+num4+")");
			boolValue=true;
		}else if(((num3-num1)+(num4-num2))==result){
			System.out.println("("+num3+"-"+num1+")+("+num4+"-"+num2+")");
			boolValue=true;
		}else if(((num1-num4)+(num2-num3))==result){
			System.out.println("("+num1+"-"+num4+")+("+num2+"-"+num3+")");
			boolValue=true;
		}else if(((num4-num1)+(num3-num2))==result){
			System.out.println("("+num4+"-"+num1+")+("+num3+"-"+num2+")");
			boolValue=true;
		}else if(((num2-num1)+(num3-num4))==result){
			System.out.println("("+num2+"-"+num1+")+("+num3+"-"+num4+")");
		}else if(((num1-num2)+(num4-num3))==result){
			System.out.println("("+num1+"-"+num2+")+("+num4+"-"+num3+")");
			boolValue=true;
		}else if(((num2-num3)+(num1-num4))==result){
			System.out.println("("+num2+"-"+num3+")+("+num1+"-"+num4+")");
			boolValue=true;
		}else if(((num3-num2)+(num4-num1))==result){
			System.out.println("("+num3+"-"+num2+")+("+num4+"-"+num1+")");
			boolValue=true;
		}else if(((num2-num4)+(num1-num3))==result){
			System.out.println("("+num2+"-"+num4+")+("+num1+"-"+num3+")");
			boolValue=true;
		}else if(((num4-num2)+(num3-num1))==result){
			System.out.println("("+num4+"-"+num2+")+("+num3+"-"+num1+")");
			boolValue=true;
		}else if(((num3-num1)+(num2-num4))==result){
			System.out.println("("+num3+"-"+num1+")+("+num2+"-"+num4+")");
			boolValue=true;
		}else if(((num1-num3)+(num4-num2))==result){
			System.out.println("("+num1+"-"+num3+")+("+num4+"-"+num2+")");
			boolValue=true;
		}else if(((num3-num2)+(num1-num4))==result){
			System.out.println("("+num3+"-"+num2+")+("+num1+"-"+num4+")");
			boolValue=true;
		}else if(((num2-num3)+(num4-num1))==result){
			System.out.println("("+num2+"-"+num3+")+("+num4+"-"+num1+")");
			boolValue=true;
		}else if(((num3-num4)+(num1-num2))==result){
			System.out.println("("+num3+"-"+num4+")+("+num1+"-"+num2+")");
			boolValue=true;
		}else if(((num4-num3)+(num2-num1))==result){
			System.out.println("("+num4+"-"+num3+")+("+num2+"-"+num1+")");
			boolValue=true;
		}else if(((num4-num1)+(num2-num3))==result){
			System.out.println("("+num4+"-"+num1+")+("+num2+"-"+num3+")");
			boolValue=true;
		}else if(((num1-num4)+(num3-num2))==result){
			System.out.println("("+num1+"-"+num4+")+("+num3+"-"+num2+")");
			boolValue=true;
		}else if(((num4-num2)+(num1-num3))==result){
			System.out.println("("+num4+"-"+num2+")+("+num1+"-"+num3+")");
			boolValue=true;
		}else if(((num2-num4)+(num3-num1))==result){
			System.out.println("("+num2+"-"+num4+")+("+num3+"-"+num1+")");
			boolValue=true;
		}else if(((num4-num2)+(num1-num3))==result){
			System.out.println("("+num4+"-"+num2+")+("+num1+"-"+num3+")");
			boolValue=true;
		}else if(((num4-num3)+(num1-num2))==result){
			System.out.println("("+num4+"-"+num3+")+("+num1+"-"+num2+")");
			boolValue=true;
		}else if(((num3-num4)+(num2-num1))==result){
			System.out.println("("+num3+"-"+num4+")+("+num2+"-"+num1+")");
			boolValue=true;
		}else {
			boolValue=true;
		}
		}
		
	}

	private void equationSubtraction(int num1, int num2, int num3, int num4, int result) {
		boolean boolValue=false;
		while(!boolValue) {
		if(num1-num2-num3-num4==result) {
			System.out.println(num1+"-"+num2+"-"+num3+"-"+num4);
			boolValue=true;
		}else if(num2-num1-num3-num4==result) {
			System.out.println(num2+"-"+num1+"-"+num3+"-"+num4);
			boolValue=true;
		}else if(num3-num2-num1-num4==result) {
			System.out.println(num3+"-"+num2+"-"+num1+"-"+num4);
			boolValue=true;
		}else if(num4-num2-num3-num1==result) {
			System.out.println(num4+"-"+num2+"-"+num3+"-"+num1);
			boolValue=true;
		}else if(num1-num3-num2-num4==result) {
			System.out.println(num1+"-"+num3+"-"+num2+"-"+num4);
			boolValue=true;
		}else if(num1-num4-num3-num2==result) {
			System.out.println(num1+"-"+num4+"-"+num3+"-"+num2);
			boolValue=true;
		}else if(num1-num2-num4-num3==result) {
			System.out.println(num1+"-"+num2+"-"+num4+"-"+num3);
			boolValue=true;
		}else if(num1-num2-num4-num3==result) {
			System.out.println(num1+"-"+num2+"-"+num4+"-"+num3);
			boolValue=true;
		}else {
			boolValue=true;
		}
	}
		
	}

	private void equationAddition(int num1, int num2, int num3, int num4,int result) {
		if(num1+num2+num3+num4==result) {
			System.out.println(num1+"+"+num2+"+"+num3+"+"+num4);
		}
	}
	
	

}
