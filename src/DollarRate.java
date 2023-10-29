import java.util.ArrayList;
import java.util.List;

class DollarRate implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private double rate;
    private double previousRate;

    public DollarRate(double initialRate) {
        this.rate = initialRate;
        this.previousRate = initialRate;
    }

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void setRate(double rate) {
        previousRate = this.rate;
        this.rate = rate;
        notifyObservers();
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(previousRate, rate);
        }
    }
}
