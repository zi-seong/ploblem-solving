package programmers.level1;


//2016��
//���� ����
//2016�� 1�� 1���� �ݿ����Դϴ�. 2016�� a�� b���� ���� �����ϱ��? �� �� a ,b�� �Է¹޾� 2016�� a�� b���� ���� �������� �����ϴ� �Լ�, solution�� �ϼ��ϼ���. ������ �̸��� �Ͽ��Ϻ��� ����ϱ��� ���� SUN,MON,TUE,WED,THU,FRI,SAT
//
//�Դϴ�. ���� ��� a=5, b=24��� 5�� 24���� ȭ�����̹Ƿ� ���ڿ� TUE�� ��ȯ�ϼ���.
//
//���� ����
//2016���� �����Դϴ�.
//2016�� a�� b���� ������ �ִ� ���Դϴ�. (13�� 26���̳� 2�� 45�ϰ��� ��¥�� �־����� �ʽ��ϴ�)
//����� ��
//a	b	result
//5	24	TUE

public class Year2016 {

	
	public String getDayName(int a,int b) {
		String answer = "";
		
		switch(a) {
		case 1:
			break;
		case 2:
			b+=31;
			break;
		case 3:
			b+=60;
			break;
		case 4:
			b+=91;
			break;
		case 5:
			b+=121;
			break;
		case 6:
			b+=152;
			break;
		case 7:
			b+=182;
			break;
		case 8:
			b+=213;
			break;
		case 9:
			b+=244;
			break;
		case 10:
			b+=274;
			break;
		case 11:
			b+=305;
			break;
		case 12:
			b+=335;
			break;
		}
		
		b = (b-1)%7;
		
		switch(b) {
		
		case 0:
			answer = "FRI";
			break;
		case 1:
			answer = "SAT";
			break;
		case 2:
			answer = "SUN";
			break;
		case 3:
			answer = "MON";
			break;
		case 4:
			answer = "TUE";
			break;
		case 5:
			answer = "WED";
			break;
		case 6:
			answer = "THU";
			break;
		}
		
		
		
		return answer;
	}

	
	
	//������ ���� �ڵ�
	public static void main(String[] args) {
		String answer = "";
		int a=5;
		int b=24;
		
		Year2016 year = new Year2016();
		
		
	
		System.out.println(year.getDayName(a, b));
	}
	
	
	
	
	
	
	
	//�ٸ������ Ǯ��
	/*
	 * 
	 public String getDayName(int a, int b) {
        String answer = "";
        String[] day = { "FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU" };
        int[] date = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        int allDate = 0;
        for (int i = 0; i < a - 1; i++) {
            allDate += date[i];
        }
        allDate += (b - 1);
        answer = day[allDate % 7];

        return answer;
    }
	 * 
	 */
	
	
}
