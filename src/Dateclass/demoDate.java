package Dateclass;

import java.text.SimpleDateFormat;
import java.util.Date;

public class demoDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Date d=new Date();
          SimpleDateFormat sdf=new SimpleDateFormat("MM/d/yyyy");
          SimpleDateFormat sd=new SimpleDateFormat("MM/d/yyyy hh:mm:ss");

         System.out.println(sd.format(d));
      System.out.println(d.toString());
	}

}
