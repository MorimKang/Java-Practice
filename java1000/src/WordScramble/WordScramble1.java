package WordScramble;
	/*[��ó] [Java1000��]Word Scramble 1 - �ܾ� ���߱� (���ü��� �ڵ��ʺ����͵�(�ڹ� java, c���, javascript, python) |�ۼ��� ���ü�
	 * 
	 * [����1] ������ ������ �ϼ��Ͻÿ�.
	 * 
	 * getAnswer(String[] strArr)�� 
	 * �迭strArr�� ������� �ϳ��� ���Ƿ� ��� ��ȯ�Ѵ�.(Math.random()���)
	 * 
	 * getScrambledWord(String str)�� 
	 * �־��� ���ڿ� str�� �� ������ ������ �ڼ��� ����, ���ο� ���ڿ��� ��ȯ�Ѵ�.
	 * 
	 * (Math.random()���)
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
	     
	     //���� § ��
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
            
            //���ڿ��� ���̸�ŭ �ݺ� ����
            for(int i=0;i<str.length();i++) {
            	//���� �߻����Ѽ� �ٲ� ��ġ ����
            	int idx = (int)Math.random()*str.length();
            	
            	//�� ������ �� �ٲٱ�
            	char tmp = chArr[i];
            	chArr[i] = chArr[idx];
            	chArr[idx] = tmp;
            }
            return new String(chArr);
	     } // scramble(String str) 
}
	
	

