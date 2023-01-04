package Property;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyFileExample1 {
	public static void main(String [] args) throws IOException {
	/**
	 1. find property file location and create an instance of FileInputStream class and pass file location into its constructor
	 */
	//Property file absolute location
	//String filelocation="F:\\workspace\\javabasics\\PropertyFiles\\AppData.properties";
		   //or
	//Property file relative location ---> "." indicate current working dir
	//String filelocation=".\\PropertyFiles\\AppData.properties";
	      //  or
	//System.getProperty("user.dir")----> F:\\Online Class\\Training Syllabus-20210816T050832Z-001\\Training Syllabus\\CoreJavaSessions\\JavaTraining
	//String fileLocation=System.getProperty("user.dir")+"\\PropertyFiles\\AppData.properties";
	//or
	FileInputStream fis=new FileInputStream(".\\PropertyFiles\\AppData.properties");
	//FileInputStream fis=new FileInputStream(filelocation);
	/*2. create an instance of Properties class */
    Properties prop=new Properties();
    /*3. using Properties class reference call load() and pass FileInputStream instance as an argument */
	prop.load(fis);
	/*4. using Properties class reference call getProperty(String key) which will return value for passed key*/
	String name=prop.getProperty("name");
	System.out.println("name is:"+name);
	System.out.println("email id  is:"+prop.getProperty("email"));
	System.out.println("address id  is:"+prop.getProperty("address"));
	System.out.println(" city  is:"+prop.getProperty("city"));
		
	
}
}