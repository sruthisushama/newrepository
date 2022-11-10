package obsqura.MavenSample;

import org.testng.annotations.Test;

public class AppTest 
{
   
    @Test(dataProvider="newdataprovider", dataProviderClass = DataTest.class)
    public void f(String s, String x) {
  	  System.out.println(s+"  "+x);
    }
}
