package java1000;

import java.util.Scanner;
//[문제3] 문제2의 예제를 변경해서, 문제를 맞추더라도 프로그램이 종료되지 않고 다음문제를 보여주도록 하세요.
//[출처] [Java1000제]Word Scramble 3 - 단어 맞추기 (남궁성의 코드초보스터디(자바 java, c언어, javascript, python) |작성자 남궁성
public class WordScramble3 {
	public static void main(String[] args) {
		String[] strArr = {"CHANGE", "LOVE", "HOPE", "VIEW"};
		
		String answer = getAnswer(strArr);
		String question = getScrambledWord(answer);
		Scanner sc = new Scanner(System.in);
		String user;
	
		while(true) {
			System.out.println("Question: " + question);
			System.out.println("Your answer is: ");
			
			user = sc.nextLine();
			
			if(user.equals("q") || user.equals("Q")) break;
			else if(user.equals(answer)||user.equals(answer.toLowerCase())) {
				System.out.println("정답입니다.");
				System.out.println("다음 문제입니다.");
				answer = getAnswer(strArr);
				question = getScrambledWord(answer);
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
