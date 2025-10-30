package ex02;

import java.util.Arrays;

/*
 * --배열복사
 */
public class ArrayEX05 {

	public static void main(String[] args) {
		
       int[] numArr = {90,80,70,60,50};
      
                  
           System.out.println("Old numArr 길이 : " + numArr.length);
           System.out.println(Arrays.toString(numArr));
    
     //배열을 10개로 확장  
      int[] temp = new int[10];
      for(int i=0; i<numArr.length; i++) {
         temp[i] = numArr[i];
    }
         numArr= temp; //데이터를 큰곳으로 옮기고 나서 연결을 바뀐걸로 연결해주면 된다
       
         System.out.println("new numArr 길이 : " + numArr.length);
         System.out.println(Arrays.toString(numArr));
		
       
       
	}  

}
