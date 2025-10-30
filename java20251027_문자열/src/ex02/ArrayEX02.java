package ex02;
/*
 * 정수배열 5개 생성후
 * 각 배열 초기화 이후, 각 배열 합을 구해서 출력
 */
public class ArrayEX02 {

	public static void main(String[] args) {
		
		//Arr >어레인지의 약자
    int[] numArr = {90,80,70,60,50};
                   //new int[]{90,80,70,60,50}으로 써도되나 위의 방법으로 하는게 좋음
    int sum= 0;
    
    //sum - numArr[0] + numAr[1].........; 대신
    
    for(int i=0; i<5; i++)
    	sum += numArr[i];
        /*
     * sum = sum + numARR[0]
     * SUM = SUM + NUMArr[1]......대신
     * sum = sum + numARR[2]
     * SUM = SUM + NUMArr[3]......대신
     * SUM = SUM + NUMArr[4]......대신
     */
    System.out.println("총합 : " + sum);
		
		
		
		
	}

}
