package prob2;

import java.util.Scanner;

public class GoodsApp {
	private static final int COUNT_GOODS = 3;

	public static void main(String[] args) {
		Goods[] arrayGoods = new Goods[COUNT_GOODS];
		Scanner scanner = new Scanner( System.in );
		for(int i=0;i<COUNT_GOODS;i++)
		{
		
		String name = scanner.next();
		String price = scanner.next();
		String num = scanner.next();
		
		arrayGoods[i] = new Goods(name,price,num);
		}
		
		for(int i=0;i<COUNT_GOODS;i++)
		{
			arrayGoods[i].show();
		}
	
		scanner.close();
	}
}
