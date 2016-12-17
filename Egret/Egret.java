public class Egret{

	private String color;
	
	public Egret(){
		this("white");
	}
	
	public Egret(String color){
		color = color;
	}
	//how can I create 2 Dog objects inside the main of the Dog class?
	public static void main(String[] args) {
		Egret e = new Egret();
		System.out.println("Color:"+e.color);
	}

}