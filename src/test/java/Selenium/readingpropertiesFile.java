package Selenium;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.Properties;
import java.util.Set;

public class readingpropertiesFile {

	public static void main(String[] args) throws IOException {
	  //open file in reading mode
      FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\testdata\\config.properties");
      //get the property file
      Properties prpobj=new Properties();
      prpobj.load(file);
      //read data from property file
      String url=prpobj.getProperty("appurl");
      String emailid=prpobj.getProperty("email");
      String pass=prpobj.getProperty("password");
      String oid=prpobj.getProperty("orderid");
      String custid=prpobj.getProperty("custmerid");
      System.out.println(url+" "+emailid+" "+pass+" "+oid+" "+custid);
      //read only keys from properties file
      Set<String> keys=prpobj.stringPropertyNames();
      System.out.println(keys);
      Set<Object>keys1=prpobj.keySet();
      System.out.println(keys1);
      //read only values from properties file
      Collection<Object>value=prpobj.values();
      System.out.println(value);
      //close the properties file
      file.close();
      }
	

}
