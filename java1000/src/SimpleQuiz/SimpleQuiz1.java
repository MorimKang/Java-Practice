package SimpleQuiz;
//[����1] �־��� ���ڿ� �����͸� ������ �������� ���� ��µǵ��� �ڵ带 �ϼ��ϼ���.
//�������� ������ ����, ��, �������� ������ �Ǿ� ������ �����ڴ� `(����1���� Ű)�Դϴ�.
//[����QuizEx1.java]
//class QuizEx1 { 
//public static void main(String[] args) { 
//String[] data = { 
//      "���� �� Ű���尡 �ƴ� ����?`2`final`True`if`public", 
//      "���� �� �ڹ��� �����ڰ� �ƴ� ����?`5`&`|`++`!=`/`^", 
//      "���� �� �޼����� ��ȯ���� ������ �ǹ��ϴ� Ű�����?`1`void`null`false", 
//}; 
//for(int i=0;i<data.length;i++) {
//       // 1. StringŬ������ String[] split(String regex, int limit)�� ����ؼ� ������ �������� ��������.
//
//       // 2. ������ ����ϼ���.
//
//       // 3. �������� ������ ���� String[] split(String regex)�� ����ϼ���.
//
//       // 4.�ݺ����� �̿��ؼ� �������� ����ϼ���.
//} 
//} // main 
//}
//
//[������]
//
//[1] ���� �� Ű���尡 �ƴ� ����?
//1.final 2.True  3.if    4.public
//
//[2] ���� �� �ڹ��� �����ڰ� �ƴ� ����?
//1.&     2.|     3.++    4.!=    5./     6.^
//
//[3] ���� �� �޼����� ��ȯ���� ������ �ǹ��ϴ� Ű�����?
//1.void  2.null  3.false
//[��ó] [Java1000��] Simple Quiz 1 - ������ ���������� ���� (���ü��� �ڵ��ʺ����͵�(�ڹ� java, c���, javascript, python) |�ۼ��� ���ü�

		
class SimpleQuiz1 { 
    public static void main(String[] args) { 
          String[] data = { 
                "���� �� Ű���尡 �ƴ� ����?`2`final`True`if`public", 
                "���� �� �ڹ��� �����ڰ� �ƴ� ����?`5`&`|`++`!=`/`^", 
                "���� �� �޼����� ��ȯ���� ������ �ǹ��ϴ� Ű�����?`1`void`null`false", 
          }; 

          for(int i=0;i<data.length;i++) {
                 // 1. StringŬ������ String[] split(String regex, int limit)�� ����ؼ� ������ �������� ��������.
        	  String[] question = data[i].split("`", 3);
                 // 2. ������ ����ϼ���.
        	  System.out.println("["+(i+1)+"] "+question[0]);
                 // 3. �������� ������ ���� String[] split(String regex)�� ����ϼ���.
        	  String[] select = question[2].split("`");
                 // 4.�ݺ����� �̿��ؼ� �������� ����ϼ���.
        	  for(int j=0; j<select.length; j++) {
        		  System.out.print((j+1) + ". " + select[j] + " ");
        	  }
        	  System.out.println();System.out.println();
          } 
    } // main 
}