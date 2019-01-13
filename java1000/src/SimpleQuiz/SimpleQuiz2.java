package SimpleQuiz;

import java.util.Scanner;

//[����2] ����1���� �ϼ��� �ڵ忡 ����� �Է��� �޾Ƽ� ���俩�θ� �Ǵ��Ͽ� �������� ����������
//
//�������� ���� ����ϵ��� �ڵ带 �ϼ��ϼ���.
//[��ó] [Java1000��] Simple Quiz 2 - ������ ���������� ���� (���ü��� �ڵ��ʺ����͵�(�ڹ� java, c���, javascript, python) |�ۼ��� ���ü�
//
//[������]
//
//[1] ���� �� Ű���尡 �ƴ� ����?
//1.final 2.True  3.if    4.public
//[��]2
//
//[2] ���� �� �ڹ��� �����ڰ� �ƴ� ����?
//1.&     2.|     3.++    4.!=    5./     6.^
//[��]6
//
//[3] ���� �� �޼����� ��ȯ���� ������ �ǹ��ϴ� Ű�����?
//1.void  2.null  3.false
//[��]1
//
//���䰳��/��ü���׼� :3/3


class SimpleQuiz2 {
	 public static void main(String[] args) { 
         String[] data = { 
               "���� �� Ű���尡 �ƴ� ����?`2`final`True`if`public", 
               "���� �� �ڹ��� �����ڰ� �ƴ� ����?`6`&`|`++`!=`/`^", 
               "���� �� �޼����� ��ȯ���� ������ �ǹ��ϴ� Ű�����?`1`void`null`false`", 
         }; 
         
         Scanner s = new Scanner(System.in); 
         int score = 0; 

         for(int i=0;i < data.length;i++) { 
               String[] tmp = data[i].split("`",3); 

               String question = tmp[0]; 
               String answer = tmp[1]; 
               String[] choices = tmp[2].split("`"); 

               System.out.println("["+(i+1)+"] "+question); 
               
               for(int x=0;x < choices.length;x++) { 
                     System.out.print((x+1)+"."+choices[x]+"\t"); 
               } 
               System.out.println(); 

               // �˸��� �ڵ带 ��������.
               System.out.println("["+"��"+"] ");
               String useranswer = s.next();
               if(useranswer.equals(answer))score++;

               System.out.println(); 
         } 
   
         // �˸��� �ڵ带 ��������.
         System.out.println("���䰳��/���װ���: " + score + "/3" );

   } // main 
}
