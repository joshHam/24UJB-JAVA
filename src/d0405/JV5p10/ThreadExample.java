package d0405.JV5p10;

public class ThreadExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadExample mainThread = ThreadExample.currentThread();
		System.out.println("프로그램 시작 스레드 이름: "+mainThread.getName());
		
		ThreadA threadA = new ThreadA();
		System.out.println("작업 스레드의 이름 : "+ threadA.getName());
		
		
		ThreadB threadB = new ThreadB();
		System.out.println("작업 스레드의 이름 : "+ threadB.getName());
		
		threadA.start();
		threadB.start();

	}

}
