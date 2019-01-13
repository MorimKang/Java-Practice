package SimpleQuiz;
//[����3] ����2���� �ϼ��� �ڵ带 �̿��ؼ�, 
//������ ������ ���Ƿ� �ٲٰ�, �������� ���Ƿ� �ٲ�� ��µǵ��� �ϼ���.
//[��ó] [Java1000��] Simple Quiz 3 - ������ ���������� ���� (���ü��� �ڵ��ʺ����͵�(�ڹ� java, c���, javascript, python) |�ۼ��� ���ü�

import java.util.Scanner;

class SimpleQuiz3 {
	 public static void main(String[] args) { 
         String[] data = { 
               "���� �� Ű���尡 �ƴ� ����?`2`final`True`if`public", 
               "���� �� �ڹ��� �����ڰ� �ƴ� ����?`6`&`|`++`!=`/`^", 
               "���� �� �޼����� ��ȯ���� ������ �ǹ��ϴ� Ű�����?`1`void`null`false`", 
         }; 
         
         Scanner s = new Scanner(System.in); 
         int score = 0; 

         shuffle(data); // ������ ���´�.

         for(int i=0;i < data.length;i++) { 
               String[] tmp = data[i].split("`",3); 

               String question = tmp[0]; 
               String answer = tmp[1]; 
               String[] choices = tmp[2].split("`"); 

               //���⼭ answer�� ���� ���� choices[?] �ȿ� ����ִ� �����̶�
               //���� ���ڷ� ������ ��ġ���� �ʰ� ���´�. ����>>
               answer = choices[Integer.parseInt(answer)-1];        
               
               shuffle(choices);// �������� ���´�.

               System.out.println("["+(i+1)+"] "+question); 

               for(int x=0;x < choices.length; x++) { 
                   //�ڵ带 �ϼ��ϼ���. 
            	   System.out.print((x+1)+"."+choices[x]+"\t");   
            	   
            	   //>>���⼭ ���⸦ �ϳ��� ������ ����� ���ؼ�
            	   //������ ������ ��ȣ�� �ٽ� answer�� �־��־��
            	   //���ڷ� ���� ���� �� ������ ó���� �ȴ�.
            	   //��� ������ ������ ���ڷ� �־��� ���� �ȵ�.
            	   if(choices[x].equals(answer) == true)
            		   answer = String.valueOf(x+1); 
               } 

               System.out.println(); 
               System.out.print("[��]"); 
               String input = s.nextLine(); 
          
              
               if(input.equals(answer)) { 
                     score++; 
               } 

               System.out.println(); 
               System.out.println(); 
         } 

         System.out.println("���䰳��/��ü���׼�: "+score+"/"+data.length); 
   } // main 

   public static void shuffle(String[] data) {

        // �ڵ带 �ϼ��ϼ���.
        //  1. �迭data�� ������ 0���� ���ų� ������ �޼��� ��ü�� ����������.
	   	if(data.length <= 0) {
	   		System.out.println("������ �������� �ʽ��ϴ�.");
	   		return;
	   	}
        //  2. �������� ������ �ڹٲ۴�. �ݺ����� Math.random()���
	    for(int i=0; i<(data.length); i++) {
		   int idx  = (int)(Math.random()*data.length);
		   String tmp = data[idx];
		   data[idx] = data[i];
		   data[i] = tmp;
	   }   	
   } // shuffle() 
}
