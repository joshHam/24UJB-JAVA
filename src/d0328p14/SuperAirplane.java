package d0328p14;

public class SuperAirplane extends Airplane {

		public static final int NORMAL = 1;
		public static final int SUPER = 2;
		
		public int flyMode = NORMAL;
		
		public void fly() {//오버라이딩 됐으나
			if(flyMode == SUPER) {
				System.out.println("초음속 비행중..");
			}else {
				super.fly();//부모클라스로도 이동가능
			}

	}

}
