package mc.javalec.ex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayList02 {

	public static void main(String[] args) {
		// array -> arrayList
		String[] arr = { "A", "B", "C" };// Array
		List<String> list = Arrays.asList(arr); // list 형태이긴 하나 사이즈 변경이 안됨
												// //리스트형태로 만듬
		System.out.println(list.size());

		// 아래 내용을 통해서 완전히 ArrayList로 만들어 줘야 함
		ArrayList<String> arrList = new ArrayList<String>(); // 크기 늘였다 줄였다 안됨
		arrList.addAll(list); // array -> List -> ArrayList // 그래서 컬렉션 형태인
								// arrList에 넣음
		// 이제 완전히 arrayList가 되었으므로 크기 변환이 된다.
		arrList.add("D");

		for (String item : arrList) {
			System.out.println(item);
		}
	}
}