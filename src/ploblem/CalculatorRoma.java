package ploblem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class CalculatorRoma {

/*
 ����
�θ� ���ڴ� ��� �θ����� ���� ������Դϴ�.
�⺻������ ���� 5������ �����Ͽ� �θ� ���ڸ� �а� �� �� �ֽ��ϴ�.
I = 1
II = 2
III = 3
V = 5
X = 10

4, 6, 7, 8, 9�� ��Ģ�� �̿��Ͽ� ǥ���մϴ�.
V �Ǵ� X�� �������� ���ʿ� I�� ���� ���� �����ʿ� I, II, III�� ���� ���ؼ� ǥ���մϴ�.

���� ���� ��Ģ���� 1 ~ 10���� ǥ���ϸ� ������ �����ϴ�.

�θ� ����     	�ƶ��� ����
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
�Ʒ� �־��� ������ �����ϴ� �θ� ���� ���⸦ �ۼ��Ͽ� ���� �ּ���.
���α׷��� ����� ������ ������ �ڽ��ִ� ���� �ۼ��� �ּ���.

����
��Ģ������ ������ ���⸦ �ۼ��� �ּ���.
�Է°��� ������� ������ I ~ XXIX (1 ~ 39) �Դϴ�.
������� 0���� �̰ų� 39(XXXIX)���� ū ��� �������� ������ϴ�.����� ǥ���� �ּ���.
���� ������ ū ���� ���� ��� ������ ������ ū���� �� �� �����ϴ�.����� ǥ���� �ּ���.
���� ���� ū ���� ������ ��� ������ ���� ū ���� ���� �� �����ϴ�.����� ǥ���� �ּ���.
������(/)�� ��� ���� ��� �������� ǥ���� �ּ���.
�Է��� �����̳� �ֿܼ��� �޾Ƶ� �ǰ� ���α׷� ���ο� �ϵ��ڵ��ص� �˴ϴ�.
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
