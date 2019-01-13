package SimpleQuiz;
//[문제3] 문제2에서 완성된 코드를 이용해서, 
//문제의 순서를 임의로 바꾸고, 선택지도 임의로 바뀌어 출력되도록 하세요.
//[출처] [Java1000제] Simple Quiz 3 - 간단한 다지선다형 문제 (남궁성의 코드초보스터디(자바 java, c언어, javascript, python) |작성자 남궁성

import java.util.Scanner;

class SimpleQuiz3 {
	 public static void main(String[] args) { 
         String[] data = { 
               "다음 중 키워드가 아닌 것은?`2`final`True`if`public", 
               "다음 중 자바의 연산자가 아닌 것은?`6`&`|`++`!=`/`^", 
               "다음 중 메서드의 반환값이 없음을 의미하는 키워드는?`1`void`null`false`", 
         }; 
         
         Scanner s = new Scanner(System.in); 
         int score = 0; 

         shuffle(data); // 문제를 섞는다.

         for(int i=0;i < data.length;i++) { 
               String[] tmp = data[i].split("`",3); 

               String question = tmp[0]; 
               String answer = tmp[1]; 
               String[] choices = tmp[2].split("`"); 

               //여기서 answer에 넣은 값이 choices[?] 안에 들어있는 내용이라서
               //답을 숫자로 적으면 일치하지 않게 나온다. 따라서>>
               answer = choices[Integer.parseInt(answer)-1];        
               
               shuffle(choices);// 선택지를 섞는다.

               System.out.println("["+(i+1)+"] "+question); 

               for(int x=0;x < choices.length; x++) { 
                   //코드를 완성하세요. 
            	   System.out.print((x+1)+"."+choices[x]+"\t");   
            	   
            	   //>>여기서 보기를 하나씩 정답의 내용과 비교해서
            	   //정답인 보기의 번호를 다시 answer에 넣어주어야
            	   //숫자로 답을 했을 때 정답이 처리가 된다.
            	   //대신 보기의 내용인 문자로 넣었을 경우는 안됨.
            	   if(choices[x].equals(answer) == true)
            		   answer = String.valueOf(x+1); 
               } 

               System.out.println(); 
               System.out.print("[답]"); 
               String input = s.nextLine(); 
          
              
               if(input.equals(answer)) { 
                     score++; 
               } 

               System.out.println(); 
               System.out.println(); 
         } 

         System.out.println("정답개수/전체문항수: "+score+"/"+data.length); 
   } // main 

   public static void shuffle(String[] data) {

        // 코드를 완성하세요.
        //  1. 배열data의 개수가 0보다 같거나 적으면 메서드 전체를 빠져나간다.
	   	if(data.length <= 0) {
	   		System.out.println("문제가 존재하지 않습니다.");
	   		return;
	   	}
        //  2. 선택지의 순서를 뒤바꾼다. 반복문과 Math.random()사용
	    for(int i=0; i<(data.length); i++) {
		   int idx  = (int)(Math.random()*data.length);
		   String tmp = data[idx];
		   data[idx] = data[i];
		   data[i] = tmp;
	   }   	
   } // shuffle() 
}
