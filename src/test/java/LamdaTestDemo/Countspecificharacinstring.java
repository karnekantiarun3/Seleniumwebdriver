package LamdaTestDemo;

public class Countspecificharacinstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="javaruby";

int count=0;

for(int i=0;i<str.length();i++)
{
    


i=str.indexOf('a',i);

if(i<0) {
    
	  break;
}
count++;


}

System.out.println("Count of a is "+ count);              
}

}


