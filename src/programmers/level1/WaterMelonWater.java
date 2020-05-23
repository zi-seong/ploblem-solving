package programmers.level1;

//수박수박수박수박수박수?
//문제 설명
//길이가 n이고, 수박수박수박수....와 같은 패턴을 유지하는 문자열을 리턴하는 함수, solution을 완성하세요. 예를들어 n이 4이면 수박수박을 리턴하고 3이라면 수박수를 리턴하면 됩니다.
//
//제한 조건
//n은 길이 10,000이하인 자연수입니다.
//입출력 예
//n	return
//3	수박수
//4	수박수박

//짝수 홀수 구분해서 문자열 붙이기
class WaterMelonWater {
    public String solution(int n) {
        String answer = "";
        for(int i=1;i<=n;i++){
            if(i==1){
                answer += "수";
                continue;
            }else if(i%2==0){
                answer += "박";
                continue;
            }else if(i%2!=0){
                answer += "수";
                continue;
            } 
        }     
        return answer;
    }
}

//다른분들의 해결방법
/*
 1.StringBuffer와 삼항연산자를 사용한 해결방법 
	 class Solution {
	  public String solution(int n) {
	       StringBuilder answer = new StringBuilder();
	        for (int i = 1; i <= n; i++) {
	            answer.append(i%2==0?"박":"수");
	        }
	        return answer.toString();
	  }
	 } 
 */


