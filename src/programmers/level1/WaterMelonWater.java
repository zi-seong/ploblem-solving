package programmers.level1;

//���ڼ��ڼ��ڼ��ڼ��ڼ�?
//���� ����
//���̰� n�̰�, ���ڼ��ڼ��ڼ�....�� ���� ������ �����ϴ� ���ڿ��� �����ϴ� �Լ�, solution�� �ϼ��ϼ���. ������� n�� 4�̸� ���ڼ����� �����ϰ� 3�̶�� ���ڼ��� �����ϸ� �˴ϴ�.
//
//���� ����
//n�� ���� 10,000������ �ڿ����Դϴ�.
//����� ��
//n	return
//3	���ڼ�
//4	���ڼ���

//¦�� Ȧ�� �����ؼ� ���ڿ� ���̱�
class WaterMelonWater {
    public String solution(int n) {
        String answer = "";
        for(int i=1;i<=n;i++){
            if(i==1){
                answer += "��";
                continue;
            }else if(i%2==0){
                answer += "��";
                continue;
            }else if(i%2!=0){
                answer += "��";
                continue;
            } 
        }     
        return answer;
    }
}

//�ٸ��е��� �ذ���
/*
 1.StringBuffer�� ���׿����ڸ� ����� �ذ��� 
	 class Solution {
	  public String solution(int n) {
	       StringBuilder answer = new StringBuilder();
	        for (int i = 1; i <= n; i++) {
	            answer.append(i%2==0?"��":"��");
	        }
	        return answer.toString();
	  }
	 } 
 */


