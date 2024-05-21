import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class Ex13_01 {

	public static void main(String[] args) {
		ArrayList<String> cats1 = new ArrayList<String>();
		
		System.out.println("cats1");
		// add() (추가)
		cats1.add("샴");
		cats1.add("null");
		cats1.add(1, "페르시안"); // 인덱스 1로 페르시안을 넣어서 원래 null은 인덱스2로 감
		System.out.println(cats1);

		// set() (수정)
		cats1.set(2, "러시안블루");
		System.out.println(cats1);

		// contains(), indexOf 검색
		System.out.println(cats1.contains("샴"));
		System.out.println(cats1.indexOf("샴"));

  		// clear() (삭제)
		cats1.remove("샴");
		cats1.remove(0);
		
		// 출력
		System.out.println(cats1.get(0));
		System.out.println(cats1.size());
		
		
		
		

		
		LinkedList<String> cats2 = new LinkedList<String>();
		System.out.println("\ncats2");
		// add() (추가)
		cats2.add("샴");
		cats2.addFirst("null");
		cats2.addLast("페르시안"); // 인덱스 1로 페르시안을 넣어서 원래 null은 인덱스2로 감
		cats2.add(2, "태비");		
		System.out.println(cats2);

		// set() (수정)
		cats2.set(0, "러시안블루");
		System.out.println(cats2);

		// contains(), indexOf 검색
		System.out.println(cats2.contains("샴"));
		System.out.println(cats2.indexOf("샴"));
		
  		// clear() (삭제)
		cats2.remove("샴");
		cats2.remove(0);
		cats2.removeLast();
		
		// 출력
		System.out.println(cats2.get(0));
		System.out.println(cats2.size());
	
		
		
		
		
		

		Vector<String> cats3 = new Vector<String>();
		System.out.println("\ncats3");
		// add() (추가)
		cats3.add("샴");
		cats3.add(null);
		cats3.add(2, "태비");		
		System.out.println(cats3);

		// set() (수정)
		cats3.set(1, "러시안블루");
		System.out.println(cats3);

		// contains(), indexOf 검색
		System.out.println(cats3.contains("샴"));
		System.out.println(cats3.indexOf("샴"));
		
  		// clear() (삭제)
		cats3.remove("샴");
		cats3.remove(0);
		
		// 출력
		System.out.println(cats3.get(0));
		System.out.println(cats3.size());
		
		}

}
