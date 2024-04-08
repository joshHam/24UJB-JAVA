package d0408.JV5p27;

import java.util.List;
import java.util.Vector;

public class Main {

	public static void main(String[] args) {
		List<Board>list = new Vector<Board>();
		list.add(new Board("제목1", "내용1"));
		list.add(new Board("제목22", "내용22"));
		list.add(new Board("제목333", "내용333"));
		list.add(new Board("제목4444", "내용4444"));
		list.add(new Board("제목55555", "내용55555"));
		
		list.remove(2);
		list.remove(3);
		
		for(int i =0; i<list.size();i++) {
			Board board = list.get(i);
			System.out.println(board.subject + "\t"+board.content);
		}								//일정하게 띄워주는 텝키

	}

}
