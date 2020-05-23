package programmers.level1;
//문자열 다루기 기본
//문제 설명
//문자열 s의 길이가 4 혹은 6이고, 숫자로만 구성돼있는지 확인해주는 함수, solution을 완성하세요. 예를 들어 s가 a234이면 False를 리턴하고 1234라면 True를 리턴하면 됩니다.
//
//제한 사항
//s는 길이 1 이상, 길이 8 이하인 문자열입니다.
//입출력 예
//s	return
//a234	false
//1234	true


//아스키코드를 이용한 해결방법
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


//다른분들의 해결방법
/*
  
1.try catch를 사용해 string타입에서 int타입으로 캐스팅도중에 생기는 오류를 사용한 풀이방법
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

2.정규식을 이용한 해결방법
		if (s.length() == 4 || s.length() == 6) return s.matches("(^[0-9]*$)");
        return false;
        
3.삼항연산자를 사용하고 split을 사용한 해결방법
		return (s.length() != 4 && s.length() != 6) || (s.split("[0-9]").length > 0) ? false:true;

 */
