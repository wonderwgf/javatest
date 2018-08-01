import java.util.Date;
import java.util.Calendar;
import java.text.SimpleDateFormat;
public class Test{
public static void main(String[] args)  
	{
//Date dateAndTime = new Date(); //Java获取服务器当前日期和时间
//System.out.println(dateAndTime .toString());
Calendar calendar=Calendar.getInstance();
    SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd 00:00:00");
     calendar.set(Calendar.DATE,calendar.get(Calendar.DATE)-20);
     System.out.println(sdf.format(calendar.getTime()));
  calendar.set(Calendar.DATE,calendar.get(Calendar.DATE)+1);
//System.out.println(sdf.format(calendar.getTime()));

}

}
