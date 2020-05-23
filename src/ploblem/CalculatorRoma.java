package ploblem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class CalculatorRoma {

/*
 문제
로마 숫자는 고대 로마에서 사용된 기수법입니다.
기본적으로 다음 5가지를 조합하여 로마 숫자를 읽고 쓸 수 있습니다.
I = 1
II = 2
III = 3
V = 5
X = 10

4, 6, 7, 8, 9는 규칙을 이용하여 표시합니다.
V 또는 X를 기준으로 왼쪽에 I가 오면 빼고 오른쪽에 I, II, III이 오면 더해서 표시합니다.

위와 같은 규칙으로 1 ~ 10까지 표시하면 다음과 같습니다.

로마 숫자     	아라비아 숫자
I	1
II	2
III	3
IV	4
V	5
VI	6
VII	7
VIII	8
IX	9
X	10
아래 주어진 조건을 만족하는 로마 숫자 계산기를 작성하여 보내 주세요.
프로그래밍 언어의 제한은 없으며 자신있는 언어로 작성해 주세요.

조건
사칙연산이 가능한 계산기를 작성해 주세요.
입력값과 결과값의 범위는 I ~ XXIX (1 ~ 39) 입니다.
결과값이 0이하 이거나 39(XXXIX)보다 큰 경우 “범위를 벗어났습니다.”라고 표시해 주세요.
작은 수에서 큰 수를 빼는 경우 “작은 수에서 큰수를 뺄 수 없습니다.”라고 표시해 주세요.
작은 수를 큰 수로 나누는 경우 “작은 수를 큰 수로 나눌 수 없습니다.”라고 표시해 주세요.
나누기(/)의 결과 값은 몫과 나머지로 표시해 주세요.
입력은 파일이나 콘솔에서 받아도 되고 프로그램 내부에 하드코딩해도 됩니다.
 */
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean off = false;
		
		//while(off) {
//			String inputValue = br.readLine();
//			String[] splitValue = inputValue.split(" ");
//			System.out.println(splitValue[0]);
//			System.out.println(splitValue[1]);
//			System.out.println(splitValue[2]);
		//}
		
		String III = "aa";
		//System.out.println(changer(III));
		
		switch(III) {
		case "I":
			System.out.println(3);
		case "II":
			System.out.println(3);
		case "III":
			System.out.println(3);
		case "IV":
			System.out.println(3);
		case "V":
			System.out.println(3);
		case "VI":
			System.out.println(3);
		case "VII":
			System.out.println(3);
		case "VIII":
			System.out.println(3);
		case "IX":
			System.out.println(3);
		case "X":
			System.out.println(3);
		}	
		
		if(III.equals("III")) {
			System.out.println(5);
		}
		
		
	}
	
	public static int changer(String romaNum) {	
		switch(romaNum) {
		case "I":
			return 1;
		case "II":
			return 2;
		case "III":
			return 3;
		case "IV":
			return 4;
		case "V":
			return 5;
		case "VI":
			return 6;
		case "VII":
			return 7;
		case "VIII":
			return 8;
		case "IX":
			return 9;
		case "X":
			return 10;
		}	
		
		if(romaNum.equals("III")) {
			return 333;
		}
		
		return 0;
	}

}
