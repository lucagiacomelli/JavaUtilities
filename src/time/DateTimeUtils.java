package time;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class DateTimeUtils{
	
	/**
     *  Method for getting the UTC offset.
     *  @return String with the UTC offset formatted "-/+hhhh"
     */
    public static String getUTCOffset(){
        TimeZone timezone = TimeZone.getDefault();
        Calendar cal = GregorianCalendar.getInstance(timezone);
        int offsetInMillis = timezone.getOffset(cal.getTimeInMillis());
        String offset = String.format("%02d%02d", Math.abs(offsetInMillis / 3600000), Math.abs((offsetInMillis / 60000) % 60));
        offset = (offsetInMillis >= 0 ? "+" : "-") + offset;
        return offset;
    }


    /**
     *  Method for getting the local time in UTC format.
     *  @return String with date and time in UTC format
     */
    public static String getLocalTimeUTCFormat(){
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date currentTime = Calendar.getInstance().getTime();
        String date_time = df.format(currentTime);
        String utcOffset = DateTimeUtils.getUTCOffset();
        date_time = date_time.replace(" ", "T");
        date_time += utcOffset;
        return date_time;
    }



    public static Date getDateFromString(String date_time){
        if (date_time == null || date_time.equals(""))
            return null;
        Date result = null;
        int hoursUTCOffset = Integer.parseInt(date_time.substring(19));
        date_time = date_time.substring(0,19).replace("T"," ");

        Date result_temp = null;
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            result_temp =  df.parse(date_time);
        } catch (ParseException e) {
            System.err.println("Unable to parse the timestamp for enter event: " + e.getMessage());
        }

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(result_temp);
        calendar.add(Calendar.HOUR, hoursUTCOffset);
        return calendar.getTime();
    }


    public static String getTimeFromDate(Date date){
        // Convert the time into hh:mm:ss format
        SimpleDateFormat sdf;
        sdf = new SimpleDateFormat("HH:mm:ss");
        String result = sdf.format(date);
        return result;
    }

    public static String getOnlyDateFromDate(Date date){
        // Convert the time into dd:MM:YY format
        SimpleDateFormat sdf;
        sdf = new SimpleDateFormat("dd/MM/YY");
        String result = sdf.format(date);
        return result;
    }

}

	