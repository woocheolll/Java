class Tv1_1 {
    // 속성 : 변수 선언
    String color; // 색깔
    boolean power = false; // 전원상태 : false 로 초기화
    int channel = 1;  // 채널 : 1 로 초기화

    // 기능 : 메서드 선언
    void power() {  // 전원 기능
        power = !power;
        if (power) {
            System.out.println("전원 ON");
        } else {
            System.out.println("전원 OFF");
        }
    }

    void channelUp() { // 채널 증가
        channel++;
        System.out.println("채널 증가");
    }

    void channelDown() { // 채널 감소
        channel--;
        System.out.println("채널 감소");
    }
}

class Tv1_1Main {
    public static void main(String[] args) {
        Tv1_1 t1 = new Tv1_1(); // TV1 인스턴스
        t1.color = "검정색"; // 색깔 초기화
        Tv1_1 t2 = new Tv1_1(); // TV2 인스턴스
        t2.color = "흰색"; // 색깔 초기화

        System.out.println("TV1 인스턴스 색깔 = " + t1.color);
        System.out.println("TV2 인스턴스 색깔 = " + t2.color);

        t1.power(); // 메서드 호출
        System.out.println("TV1 인스턴스 채널 = " + t1.channel);

        t1.channelUp(); // 메서드 호출
        System.out.println("TV1 인스턴스 채널 : " + t1.channel);
        t1.channelDown(); // 메서드 호출
        System.out.println("TV1 인스턴스 채널 : " + t1.channel);

        t1.power(); // 메서드 호출


        // TV2 인스턴스 참조변수에 TV1 인스턴스의 주소 저장 했을 때
        t2 = t1;

        System.out.println("TV1 인스턴스 색깔 = " + t1.color); // 검정색
        System.out.println("TV2 인스턴스 색깔 = " + t2.color); // 검정색

        // 흰색이었던 TV2 인스턴스 의 색깔이 검정색으로 바뀐건가요?
        // 아닙니다.
        // 참조변수 t2 에 저장되어있던 TV2 인스턴스 의 주소가 없어지고
        // TV1 의 주소가 t2 참조변수에 저장이 됩니다

        // 따라서 t2 = t1; 이후 부터는
        // t2 참조변수로는 더 이상 TV2 인스턴스 에 접근할 수 없습니다.

    }
}

class Tv1_2 {
    // 속성 : 변수 선언
    String color; // 색깔
    boolean power = false; // 전원상태 : false 로 초기화
    int channel = 1;  // 채널 : 1 로 초기화
    // 브랜드 이름 속성 추가
    String brand;

    // 기능 : 메서드 선언
    void power() {  // 전원 기능
        power = !power;
        if (power) {
            System.out.println("전원 ON");
        } else {
            System.out.println("전원 OFF");
        }
    }

    void channelUp() { // 채널 증가
        channel++;
        System.out.println("채널 증가");
    }

    void channelDown() { // 채널 감소
        channel--;
        System.out.println("채널 감소");
    }
}

class Tv1_2Main {
    public static void main(String[] args) {
        Tv1_2[] tvArr = new Tv1_2[3];

        tvArr[0] = new Tv1_2();
        tvArr[1] = new Tv1_2();
        tvArr[2] = new Tv1_2();

        tvArr[0].color = "보라색";
        tvArr[1].color = "주황색";
        tvArr[2].color = "핑크색";

        for (int i = 0; i < tvArr.length; i++) {
            System.out.println(i + 1 + "번째 Tv인스턴스 색깔: " + tvArr[i].color);
        }

        for (int i = 0; i < tvArr.length; i++) {
            System.out.print(i + 1 + "번째 Tv인스턴스 " );
            tvArr[i].power();
        }

        System.out.println();
        // 브랜드명 추가 전 확인
        for (int i = 0; i < tvArr.length; i++) {
            System.out.print(i + 1 + "번째 Tv인스턴스의 브랜드 명: " );
            System.out.println(tvArr[i].brand);
        }
        System.out.println();

        // 새로운 참조변수에 배열 안에 들어있는 객체 주소 값 배정
        Tv1_2 samsung = tvArr[0];
        Tv1_2 lg = tvArr[1];
        Tv1_2 apple = tvArr[2];

        // 참조변수를 사용해서 배열안에 넣어준 객체에 접근해서 각 인스턴스에 브랜드 이름 추가하기
        samsung.brand = "samsung";
        lg.brand = "lg";
        apple.brand = "apple";

        for (int i = 0; i < tvArr.length; i++) {
            System.out.print(i + 1 + "번째 Tv인스턴스의 브랜드 명: " );
            System.out.println(tvArr[i].brand);
        }
    }
}

class NoneClassTime {
    public static void main(String[] args) {
        // 총 3명 의 시간을 변수로 관리
        int hour1, hour2, hour3;
        int minute1, minute2, minute3;
        int second1, second2, second3;

        // 총 3명 의 시간을 배열로 관리
        int[] hour = new int[3];
        int[] minute = new int[3];
        int[] second = new int[3];
    }
}

class Time3_1 {
    int hour;
    int minute;
    int second;
}
class Time3_1Main {
    public static void main(String[] args) {
        // 총 3명 의 시간을 객체로 관리
        Time3_1 t1 = new Time3_1();
        Time3_1 t2 = new Time3_1();
        Time3_1 t3 = new Time3_1();

        // 총 3명 의 시간을 객체 배열로 관리
        Time3_1[] timeArr = new Time3_1[3];
        timeArr[0] = new Time3_1();
        timeArr[1] = new Time3_1();
        timeArr[2] = new Time3_1();
    }
}

class Obj4_1 {
    int iv;        // 인스턴스 변수
    static int cv; // 클래스 변수(static 변수, 공유 변수)

    void method() {
        int lv;
        lv = 30;
        // 지역변수는 자동으로 초기화가 되지 않기 때문에 사용하려면 반드시 초기화 필요
        System.out.println("lv 지역 변수 = " + lv);
    }
}


class Obj4_1Main {
    public static void main(String[] args) {

        // 클래스 변수 접근 및 사용
        // 접근방법 : 클래스명.클래스변수이름
        Obj4_1.cv = 10;
        System.out.println("ObjVar.cv 클래스 변수 = " + Obj4_1.cv);

        // 인스턴스 변수 생성 및 사용
        // Obj4_1.iv = 20; // Error, 인스턴스를 통해서만 생성 및 사용 가능
        Obj4_1 objVar = new Obj4_1();
        objVar.iv = 20;
        System.out.println("objVar.iv 인스턴스 변수 = " + objVar.iv);

        // 지역 변수 생성 및 사용
        // objVar.lv // Error, 인스턴스로 지역 변수 바로 접근 불가능
        objVar.method(); // 메서드 호출 시 지역 변수 생성
        // 메서드 종료시 지역 변수 삭제
    }
}