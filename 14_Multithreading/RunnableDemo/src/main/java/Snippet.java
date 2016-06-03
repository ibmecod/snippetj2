
class RunnableClass implements Runnable{
	
	Thread thread;
	String threadName;
	public RunnableClass(String tName) {
		threadName = tName;
		System.out.println("Creating thread "+threadName);
	}
	public void start(){
		System.out.println("Starting thread " + threadName);
		if(thread == null){
			thread = new Thread (this, threadName);
			thread.start();
		}
	}
	
	public void run() {
		System.out.println("Running "+ threadName);
		
	}
}

public class Snippet{

	public static void main(String[] args) {
		RunnableClass runclass1 = new RunnableClass("T1");
		runclass1.start();
		RunnableClass runclass2 = new RunnableClass("T2");
		runclass2.start();
	}

}
