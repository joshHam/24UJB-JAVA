package d0408.JV5p38;

import java.util.Iterator;
import java.util.TreeSet;

import d0402.JV3p72.E;

public class TreeSetTest {

	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet<String>();
		
		if(ts.add("korea")) {
			System.out.println("첫 번째 korea 추가 성공");
		}else {
			System.out.println("첫 번째 korea 추가 실패");
		}
		
		if(ts.add("china")) {
			System.out.println("첫 번째 china 추가 성공");
		}else {
			System.out.println("첫 번째 china 추가 실패");
		}
		
		if(ts.add("america")) {
			System.out.println("첫 번째 america 추가 성공");
		}else {
			System.out.println("첫 번째 america 추가 실패");
		}
		
		if(ts.add("china")) {
			System.out.println("두 번째 america 추가 성공");
		}else {
			System.out.println("두 번째 america 추가 실패");
		}

		System.out.println("Iterator로 전체 원소 순회-------------");
		Iterator<E> it = ts.iterator()<String>; //String 추가 어떻게 하나?
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
