package d0401JV3p32;

public class Tire {
	
	//�ɹ�����
	public int maxRotation; // �ִ� ȸ����(Ÿ�̾����)
	public int accumulatedRotation;// ���� ȸ����
	public String location; // Ÿ�̾��� ��ġ

	//������
	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}
	
	public boolean roll() {
		++accumulatedRotation;
		if (accumulatedRotation < maxRotation) {
			System.out.println(location + " Tire ����: " + (maxRotation - accumulatedRotation) + "ȸ");
			return true;
		} else {
			System.out.println("*** " + location + "Tire");
			return false;
		}
	}
}
