package mc.javalec.ex;

import java.util.ArrayList;

public class ArrayList01 {

	public static void main(String[] args) {
		// ArrayList는 자바스크립트의 배열과 비슷하다.(크기가 유동적임)
		// 중간에 데이터가 추가 삭제 되면 그 뒤의 데이터들이 움직이게 된다.
		// collection>List
		// Java Util에 있는 ArrayList를 불러오기 때문에 import문 추가해 줘야한다
		ArrayList<String> list = new ArrayList<String>();

		list.add("JAVA"); // [0]
		list.add("JDBC");// [1]
		list.add("Servlet/JSP"); // [2] ->DB가 들어가니 [3]으로 밀림
		list.add(2, "DB");// 방지정 하고 들어감[2]
		// add는 뒤에서 추가인데 방을 지정해서 중간에 넣어줌 DB를 넣어줌

		// 총 크기
		int size = list.size();
		System.out.println(size);

		// 데이터 하나씩 꺼내기
		String item = list.get(3);
		System.out.println(item);
		
		//데이터 삭제 후 2번방에 넣기
        list.remove(3); //지울 방 번호 지정
        item = list.get(2);
        System.out.println(item);
        list.remove("DB"); //지울 값을 지정 (방도 같이 지우게 된다)
        
        System.out.println("현재사이즈는: " + size);
        //전체 값을 하나씩 꺼냄(for 문 / 향상된 for)
        int i = 0;
        for(i=0;i<list.size();i++) { // size가 변하기 때문에 변한 값을 넣어야한다
            System.out.println(list.get(i));
        }
        
        for(String result2:list) {
            System.out.println(result2);
        }
        
        //배열에서 값을 받아서 쓰는 것
        //꺼내오고 싶은 대상 list
        //넣고 싶은 대상 result
	}
}