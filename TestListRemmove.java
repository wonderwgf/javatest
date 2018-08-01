import java.util.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Calendar;
import java.text.SimpleDateFormat;
public class TestListRemmove{
public static void main(String[] args)  
	{
//Date dateAndTime = new Date(); //Java获取服务器当前日期和时间
//System.out.println(dateAndTime .toString());
//Calendar calendar=Calendar.getInstance();
  //  SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd 00:00:00");
    // calendar.set(Calendar.DATE,calendar.get(Calendar.DATE)-20);
     //System.out.println(sdf.format(calendar.getTime()));
  //calendar.set(Calendar.DATE,calendar.get(Calendar.DATE)+1);
//System.out.println(sdf.format(calendar.getTime()));
List<Integer> list=new ArrayList<Integer>();
list.add(1);
list.add(2);
list.add(3);
list.add(4);
list.remove(new Integer(1));
for(int i=0;i<list.size();i++){
   System.out.print(list.get(i)+" ");
 }
}

}
