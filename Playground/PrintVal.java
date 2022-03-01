package Playground;

import java.util.ArrayList;

public class PrintVal {
	synchronized void print(String data) {
		System.out.println("Printed: " + data);
	}
}

class Thread1 extends Thread {
	PrintVal printer;
	Thread1(PrintVal printer) {
		this.printer = printer;
		this.start();
	}
	public void run() {
		ArrayList<String> al = new ArrayList<String>();
		while(true)
		{	
			System.out.println("Attempting to print Thread 1");
			printer.print("Thread 1");
			try{
				sleep(1000);
			}catch(InterruptedException e) {
				System.out.println(e);
			}
		}
	}
}

class Thread2 extends Thread {
	PrintVal printer;
	Thread2(PrintVal printer) {
		this.printer = printer;
		this.start();
	}
	public void run() {
		while(true)
		{	
			System.out.println("Attempting to print Thread 2");
			printer.print("Thread 2");
			try{
				sleep(1000);
			}catch(InterruptedException e) {
				System.out.println(e);
			}
		}
	}
}

public class ThreadSynchro {
	public static void main(String args[]) {
		System.out.println("Use Ctrl + C to stop Excecution");
		PrintVal printer = new PrintVal();
		new Thread1(printer);
		new Thread2(printer);
	}
}class ThreadSynchro {
    
}
