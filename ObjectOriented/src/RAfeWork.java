import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class RAfeWork {
	  public static void main(String args[]){  
          Date date = Calendar.getInstance().getTime();  
          DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");  
          //String strDate = dateFormat.format(date);  
          String dateToStr = DateFormat.getInstance().format(date);  
          System.out.println("Converted String: " + dateToStr);  
           
  }  
}
