package programmers.level1;
//���ڿ� �ٷ�� �⺻
//���� ����
//���ڿ� s�� ���̰� 4 Ȥ�� 6�̰�, ���ڷθ� �������ִ��� Ȯ�����ִ� �Լ�, solution�� �ϼ��ϼ���. ���� ��� s�� a234�̸� False�� �����ϰ� 1234��� True�� �����ϸ� �˴ϴ�.
//
//���� ����
//s�� ���� 1 �̻�, ���� 8 ������ ���ڿ��Դϴ�.
//����� ��
//s	return
//a234	false
//1234	true


//�ƽ�Ű�ڵ带 �̿��� �ذ���
public class StringHandlingBasic {
	 	public boolean solution(String s) {
	        boolean answer = true;
	        if(s.length()!=4 && s.length()!=6){
	            return false;
	        }
	            for(int i=0;i<s.length();i++){
	                if(s.charAt(i)>57||s.charAt(i)<48){
	                    return false;
	                }
	            }
	        return answer;
	    }
}


//�ٸ��е��� �ذ���
/*
  
1.try catch�� ����� stringŸ�Կ��� intŸ������ ĳ���õ��߿� ����� ������ ����� Ǯ�̹��
class Solution {
    public boolean solution(String s) {
        if(s.length()==4||s.length()==6){
	        try{
	            int x = Integer.parseInt(s);   
	            return true;
	        }catch(NumberFormatException e){
	            return false;   
	        }
        }else{
        	return false;
    	}
	}
}

2.���Խ��� �̿��� �ذ���
		if (s.length() == 4 || s.length() == 6) return s.matches("(^[0-9]*$)");
        return false;
        
3.���׿����ڸ� ����ϰ� split�� ����� �ذ���
		return (s.length() != 4 && s.length() != 6) || (s.split("[0-9]").length > 0) ? false:true;

 */
