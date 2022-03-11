package technoserve.c2tc.m07;

public class Counter extends Thread {
	int count = 0;
	synchronized public void run()
	{
		for(int i=0;i<1000000;i++)
			count++;
	}

}
