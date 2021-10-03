package test.pool;

public class MyExecutor extends Thread {
    private int index;
    public MyExecutor(int i){
	    this.index=i;
	}
    public void run(){
	    try{
	     System.out.println("["+this.index+"] start....");
	     Thread.sleep((int)(Math.random()*1000));
	     System.out.println("["+this.index+"] end.");
	    }
	    catch(Exception e){
	     e.printStackTrace();
	    }
	}
}
