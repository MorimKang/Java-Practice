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
					
			// 1. ȭ���� ���� ������� �Է��� �޴´�.(ScannerŬ���� ���)			
            // 2. ����ڰ� q �Ǵ� Q�� �Է��ϸ� ���α׷��� �����Ѵ�.		
            // 3. ����ڰ� ������ ���⶧���� �ݺ��ϴٰ�
            //     ����ڰ� ������ ���߸� , while���� ����������.
			
			//next()�� ������ �������� �� ���� Ȥ�� �Ѵܾ�� �Է¹���
			//nextLine()�� ���� ������� ���� �״�� �Է¹���(����ġ�� �Ѿ)
			user = sc.nextLine();
			
			//���ڿ� �� :  ==�� �ּҸ� ��.
			//���� ������ ���ϴ� equals�� �����.
			//user=user.toUpperCase(); //�빮�ڷ� �ٲٱ�
			//user=user.toLowerCase(); //�ҹ��ڷ� �ٲٱ�
	
			if(user.equals("q") || user.equals("Q")) break;
			else if(user.equals(answer)||user.equals(answer.toLowerCase())) {
				System.out.println("�����Դϴ�.");
				break;
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


