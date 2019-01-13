package WordScramble;
	/*[출처] [Java1000제]Word Scramble 1 - 단어 맞추기 (남궁성의 코드초보스터디(자바 java, c언어, javascript, python) |작성자 남궁성
	 * 
	 * [문제1] 다음의 예제를 완성하시오.
	 * 
	 * getAnswer(String[] strArr)는 
	 * 배열strArr의 요소중의 하나를 임의로 골라서 반환한다.(Math.random()사용)
	 * 
	 * getScrambledWord(String str)는 
	 * 주어진 문자열 str의 각 문자의 순서를 뒤섞은 다음, 새로운 문자열로 반환한다.
	 * 
	 * (Math.random()사용)
	 * 
	 */
class WordScrambleEx1 { 
	     public static void main(String[] args) { 
	           String[] strArr = { "CHANGE", "LOVE", "HOPE", "VIEW"}; 
	           String answer = getAnswer(strArr); 
	          String question = getScrambledWord(answer); 
	           
	           System.out.println("Question:"+ question); 
	           System.out.println("Answer:"+answer); 
	     } // main 
	     
	     //내가 짠 것
//	     public static String getAnswer(String[] strArr) { 
//	          int length = strArr.length;
//	          int num = (int)(Math.random()*length);
//	          String str =  strArr[num];
//	          return str;
//	     }  
	     
	     
	     public static String getAnswer(String[] strArr) { 
	            int idx = (int)(Math.random()*strArr.length); 
	            return strArr[idx]; 
	     }     
	     
	     public static String getScrambledWord(String str) { 
            char[] chArr = str.toCharArray();
            
            //문자열의 길이만큼 반복 수행
            for(int i=0;i<str.length();i++) {
            	//난수 발생시켜서 바꿀 위치 정함
            	int idx = (int)Math.random()*str.length();
            	
            	//두 변수의 값 바꾸기
            	char tmp = chArr[i];
            	chArr[i] = chArr[idx];
            	chArr[idx] = tmp;
            }
            return new String(chArr);
	     } // scramble(String str) 
}
	
	

