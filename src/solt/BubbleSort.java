package solt;

public class BubbleSort {

	public static void main(String[] args) {
		//��������
		//ù��° ���Һ��� ���������ұ��� �ݺ��Ͽ� �� �ܰ谡 ������ ���� ũ�ų� ���� ���Ұ� �ڿ������� ���ĵȴ�.
		int[] array = {40,20,80,10,30,60,50,70,100,90};
		int temp;
		for(int i=0;i<array.length;i++){
			for(int j=0;j<array.length-i;j++) {
				if(j+1 < array.length && array[j] > array[j+1]) {//��Һ񱳸� �ݴ�� �ϸ� �������� ����
					temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}//end if
			}//end inner loop
		}//end main loop
	}//end main
}
