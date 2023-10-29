import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        DollarRate dollarRate = new DollarRate(474.65);
        RateDisplay rateDisplay = new RateDisplay();

        dollarRate.registerObserver(rateDisplay);

        dollarRate.setRate(475.85);

        dollarRate.setRate(476.5);
    }
}
