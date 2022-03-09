package Playground;

import java.util.Random;



class RandomGenerator  extends Thread {

	RandomGenerator() {
		this.start();
	}

	public void run() {
		while(true) {
			getRandom(15);
			try {
				sleep(1000);
			}catch(Exception e) {
				System.out.println(e);
			}
		}
	}
	private void getRandom(int range) {
		int randomNum;
      Random rd = new Random();
      randomNum = rd.nextInt(range);
      //System.out.println("Generated Number: " + randomNum);
		if(randomNum%2 == 0)
			new EvenPrinter(randomNum);
		else
			new OddPrinter(randomNum);
	}
}



class EvenPrinter extends Thread {
	int val;
	EvenPrinter(int val) {
		this.val = val;
		this.start();
	}

	public void run() {
		System.out.println("Got Even: " + val + " Square is: " + val*val);
	}
}

class OddPrinter extends Thread {
	int val;
	OddPrinter(int val) {
		this.val = val;
		this.start();
	}

	public void run() {
		System.out.println("Got Odd: " + val + " Cube is: " + val*val*val);
	}
}

public class MultiThreadRandom {
	public static void main(String args[]) {
//
		new RandomGenerator();
		System.out.println("Use Ctrl + C to stop Excecution");
	}
}
