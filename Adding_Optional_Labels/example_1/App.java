public class App{
    public static void main (String[] args){

		int [][] matrix = {{1,13,5}, {1,2,5}, {2,7,2}};
		int value = 7;
		int line = -1;
		int column = -1;
		
		PARENT_LOOP: for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (value == matrix[i][j]) {
					line = i;
					column = j;
					break PARENT_LOOP;
				}
			}
		}
		
		if (line == -1 || column == -1) {
			System.out.println("Value "+value+" not found");
		}else {
			System.out.println("Value "+value+" found at line "+line+" and column "+column);
		}
    }
}