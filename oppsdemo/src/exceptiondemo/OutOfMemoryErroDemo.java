package exceptiondemo;

import java.io.IOException;

public class OutOfMemoryErroDemo {
            
	
	public void createArray(int size)
	{
		try
		{
			Integer[] a=new Integer[size];
		}
		catch(OutOfMemoryError e)
		{
			System.err.println("Array size tolarge");
			System.err.println("MAxx jvm memory:"+Runtime.getRuntime().maxMemory());
			System.out.println("java version :"+Runtime.version());
			//open notepad
		
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OutOfMemoryErroDemo d1= new OutOfMemoryErroDemo();
		d1.createArray(1000*1000*1000);
		try {
		Runtime.getRuntime().exec("notepad");
		} catch (IOException e)
		{
			e.printStackTrace();
		}

	}

}
