package ex03;

import java.util.Arrays;

public class LottoEx02 {

	public static void main(String[] args) {
		/*
		 * 로또 프로그램
		 * 배열 : 6칸 짜리 int배열
		 * 로또는 1~45 랜덤하게 저장
		 * 단, 중복불가
		 */
		int[] lotto = new int[6];
		boolean flag = false;
		
	    for(int i=0; i<lotto.length; i++) {
	    	
         int tmp = (int)(Math.random()*45)+1;
		
				
		 for(int j=0; j<lotto.length; j++) {
			if(tmp == lotto[j]) {
				flag =true;
				break;
			}
	}
            if(flag == false) {
            	lotto[i] = tmp;
            }else {
            	i--;
            	flag = false;
            }
	    }
          System.out.println(Arrays.toString(lotto));
            }
	    }