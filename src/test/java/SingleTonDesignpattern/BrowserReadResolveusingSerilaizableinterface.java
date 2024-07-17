package SingleTonDesignpattern;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.openqa.selenium.bidi.module.Browser;

	public class BrowserReadResolveusingSerilaizableinterface {

		public static void main(String[] args) {
			try {
				Browsertest instance1 = Browsertest.getInstance();

				//Serialize the Browser instance
				ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("browser.json"));
				out.writeObject(instance1);
				out.close();

				// De-Serialize the Browser instance
				ObjectInputStream in = new ObjectInputStream(new FileInputStream("browser.json"));
				Browsertest instance2 =  (Browsertest) in.readObject();
				in.close();

				ObjectInputStream in1 = new ObjectInputStream(new FileInputStream("browser.json"));
				Browsertest instance3 = (Browsertest) in1.readObject();
				in1.close();

				System.out.println("Instance1 hash code: " + instance1.hashCode());
				System.out.println("Instance2 hash code: " + instance2.hashCode());
				System.out.println("Instance3 hash code: " + instance3.hashCode());


			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}



	//POJO ( java class)  ----> JSON/XML/Byte Stream
	//JSON/XML/Byte Stream ----> JAVA (POJO) -- Browser -- creating a new Browser instance






