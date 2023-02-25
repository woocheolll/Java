package Bus;

public class Transport{
    public static void main(String[] args) {
        Bus bus1 = new Bus(30,0,0,100,1000,100,0,"운행중");
        Bus bus2 = new Bus(30,0,0,200,1000,100,0,"운행중");
        System.out.println(bus1.busNumber + "번 버스객체 생성!");
        System.out.println(bus2.busNumber + "번 버스객체 생성!");
        bus1.people = 2;
        bus1.allpeople += bus1.people;
        bus1.maxpeople -=  bus1.people;
        System.out.println("탑승 승객 수: "+ bus1.people);
        System.out.println("잔여 승객수:"+ bus1.maxpeople);
        System.out.println("요금확인: "+ bus1.people*bus1.money);
        bus1.oil -= 50;
        System.out.println("주유량: "+ bus1.oil);
        bus1.state ="차고지행";
        System.out.println("상태:"+ bus1.state);
        bus1.oil += 10;
        System.out.println("주유량: "+ bus1.oil);
        bus1.people = 45;
        bus1.allpeople += bus1.people;
        if ( bus1.maxpeople < bus1.allpeople) {
            System.out.println("최대 승객수를 초과했습니다.");
        }
        bus1.allpeople -= bus1.people;
        bus1.people = 5;
        bus1.allpeople += bus1.people;
        System.out.println("탑승 승객 수: "+  bus1.people);
        bus1.maxpeople -=  bus1.people;
        System.out.println("잔여 승객수:"+ bus1.maxpeople);
        System.out.println("요금확인:"+ bus1.people*bus1.money);
        bus1.oil -= 45;
        System.out.println("주유량:"+  bus1.oil);
        System.out.println("주유가 필요합니다");
        bus1.state ="운행";
        System.out.println("상태:"+ bus1.state);

    }
}