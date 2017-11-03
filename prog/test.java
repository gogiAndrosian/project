package My;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Andrzej on 2017-07-28.
 */
public class test {
    public static void main(String args[]) {
        SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd");
        String str = args.length == 0 ? "2011-11-11" : args[0];

        System.out.print("Строка " + str + " распаршена как ");
        Date parsingDate;
        try {
            parsingDate = ft.parse(str);
            System.out.println(parsingDate);
        }catch (ParseException e) {
            System.out.println("Нераспаршена с помощью " + ft);
        }
    }
}
