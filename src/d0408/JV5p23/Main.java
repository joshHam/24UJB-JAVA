package d0408.JV5p23;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<String> list1 = Arrays.asList/*�����Ȼ�����*/("�����","�ߺ�","���","������");
		for(String name : list1) {
			System.out.println(name+" ");
		}
		System.out.println();
//	list1.add(2,"����");			//Exception
		
		List<Integer> list2 = Arrays.asList(4,3,8,1,9,12);
		for(int value : list2) {
			System.out.print(value+" ");
		}
		System.out.println();

	}

}
