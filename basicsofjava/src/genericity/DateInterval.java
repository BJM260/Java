package genericity;

import java.time.LocalDate;

public class DateInterval extends Pair<LocalDate>{
    public void setSecond(LocalDate second){
        if(second.compareTo(getFirstNumber()) >= 0)
            super.setSecondNumber(second);
    }
}
