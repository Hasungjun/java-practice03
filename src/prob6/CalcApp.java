package prob6;

import java.util.Scanner;


public class CalcApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while( true ) {
			
			System.out.print( ">> " );
			String expression = scanner.nextLine();
			if(expression.equals("quit"))
				break;
			String[] s = expression.split(" ");
			
			
			int a = Integer.parseInt(s[0]);
			String t = s[1];
			int b = Integer.parseInt(s[2]);
			
			if(t.equals("+"))
			{
				Add add = new Add();
				add.setValue(a, b);
				System.out.println(add.calculate());
			}
			else if(t.equals("-"))
			{
				Sub add = new Sub();
				add.setValue(a, b);
				System.out.println(add.calculate());
			}
			else if(t.equals("*"))
			{
				Mul add = new Mul();
				add.setValue(a, b);
				System.out.println(add.calculate());
			}
			else if(t.equals("/"))
			{
				Div add = new Div();
				add.setValue(a, b);
				System.out.println(add.calculate());
			}
			
			
		}

		}
}
