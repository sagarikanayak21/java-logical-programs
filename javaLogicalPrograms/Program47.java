// Print all the elements of a matrix using for each loop

class Program47 {

	public static void print2D(int mat[][]){
		for (int[] row : mat){
            for (int x : row){
				System.out.print(x + " ");
            }
        }
	}
	public static void main(String args[]){
		int mat[][] = { { 1, 2, 3 },
						{ 5, 6, 7 },
						{ 9, 10, 9 } };
		print2D(mat);
	}
}

