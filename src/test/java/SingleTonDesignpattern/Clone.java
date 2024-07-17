package SingleTonDesignpattern;

public class Clone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Browsertest instance1=Browsertest.getInstance();

try {
	Browsertest instance2=(Browsertest) instance1.clone();
} catch (CloneNotSupportedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

	}

}
