package solt;

public class SelectionSort {

	public static void main(String[] args) {
		//선택정렬
		//선택해서 앞에서부터 조건에 부합하는 숫자들로 채워나가는 정렬
		int[] array = {40,20,80,10,30,60,50,70,100,90};
		int temp;
		for(int i=0;i<array.length-1;i++) {
			for(int j=i+1;j<array.length;j++) {
				if(array[i]>array[j]) {//현재는 오름차순 이지만 대소비교를 반대로하면 내림차순도 가능합니다.
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}//end if
			}//end inner loop
		}//end main loop
	}//end main
}
