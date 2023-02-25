package Bus;

class Bus{
    int maxpeople;
    int people;
    int allpeople;
    int busNumber;
    int money;
    int allmoney;
    int oil = 100;
    String state;
    int speed;

    public Bus(int maxpeople, int people,int allpeople, int busNumber, int money, int oil,int speed,String state) {
        this.maxpeople=maxpeople;
        this.people = people;
        this.allpeople = allpeople;
        this.busNumber = busNumber;
        this.money = money;
        this.oil = oil;
        this.speed = speed;
        this.state = "운행중";
    }
}


