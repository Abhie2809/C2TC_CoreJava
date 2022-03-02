package technoserve.c2tc.m07;

public class Singleton {
	
	static Singleton instance = new Singleton();
	public static String str;
	
	private Singleton()
	{
		
	}
	
	public static Singleton getSingleInstance()
	{
		return instance;
	}


}
