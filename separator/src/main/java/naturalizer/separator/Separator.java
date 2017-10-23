package naturalizer.separator;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

/**
 * Created by user on 09-Oct-17.
 */

public class Separator {
    private final static Separator instance;

    static {
        instance = new Separator();
    }

    public static Separator getInstance() {
        return instance;
    }


    public String doSeparate(final String passingvalue, Locale locale) {

        String formatedValue ="";

        String pattern = "#,###";

        DecimalFormat decimalFormat = (DecimalFormat) NumberFormat.getNumberInstance(locale);

        decimalFormat.applyPattern(pattern);
        try {
            formatedValue = decimalFormat.format(Double.parseDouble(passingvalue));
        } catch (NumberFormatException nfe) {
            nfe.printStackTrace();
        }

        return formatedValue;

    }
}
