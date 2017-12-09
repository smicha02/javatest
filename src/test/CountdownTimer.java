package test;

import java.util.Timer;
import java.util.TimerTask;

public class CountdownTimer {
	
	
	static int secondsPassed = 0;
	
	static Timer myTimer = new Timer();
	static TimerTask task = new TimerTask() {
	      public void run() {
	    	  secondsPassed++;
	    	  System.out.println("Seconds Passed: " + secondsPassed);
	      }
	};
	
	public static void start() {
		
		myTimer.scheduleAtFixedRate(task,1000,1000);
		
	}
	
	public static void main(String[] args) {
		CountdownTimer countdown = new CountdownTimer();
		CountdownTimer.start();
	}
	
}
