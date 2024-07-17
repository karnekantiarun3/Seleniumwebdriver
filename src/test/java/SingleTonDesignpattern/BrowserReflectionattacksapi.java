package SingleTonDesignpattern;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class BrowserReflectionattacksapi {
	public static void main(String args[]) {
	Browsertest instance1=	Browsertest.getInstance();
	Browsertest instance2=null;
	try {
	Constructor<Browsertest>con=	Browsertest.class.getDeclaredConstructor();
	con.setAccessible(true);
	instance2=con.newInstance(args);
	System.out.println("hashcode:"+instance1.hashCode());
	System.out.println("hascode"+instance2.hashCode());
	} catch (NoSuchMethodException 
			| SecurityException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (InstantiationException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IllegalAccessException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IllegalArgumentException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (InvocationTargetException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

}
