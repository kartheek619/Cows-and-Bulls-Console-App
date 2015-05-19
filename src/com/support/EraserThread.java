package com.support;

public class EraserThread implements Runnable {
	private boolean stop;

	   public void run () {
	      stop = true;
	      while (stop) {
	         System.out.print("*");
	     try {
	        Thread.currentThread();
			Thread.sleep(1);
	         } catch(InterruptedException ie) {
	            ie.printStackTrace();
	         }
	      }
	   }

	   /**
	    * Instruct the thread to stop masking
	    */
	   public void stopMasking() {
	      this.stop = false;
	   }
	
}
