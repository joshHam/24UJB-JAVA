package d0409.JV5p63;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		Queue<Message> messageQueue = new LinkedList<Message>();

		messageQueue.offer(new Message("sendMail", "홍길동"));	//offer=> Stack의 push와 같음 / peek=>Stack의top.
		messageQueue.offer(new Message("sendSMS", "김자바"));
		messageQueue.offer(new Message("sendKakaoTalk", "홍두께"));

		while (!messageQueue.isEmpty()) {
			Message message = messageQueue.poll();				// poll =>Stack의 pop
			switch (message.command/*operator-로접근하면 직접 접근한다는 뜻*/) {
			case "sendMail":
				System.out.println(message.to + "님에게 메일을 보냅니다.");
				break;
			case "sendSMS":
				System.out.println(message.to + "님에게 SMS을 보냅니다.");
				break;
			case "sendKakaoTalk":
				System.out.println(message.to + "님에게 카카오톡을 보냅니다.");
				break;
			}
		}

	}

}
