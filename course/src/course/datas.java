package course;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class datas {

	public static void main(String[] args) {
		
		SimpleDateFormat sdf1 =  new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
	
		
		Date y = Date.from(Instant.parse("2019-01-15T19:47:00Z"));
		
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(y);
		y = cal.getTime();
		
		System.out.println(sdf1.format(y));
	}

}
