package d0408.JV5p43;

import java.util.HashMap;
import java.util.Map;

import d0403.JV4p20.Student;

public class HashMapExample {

	public static void main(String[] args) {
		Map<Student, Integer> map = new HashMap<Student, Integer>();

		map.put(new Student(1, "ȫ�浿"), 95);  //�̰� �� �����߳�>??
		map.put(new Student(1, "ȫ�浿"), 95);

		System.out.println("�� Entry �� : " + map.size());

	}

}
