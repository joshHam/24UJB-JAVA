package d0408.JV5p38;

import java.util.Iterator;
import java.util.TreeSet;

import d0402.JV3p72.E;

public class TreeSetTest {

	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet<String>();
		
		if(ts.add("korea")) {
			System.out.println("ù ��° korea �߰� ����");
		}else {
			System.out.println("ù ��° korea �߰� ����");
		}
		
		if(ts.add("china")) {
			System.out.println("ù ��° china �߰� ����");
		}else {
			System.out.println("ù ��° china �߰� ����");
		}
		
		if(ts.add("america")) {
			System.out.println("ù ��° america �߰� ����");
		}else {
			System.out.println("ù ��° america �߰� ����");
		}
		
		if(ts.add("china")) {
			System.out.println("�� ��° america �߰� ����");
		}else {
			System.out.println("�� ��° america �߰� ����");
		}

		System.out.println("Iterator�� ��ü ���� ��ȸ-------------");
		Iterator<E> it = ts.iterator()<String>; //String �߰� ��� �ϳ�?
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
