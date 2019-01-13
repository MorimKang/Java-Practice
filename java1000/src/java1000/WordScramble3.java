package java1000;

import java.util.Scanner;
//[����3] ����2�� ������ �����ؼ�, ������ ���ߴ��� ���α׷��� ������� �ʰ� ���������� �����ֵ��� �ϼ���.
//[��ó] [Java1000��]Word Scramble 3 - �ܾ� ���߱� (���ü��� �ڵ��ʺ����͵�(�ڹ� java, c���, javascript, python) |�ۼ��� ���ü�
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
				System.out.println("�����Դϴ�.");
				System.out.println("���� �����Դϴ�.");
				answer = getAnswer(strArr);
				question = getScrambledWord(answer);
			}
			else System.out.println(user +"/�� ������ �ƴմϴ�. �ٽ� �õ��غ�����.");
		}//while
	}//main
	
	public static String getAnswer(String[] strArr) { 
        int idx = (int)(Math.random()*strArr.length); 
        return strArr[idx]; 
  } 
  
  public static String getScrambledWord(String str) { 
	  	//string�� char[]�� �ٲپ��ִ� �Լ� toCharArray()
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
