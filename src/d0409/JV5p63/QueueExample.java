package d0409.JV5p63;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		Queue<Message> messageQueue = new LinkedList<Message>();

		messageQueue.offer(new Message("sendMail", "ȫ�浿"));	//offer=> Stack�� push�� ���� / peek=>Stack��top.
		messageQueue.offer(new Message("sendSMS", "���ڹ�"));
		messageQueue.offer(new Message("sendKakaoTalk", "ȫ�β�"));

		while (!messageQueue.isEmpty()) {
			Message message = messageQueue.poll();				// poll =>Stack�� pop
			switch (message.command/*operator-�������ϸ� ���� �����Ѵٴ� ��*/) {
			case "sendMail":
				System.out.println(message.to + "�Կ��� ������ �����ϴ�.");
				break;
			case "sendSMS":
				System.out.println(message.to + "�Կ��� SMS�� �����ϴ�.");
				break;
			case "sendKakaoTalk":
				System.out.println(message.to + "�Կ��� īī������ �����ϴ�.");
				break;
			}
		}

	}

}
