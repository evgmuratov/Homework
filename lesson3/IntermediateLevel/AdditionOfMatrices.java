package IntermediateLevel;

public class AdditionOfMatrices {
	public int[][] addMatrix(int[][] array1, int[][] array2){
		int i;
		int k;
		int[][] resArray=new int[3][3];
		for (i=0; i<3; i++){
			for (k=0; k<3; k++){
				resArray[i][k]=array1[i][k]+array2[i][k];
			}
		}
		return resArray;
	}

	public static void main(String[] args) {
		int i;
		int k;
		int[][] firstMatrix = { 
				{ 1, 2, 3 }, 
				{ 3, 4, 5 }, 
				{ 5, 6, 7 }
				};
		int[][] secondMatrix = { 
				{ 1, 2, 3 }, 
				{ 3, 4, 5 }, 
				{ 5, 6, 7 }
				};
		int[][] finalMatrix;
		AdditionOfMatrices myArray=new AdditionOfMatrices();
		finalMatrix=myArray.addMatrix(firstMatrix, secondMatrix);
		for (i=0; i<3; i++){
			System.out.println();
			for (k=0; k<3; k++){
				System.out.print(finalMatrix[i][k]+" ");
			}
		}

	}

}
