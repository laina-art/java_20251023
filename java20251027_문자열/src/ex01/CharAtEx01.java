package ex01;

public class CharAtEx01 {

	public static void main(String[] args) {

		String subject = "자바 프로그래밍";
		
		//"자바프로그래밍"에서 해당하는 index 번호 현 문자 추출
		char ch = subject.charAt(3);
		System.out.println(ch);
		
		
		//"자바 프로그래밍" 단어 갯수
		int len = subject.length();
		System.out.println("문자열 길이 : " + len);
		
		System.out.println("-------문자열 대체(변경)-------");
		System.out.println("before : " + subject);
		
		//"자바프로그래밍" 문장에서 자바를 파이썬으로 변경해서 새로운 문자열 생성
		subject = subject.replace("자바", "파이썬");
		
		System.out.println("after : " + subject);
		
		System.out.println("-------문자열 잘라내기-------");
		//index 4번쨰 위치에서 전부다 문자 추출
		String sub2 = subject.substring(4); //sub2 > 파이썬 프로그래밍  셀때 띄어쓰기까지 센다.
		System.out.println(sub2);
		
		String sub3= subject.substring(4,6); //4번에서 6번전까지 추출, 즉 4,5추출. 
		System.out.println(sub3);
		
		System.out.println("-------문자열 찾기-------");
		// "파이썬 프로그래밍"에서 프로라는 단어는 몇번쨰 index에 있는가?
		int index = subject.indexOf("그래밍");
		System.out.println("문자열 찾기 : " + index); //결과값 -1은 찾지못함임
		
		System.out.println("-------문자열 분리-------");
		//"파이썬 프로그래밍"을 공란 기준으로 분리
		String[] sub4 = subject.split("  ");
		System.out.println(sub4[0]);
		System.out.println(sub4[1]);
		
		System.out.println("-------문자열 합치기-------");
		String s = "대한";
		String s2 = "민국";
		// s 가지고 있는 "대한"에 s2가 가지고있는 민국을 합쳐서 새로운 문자열(대한민국)생성
	    String s3 = s.concat(s2);
	    System.out.println(s3);
		
	    System.out.println("-------문자열 합치기-------");
	    
	}

}
