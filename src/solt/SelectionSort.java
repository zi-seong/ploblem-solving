package solt;

public class SelectionSort {

	public static void main(String[] args) {
		//��������
		//�����ؼ� �տ������� ���ǿ� �����ϴ� ���ڵ�� ä�������� ����
		int[] array = {40,20,80,10,30,60,50,70,100,90};
		int temp;
		for(int i=0;i<array.length-1;i++) {
			for(int j=i+1;j<array.length;j++) {
				if(array[i]>array[j]) {//����� �������� ������ ��Һ񱳸� �ݴ���ϸ� ���������� �����մϴ�.
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}//end if
			}//end inner loop
		}//end main loop
	}//end main
}
