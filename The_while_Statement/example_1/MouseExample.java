public class MouseExample{
	public static void main(String[] args){
		eatCheese(4);	
	}

	private static void eatCheese(int bitesOfCheese){
		int roomInBelly = 5;
		while (bitesOfCheese != 0 && roomInBelly != 0){
			bitesOfCheese --;
		}
		System.out.println(bitesOfCheese+" pieces of cheese left");
	}
}
