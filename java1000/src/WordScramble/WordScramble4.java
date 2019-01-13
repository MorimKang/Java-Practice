package WordScramble;

import java.util.Scanner;

//[문제4] 실행결과를 잘 보고, 다음의 예제의 getHint메서드를 완성하세요.
//String getHint(String answer, char[] hint) - 문제의 답의 일부를 보여주는 메서드. 한번 틀릴 때마다 한글자씩 더 보여준다.
//answer - 문제의 정답
//hint - 문제의 이전 힌트(previous hint)
//[출처] [Java1000제]Word Scramble 4 - 단어 맞추기(3번답 포함) (남궁성의 코드초보스터디(자바 java, c언어, javascript, python) |작성자 남궁성
public class WordScramble4 {
	public static void main(String[] args) {
		String[] strArr = { "CHANGE", "LOVE", "HOPE", "VIEW" };
		Scanner sc = new Scanner(System.in); // 한번 생성해 놓고 재사용하면 되므로 반복문 밖으로 이동

		while (true) {
			String answer = getAnswer(strArr);
			String question = getScrambledWord(answer);
			char[] hint = new char[answer.length()];

			// hint를 '_'로 초기화 한다. 정답이 LOVE라면 hint는 "____"이 된다.
			for (int i = 0; i < hint.length; i++) {
				hint[i] = '_';
			}
			System.out.println(hint);

			while (true) {
				System.out.println("Question :" + question);
				System.out.print("Your answer is :");

				String input = sc.nextLine();

				// equalsIgnoreCase() 는 대소문자 구분 없이 비교.
				if (input.equalsIgnoreCase("q"))
					System.exit(0);

				if (input.equalsIgnoreCase(answer)) {
					System.out.println("정답입니다.");
					System.out.println();
					break;
				} else {
					System.out.println(input + "은/는 정답이 아닙니다. 다시 시도해보세요.");
					System.out.println("Hint:" + getHint(answer, hint));
				}
			} // while
		} // outer while

	} // main

	public static String getAnswer(String[] strArr) {
		int idx = (int) (Math.random() * strArr.length);
		return strArr[idx];
	}

	// 문제참고: 섞은 결과가 정답과 같은경우도 있을 수 있음. 복잡하지 않게... 그냥 간단히
	public static String getScrambledWord(String str) {
		char[] chArr = str.toCharArray();

		for (int i = 0; i < str.length(); i++) {
			int idx = (int) (Math.random() * str.length());

			char tmp = chArr[i];
			chArr[i] = chArr[idx];
			chArr[idx] = tmp;
		}
		return new String(chArr);
	} // scramble(String str)

	public static String getHint(String answer, char[] hint) { 
         int count = 0; // 힌트에 포함된 '_'의 개수
         char[] chAnswer = answer.toCharArray(); 
         
        // 1. 반복문을 이용해서 hint에 포함된 '_'의 개수를 센다.
         for(int i=0;i<hint.length;i++) {
        	 if(hint[i] == '_')count ++;
         }
         System.out.println(count);
         
        // 2. count의 값이 2보다 클 때만 정답의 한 글자를 hint에 넣는다.
        //    정답을 다 알려주는 상황이 되지 않게 하기 위함.
        //    [주의] 반드시 이전 힌트 보다 한글자를 더 보여줘야함.
        //    예를 들어 정답이 "LOVE"이고 이전 힌트가 "L___"이었다면
        //    그 다음 힌트는 "L__E"또는 "L_V_" 와 같은 식이어야 한다.
        //    Math.random()을 사용해서 정답의 한 글자를 골라서 힌트에 넣으면 된다.
        int idx;
		if (count > 2) {
			while(true) {
				idx = (int) (Math.random() * answer.length());
				if(hint[idx] == '_') {
					hint[idx] = chAnswer[idx];
					break;
				}
			}			
		}else System.out.println("정답은 "+ answer +"입니다." );
		return new String(hint);
   } // getHint()
}
