package ex01;

public class ForEx07 {
	 
	public static void main(String[] args) {
		
		int[] arr = {1,5,4,3,2};
		
		for(int i=0; i<5; i++)
			System.out.print(arr[i] + " ");
		
		System.out.println("\n------------향상된 for-----------");
		
		for(int num : arr) //arr값을 앞의 num으로 대입
			System.out.print(num + " ");
		
		System.out.println("\n-----------배열 합 구하기-----------");
		
		int sum = 0;
		for(int i=0; i<5; i++) {
			sum += arr[i];
		}
		System.out.println("sum : " + sum);
	 }
}
