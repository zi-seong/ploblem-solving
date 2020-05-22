package solt;

public class BubbleSort {

	public static void main(String[] args) {
		//버블정렬
		//첫번째 원소부터 마지막원소까지 반복하여 한 단계가 끝나면 가장 크거나 작은 원소가 뒤에서부터 정렬된다.
		int[] array = {40,20,80,10,30,60,50,70,100,90};
		int temp;
		for(int i=0;i<array.length;i++){
			for(int j=0;j<array.length-i;j++) {
				if(j+1 < array.length && array[j] > array[j+1]) {//대소비교를 반대로 하면 내림차순 정렬
					temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}//end if
			}//end inner loop
		}//end main loop
	}//end main
}
