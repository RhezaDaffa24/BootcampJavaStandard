package NumberClass;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class MainScanner {
    public static  void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat formarter = new SimpleDateFormat("dd-MM-yyyy");

        System.out.println("Masukkan Nama: ");
        String nama = scanner.nextLine();

        System.out.println("Masukkan tgl Lahir ");
        String tglLahir = scanner.nextLine();
        Date tglLahirDate = formarter.parse(tglLahir);
        System.out.println("Tgl lahir :" + tglLahirDate );

        Date currentdate = new Date();
        String tglSekarang = formarter.format(currentdate);
        System.out.println("tgl Sekarang Date :"+ currentdate);
        System.out.println("tgl Sekarang "+ tglSekarang);

        // hitung umur
        Calendar calendar = Calendar.getInstance();
        // tgl date => calender
        calendar.setTime(tglLahirDate);
        System.out.println("calender tgl lahir "+ calendar.getTime());
        Calendar currentcalendar = Calendar.getInstance();
        currentcalendar.setTime(new Date());
        //check calendar sekarang
        System.out.println("tgl Sekarang "+ currentcalendar.getTime());
        // ambil selisih
        Long time = (currentcalendar.getTimeInMillis() - calendar.getTimeInMillis())/1000;
        // second => minute
        Long timeminute = time/60;
        // minute => hour
        Long timehour = timeminute/60;
        // hour => day
        Long timeday = timehour/24;
        // day => week
        Long timeweek = timeday/7;
        // day => month
        Long timemonth = timeday/30;
        // day => year
        Long timeyear = timeday/365;

        System.out.println("bentuk second : "+ time);
        System.out.println("Bentuk menit : "+ timeminute);
        System.out.println("Bentuk hour : "+ timehour);
        System.out.println("Bentuk day : "+ timeday);
        System.out.println("Bentuk week : "+ timeweek);
        System.out.println("Bentuk month : "+ timemonth);
        System.out.println("Bentuk year : "+ timeyear);

    }
}
