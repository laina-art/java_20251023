package ex02;

import java.util.Arrays;

/*
 * -배열복사 - System.arrayscopy
 */
public class ArrayEX04 {

	public static void main(String[] args) {
		
       int[] numArr = {90,80,70,60,50};
      
                  
           System.out.println("Old numArr 길이 : " + numArr.length);
           System.out.println(Arrays.toString(numArr));
    


            int[] temp = new int[10];
            
            
           System.arraycopy(numArr,  0, temp, 2,numArr.length);
            
           numArr = temp;
            
           System.out.println("new numArr 길이 : " + numArr.length);
           System.out.println(Arrays.toString(numArr));
		
	}  

}
