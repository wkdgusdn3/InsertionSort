import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {

		// 수열을 입력받을 arraylist
		ArrayList<Integer> array = new ArrayList<Integer>();
		Scanner scanner = new Scanner(System.in);
		String inputString;

		System.out.print("숫자를 입력해주세요 : ");

		inputString = scanner.nextLine(); // 사용자에게 수열을 입력받는다.

		// 사용자에게 입력받은 수열의 숫자를 하나씩 잘라서 arraylist에 저장한다.
		StringTokenizer st = new StringTokenizer(inputString, " ,");
		while (st.hasMoreTokens())
			array.add(Integer.parseInt(st.nextToken()));

		// running time을 측정하기 위해 input number를 조작하기 위한 code
		// int size = 100000;
		// for(int i=0; i<size; i++) {
		// array.add((int)(Math.random()*10000)); // random으로 값 입력
		// array.add(size - i); // 내림차순으로 값 입력
		// array.add(i+1); // 오름차순으로 값 입력
		// }

		long start_time = System.currentTimeMillis(); // insertion sort를 시작하는
														// 곳부터 시간을 측정

		InsertionSort insertionSort = new InsertionSort();
		insertionSort.sort(array);

		long end_time = System.currentTimeMillis(); // insertion sort가 끝난 시점 시간을
													// 측정

		System.out.print("정렬된 수 : ");

		insertionSort.print(array);

		// 측정시간 출력
		System.out.println("걸린시간 : " + (end_time - start_time) + " milliseconds");
	}
}
