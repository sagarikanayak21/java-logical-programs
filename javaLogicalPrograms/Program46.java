// Print all the elements of a matrix using for loop

class Program46 {
	public static void print2D(int mat[][])
	{
		for (int i = 0; i < mat.length; i++){
			for (int j = 0; j < mat[i].length; j++){
				System.out.print(mat[i][j] + " ");
            }
        }
	}
	public static void main(String args[]){
		int mat[][] = {{ 1, 2 },
						{ 5, 6 }};
		print2D(mat);
	}
}
