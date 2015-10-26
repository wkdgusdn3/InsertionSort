import java.util.ArrayList;

public class InsertionSort {
	void sort(ArrayList<Integer> array) {
		int key = 0;
		
		 for(int j = 1; j < array.size(); j++) { // 배열의 2번째 숫자부터 시작하여 배열의 size만큼 for문을 돈다.
	         int i = 0;
	          key = array.get(j);   // key 값을 저장한다.
	          i = j - 1;            // j - 1번째 숫자부터 비교하기 위해 i 값을 setting해준다.
	          while(i >= 0 && array.get(i) > key) {   // i 값이 0이 보다 크고, 비교하는 숫자가 key값보다 크면 반복문을 실행한다.
	             array.set(i+1, array.get(i));   // arraylist의 숫자를 오른쪽으로 이동해준다.
	             i = i - 1;   // i의 값을 1 줄여준다.
	          }
	          
	          array.set(i+1, key);   // key 값이 들어갈 위치를 찾고 난 후 key 값을 저장해준다.
	      }       
	}
	
	void print(ArrayList<Integer> array) {
	      // 정렬 된 순열을 출력해준다.
	      for(int i=0; i<array.size(); i++) {
	         System.out.print(array.get(i) + " ");
	         if((i+1)%100 == 0) { // 줄바꿈을 위한 코드
	        	 System.out.println("");
	         }
	      }
	      
	      System.out.println("");
	}
}