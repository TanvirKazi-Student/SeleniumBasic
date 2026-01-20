package actionsclass;

import java.util.Random;

public class TargetRandom {

	public static void main(String[] args) {

		Random r = new Random();
		
		int num = r.nextInt(100);
		System.out.println(num);
	}
}
