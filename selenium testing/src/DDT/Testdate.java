package DDT;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.testng.annotations.Test;

public class Testdate {
  @Test
  public void Testdate() {
	  System.out.println("date in required format:"+getdatewithformat("dd-MM-yyyy"));
	  System.out.println("date in required format:"+getdatewithformat("dd-MMM-yyyy"));
	  System.out.println("date in required format:"+getdatewithformat("MMM-dd-yyyy"));
	  System.out.println(" future date:"+getpastorfuturedate(5));
	  System.out.println("past  date:"+getpastorfuturedate(-5));
	  compareDates(getdatewithformat("dd MM yyyy"), getpastorfuturedate(0));
	 
	  
  }
  
  
  String getdatewithformat(String requiredformat) {
	  Date objdate=new Date();
	  System.out.println("current date"+objdate);
	  SimpleDateFormat s1=new SimpleDateFormat(requiredformat);
	  return s1.format(objdate);
	  
  }
  String getpastorfuturedate(int daysnumber) {
	Calendar cal = Calendar.getInstance();
	//subtracting or addition a day
	cal.add(Calendar.DATE,daysnumber);
	SimpleDateFormat s=new SimpleDateFormat("dd-MM-yyyy");
	 return s.format(new Date(cal.getTimeInMillis()));
  }
 
  
  void compareDates(String date1,String date2) {
	  String currentDate=date1;
		 String dateToBeCompared=date2;
		 System.out.println("1st Current Date is :"+currentDate);
		 System.out.println("2nd past or future date: "+dateToBeCompared);
		 if(currentDate.compareTo(dateToBeCompared)>0){
			 System.out.println("currentDate occurs after dateToBeCompared");
		 }else if (currentDate.compareTo(dateToBeCompared)<0) {
			 System.out.println("currentDate occurs before dateToBeCompared");
		}else if(currentDate.compareTo(dateToBeCompared)<0) {
			 System.out.println("currentDate occurs and dateToBeCompared both are same date");
		}else{
			System.out.println("Either both the date are not in same format or you have given invalid date");
		}
	  
  }
  

}
