package mc.javalec.ex;

import java.util.ArrayList;

public class ArrayList03 {
 
    public static void main(String[] args) {
        
        ArrayList<Integer> list = new ArrayList<>();
        //add():아이템 추가
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        
        //size():list 의 크기
        System.out.println(list.size());
        System.out.println("---------------------------------");
        
        //get(i): 인덱스에 있는 값을 가져옴
        System.out.println(list.get(2));
        System.out.println("---------------------------------");
        
        //remove(i) : i 인덱스를 지움 (인덱스 방 자체를 날림)
        list.remove(3);
        list.add(3,999); //3번 자리에 999를 넣겠다
        System.out.println(list.get(3));
        System.out.println("---------------------------------");
        
        //set(index,value) :특정 인덱스의 값을 수정한다
        list.set(0,777);
        
        for(int i:list) {
            System.out.println(i);
        }
        System.out.println("---------------------------------");
        
        //contains(value):특정 값이 해당 리스트에 있는지 여부(true|false)
        boolean yn = list.contains(1000);
        System.out.println("yn");
        System.out.println("---------------------------------");
        
        //indexOf(value): 해당 값의 인덱스 위치(인덱스는 0부터이니 0부터 시작)
        System.out.println("3의 값의 위치 :"+list.indexOf(3));
        
        //clear
        list.clear();
        
        //isEmpty
        System.out.println(list.isEmpty());
        System.out.println(list.size());
    }
 
}
