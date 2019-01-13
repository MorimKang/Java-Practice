package java1000;

import java.util.*;

public class WordScramble2 {
	public static void main(String[] args) {
		String[] strArr = {"CHANGE", "LOVE", "HOPE", "VIEW"};
		
		String answer = getAnswer(strArr);
		String question = getScrambledWord(answer);
		Scanner sc = new Scanner(System.in);
		String user;
	
		while(true) {
			System.out.println("Question: " + question);
			System.out.println("Your answer is: ");
					
			// 1. 화면을 통해 사용자의 입력을 받는다.(Scanner클래스 사용)			
            // 2. 사용자가 q 또는 Q를 입력하면 프로그램을 종료한다.		
            // 3. 사용자가 정답을 맞출때까지 반복하다가
            //     사용자가 정답을 맞추면 , while문을 빠져나간다.
			
			//next()는 공백을 기준으로 한 문자 혹은 한단어로 입력받음
			//nextLine()은 공백 상관없이 한줄 그대로 입력받음(엔터치면 넘어감)
			user = sc.nextLine();
			
			//문자열 비교 :  ==은 주소를 비교.
			//따라서 내용을 비교하는 equals를 써야함.
			//user=user.toUpperCase(); //대문자로 바꾸기
			//user=user.toLowerCase(); //소문자로 바꾸기
	
			if(user.equals("q") || user.equals("Q")) break;
			else if(user.equals(answer)||user.equals(answer.toLowerCase())) {
				System.out.println("정답입니다.");
				break;
			}
			else System.out.println(user +"/은 정답이 아닙니다. 다시 시도해보세요.");

		}//while
	}//main
	
	public static String getAnswer(String[] strArr) { 
        int idx = (int)(Math.random()*strArr.length); 
        return strArr[idx]; 
  } 
  
  public static String getScrambledWord(String str) { 
	  	//string을 char[]로 바꾸어주는 함수 toCharArray()
        char[] chArr = str.toCharArray(); 
        
        for(int i=0;i<str.length();i++) {
               int idx = (int)(Math.random()*str.length()); 
              
              char tmp = chArr[i]; 
              chArr[i] = chArr[idx]; 
              chArr[idx] = tmp; 
        } 

        return new String(chArr); 
  } // scramble(String str) 
}


