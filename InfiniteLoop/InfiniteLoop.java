public class InfiniteLoop{

	public static void main(String[] args) {
		byte x = 0;
		for(int i=0; i<10;){
			i=i++;
			System.out.println(x++);
		}
		System.out.println("Never get here.");
	}

}