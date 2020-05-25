package programmers.level1;


//2016년
//문제 설명
//2016년 1월 1일은 금요일입니다. 2016년 a월 b일은 무슨 요일일까요? 두 수 a ,b를 입력받아 2016년 a월 b일이 무슨 요일인지 리턴하는 함수, solution을 완성하세요. 요일의 이름은 일요일부터 토요일까지 각각 SUN,MON,TUE,WED,THU,FRI,SAT
//
//입니다. 예를 들어 a=5, b=24라면 5월 24일은 화요일이므로 문자열 TUE를 반환하세요.
//
//제한 조건
//2016년은 윤년입니다.
//2016년 a월 b일은 실제로 있는 날입니다. (13월 26일이나 2월 45일같은 날짜는 주어지지 않습니다)
//입출력 예
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

	
	
	//실행을 위한 코드
	public static void main(String[] args) {
		String answer = "";
		int a=5;
		int b=24;
		
		Year2016 year = new Year2016();
		
		
	
		System.out.println(year.getDayName(a, b));
	}
	
	
	
	
	
	
	
	//다른사람의 풀이
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
