package SingleTonDesignpattern;

import java.io.Serializable;

public class Browsertest implements Serializable,Cloneable {
	
	// 1. Private static instance of the class
		private volatile static Browsertest browser;//null

		// 2. Private constructor to prevent/avoid instantiation/object
		private Browsertest() {
			if(browser!=null) {
				throw new IllegalArgumentException("object already exists");
			}
		}

		// 3. Public static getInstance method to provide access to the instance/object
		public static Browsertest getInstance() {
			if(browser == null) {
				synchronized (Browsertest.class) {
					if(browser == null) {
						browser = new Browsertest();
					}
				}
			}
			return browser;
		}

		// Individual public method of the class
		public void displayMesg() {
			System.out.println("browser info");
		}

	

	
	  public Object readResolve() 
	  { 
		  return getInstance();
	  
	  
	  } 
	  @Override
	public Object clone() throws CloneNotSupportedException {
		  
		  throw new CloneNotSupportedException("singleton instance cannot be created");
		  
	  }
	  }

	 

