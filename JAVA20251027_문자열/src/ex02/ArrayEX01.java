package ex02;
/*
 * 정수배열 5개 생성후
 * 각 배열 초기화 이후, 각 배열 합을 구해서 출력
 */
public class ArrayEX01 {

	public static void main(String[] args) {
		
		//Arr >어레인지의 약자
    int[] numArr = new int[5];
    
    numArr[0] =90;
    numArr[1] =80;
    numArr[2] =70;
    numArr[3] =60;
    numArr[4] =50;
    numArr[5] =90;

    int sum= 0;
    
    //sum - numArr[0] + numAr[1].........; 대신
    
    for(int i=0; i<5; i++)
    	sum += numArr[i];
        /*
     * sum = sum + numARR[0]
     * SUM = SUM + NUMArr[1]......대신
     */
    System.out.println("총합 : " + sum);
		
		
		
		
	}

}
