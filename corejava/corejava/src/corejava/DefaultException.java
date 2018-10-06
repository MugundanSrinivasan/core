package corejava;
import java.io.*;
import java.lang.*;

public class DefaultException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
doStuff();
	}
	public static void doStuff()
	{
		doMoreStuff();
	}
	public static void doMoreStuff()
	{
		System.out.println(10/0);
	}

}
