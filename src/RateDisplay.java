class RateDisplay implements Observer {
    public void update(double previousRate, double newRate) {
        System.out.println("Старый курс доллара: " + previousRate);
        System.out.println("Новый курс доллара: " + newRate);
    }
}
