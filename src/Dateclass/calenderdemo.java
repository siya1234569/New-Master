package Dateclass;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class calenderdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Calendar c= Calendar.getInstance();
       SimpleDateFormat sdf=new SimpleDateFormat("MM/dd/yyyy  hh:mm:ss");
       System.out.println(sdf.format(c.getTime()));
      System.out.println(c.get(Calendar.DAY_OF_MONTH));
      System.out.println(c.get(Calendar.AM_PM));//AM=0;PM=1

	}

}
