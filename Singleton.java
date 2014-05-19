package iis1314.designPatterns.singleton;

public class Singleton {
	private int n;
	private static Singleton clase=null;
	private Singleton(){
		n=0;
	}
	
	public static Singleton getInstance(){
		if(clase==null){
			clase = new Singleton();
		}
		return clase;
	}
	public int getIdentifier(){
		int res=n;
		n++;
		return res;
	}
	
	
}
