package chapter10;

public class DualMain {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {
				{0,0,0,0},
				{0,0},
				{0,0,0},
				{0,0,0,0}
		};
		for(int i = 0; i < arr.length; i++){
			for(int j = 0; j < arr[i].length; j++){
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}

}
