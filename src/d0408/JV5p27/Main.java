package d0408.JV5p27;

import java.util.List;
import java.util.Vector;

public class Main {

	public static void main(String[] args) {
		List<Board>list = new Vector<Board>();
		list.add(new Board("����1", "����1"));
		list.add(new Board("����22", "����22"));
		list.add(new Board("����333", "����333"));
		list.add(new Board("����4444", "����4444"));
		list.add(new Board("����55555", "����55555"));
		
		list.remove(2);
		list.remove(3);
		
		for(int i =0; i<list.size();i++) {
			Board board = list.get(i);
			System.out.println(board.subject + "\t"+board.content);
		}								//�����ϰ� ����ִ� ��Ű

	}

}
