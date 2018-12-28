package prob2;

public class Goods {

	private String name;
	private String price;
	private String num;
	
	
	public Goods(String name, String price, String num) {
		this.name = name;
		this.price = price;
		this.num = num;
	}
		
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	
	public void show() {
		System.out.println(name+"(가격:"+price+"원)이 "+num+"개 입고 되었습니다.");
	}
	
}
