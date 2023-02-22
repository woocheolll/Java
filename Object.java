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

class Method5_1 {
    int add(int x, int y) {
        int result = x + y;
        return result; // 값을 반환
    }
}

class Method5_1Main {
    public static void main(String[] args) {
        Method5_1 method = new Method5_1(); // Method5_1 클래스에 만든 메서드 add 를 사용하기 위해 객체 생성

        int result = method.add(3, 5); // add 메서드를 사용해서 입력한 값(3,5)으로 처리된 값을 반환받아 result 변수에 저장
        System.out.println("result = " + result);
    }
}

class Method5_2 {
    void gugudan(int dan) {
        if (!(dan >= 2 && dan <= 9)) {
            System.out.println(dan + "단은 없습니다.");
            return;
        }
        System.out.println(dan + "단 시작!");
        for (int i = 1; i < 10; i++) {
            System.out.println(dan + "*" + i + " = " + dan * i);
        }
        System.out.println();
    }

    boolean checkMax(int x, int y) {
        if (x > y) {
            return true;
        } else {
            return false;
            // return 반드시 필요합니다. 만약 없으면 조건문이 false 일 경우, void 가 아닌데 return 문이 없음으로 Error
        }
    }

}

class Method5_2Main {
    public static void main(String[] args) {
        Method5_2 method = new Method5_2();

        method.gugudan(2);
        method.gugudan(5);
        method.gugudan(10);
        method.gugudan(9);

        System.out.println("method.checkMax(10, 8) = " + method.checkMax(10, 8));
        System.out.println("method.checkMax(5, 9) = " + method.checkMax(5, 9));
    }
}

class Time5_1 {
    int hour;
    int minute;
    int second;
}

class Method5_3 {
    static void initObj(Time5_1 time, int hour, int minute, int second) {
        time.hour = hour;
        time.minute = minute;
        time.second = second;
    }
}

class Method5_3Main {
    public static void main(String[] args) {
        Time5_1 t1 = new Time5_1();
        t1.hour = 100;
        t1.minute = 20;
        t1.second = 43;

        Time5_1 t2 = new Time5_1();
        t2.hour = 22;
        t2.minute = 30;
        t2.second = 23;

        Time5_1 t3 = new Time5_1();
        t3.hour = 45;
        t3.minute = 40;
        t3.second = 52;

        System.out.println("t1.hour = " + t1.hour);
        System.out.println("t2.hour = " + t2.hour);
        System.out.println("t3.hour = " + t3.hour);
        System.out.println();

        // 하나하나 인스턴스를 만들고 위처럼 인스턴스 변수를 초기화 하려니 매우 귀찮지 않나요?
        // 물론 '생성자' 라는 개념이 뒤에 나오지만 일단은 메서드를 사용하여 코드의 수를 확 줄여 보겠습니다.

        Time5_1 t4 = new Time5_1();
        Time5_1 t5 = new Time5_1();
        Time5_1 t6 = new Time5_1();

        Method5_3.initObj(t4, 100, 20, 43);
        Method5_3.initObj(t5, 22, 30, 23);
        Method5_3.initObj(t6, 45, 40, 52);

        System.out.println("t4.hour = " + t4.hour);
        System.out.println("t5.hour = " + t5.hour);
        System.out.println("t6.hour = " + t6.hour);

        // 이처럼 메서드를 사용하니 코드의 수가 굉장히 많이 줄어 가독성이 좋아졌습니다.
    }
}

class CallStack5_1 {

    static void firstMethod() {
        System.out.println("firstMethod()");
        secondMethod();
    }

    static void secondMethod() {
        System.out.println("secondMethod()");
        thirdMethod();
    }

    static void thirdMethod() {
        System.out.println("thirdMethod()");
        finalMethod();
    }

    static void finalMethod(){
        System.out.println("finalMethod()");
    }

    public static void main(String[] args) {
        secondMethod();
    }
}

class CallStack5_2 {

    static void firstMethod() {
        secondMethod();
        System.out.println("firstMethod()");
    }

    static void secondMethod() {
        thirdMethod();
        System.out.println("secondMethod()");
    }

    static void thirdMethod() {
        finalMethod();
        System.out.println("thirdMethod()");
    }

    static void finalMethod(){
        System.out.println("finalMethod()");
    }

    public static void main(String[] args) {
        firstMethod();
    }
}

class Data6_1 {
    int x; // 기본형
    int y; // 기본형
}

class Data6_1Main {
    public static void main(String[] args) {

        Data6_1 data  = new Data6_1();
        data.x = 10;
        data.y = 20;

        System.out.println("Data6_1 클래스로 만든 data 인스턴스의 인스턴스 변수 x, y 값 확인");
        System.out.println("data 인스턴스 변수 x = " + data.x);
        System.out.println("data 인스턴스 변수 y = " + data.y);
        System.out.println();

        // changeParameter 메서드 의 매개변수에 Data 클래스의 인스턴스 변수를 입력한다.
        System.out.println("입력받은 매개변수의 값을 바꾸는 메서드 수행");
        changeParameter(data.x, data.y);
        System.out.println();

        // changeParameter(data.x, data.y); 여기서의 data.x 와 data.y 는
        // data 의 인스턴스 변수의 값 그자체가 복사되어 넘어갑니다.
        // 따라서 changeParameter 메서드에서 입력받은 매개변수의 값을 바꿔도
        // 영향을 받지 않습니다.
        System.out.println("Data6_1 클래스로 만든 data 인스턴스의 인스턴스 변수의 값이 변경되었는지 확인");
        System.out.println("changeParameter 메서드 수행 후 data 인스턴스 변수 x = " + data.x);
        System.out.println("changeParameter 메서드 수행 후 data 인스턴스 변수 y = " + data.y);
    }

    static void changeParameter(int x, int y) {
        System.out.println();
        System.out.println("changeParameter 메서드 시작");
        System.out.println("입력 받은 매개변수 x 와 y의 값 확인");
        System.out.println("입력 받은 매개변수 x = " + x);
        System.out.println("입력 받은 매개변수 y = " + y);

        System.out.println();
        System.out.println("입력 받은 매개변수 x 와 y의 값을 변경 한 후 확인");
        x = 100;
        y = 200;
        System.out.println("변경 한 후 x = " + x);
        System.out.println("변경 한 후 y = " + y);
        System.out.println("changeParameter 메서드 끝");
    }
}

class Data6_2 {
    Data6_3  data2 = new Data6_3(); // 참조형
}

class Data6_3 {
    int x; // 기본형
    int y; // 기본형
}

class Data6_2Main {
    public static void main(String[] args) {

        Data6_2 data  = new Data6_2();
        data.data2.x = 10;
        data.data2.y = 20;

        System.out.println("Data6_2 클래스로 만든 data 인스턴스의 data2인스턴스의 인스턴스 변수 값 확인");
        System.out.println("참조변수 data2의 인스턴스 변수 x = " + data.data2.x);
        System.out.println("참조변수 data2의 인스턴스 변수 y = " + data.data2.y);
        System.out.println();

        // changeParameter 메서드 의 매개변수에 Data6_2 클래스의 참조형 변수인 data2 를 입력
        System.out.println("입력받은 매개변수의 값을 바꾸는 메서드 수행");
        changeParameter(data.data2);
        System.out.println();

        // changeParameter(Data6_3 data2); 여기서 data.data2 는
        // data 인스턴스의 참조형 변수 data2의 주소값이 넘어 갑니다.
        // 따라서 changeParameter 메서드에서 입력받은 data2의 주소값을 통해
        // data2 의 인스턴스에 접근하여 인스턴스 변수를 바꾸기 때문에 영향을 받습니다.
        System.out.println("Data6_3 클래스로 만든 data 인스턴스의 참조변수 data2의 인스턴스 변수 값이 변경되었는지 확인");
        System.out.println("changeParameter 메서드 수행 후 data2의 인스턴스 변수 x = " + data.data2.x);
        System.out.println("changeParameter 메서드 수행 후 data2의 인스턴스 변수 y = " + data.data2.y);
    }

    static void changeParameter(Data6_3 data2) {
        System.out.println();
        System.out.println("changeParameter 메서드 시작");
        System.out.println("입력 받은 매개변수 data2의 인스턴스 x 와 y의 값 확인");
        System.out.println("입력 받은 매개변수 data2의 인스턴스 x = " + data2.x);
        System.out.println("입력 받은 매개변수 data2의 인스턴스 y = " + data2.y);

        System.out.println();
        System.out.println("입력 받은 매개변수 data2의 인스턴스 x 와 y의 값을 변경 한 후 확인");
        data2.x = 100;
        data2.y = 200;
        System.out.println("변경 한 후 data2의 인스턴스 x = " + data2.x);
        System.out.println("변경 한 후 data2의 인스턴스 y = " + data2.y);
        System.out.println("changeParameter 메서드 끝");
    }
}

class StaticMethod7_1 {
    int num1, num2; // 인스턴스 변수 선언

    // 클래스 변수 선언
//    static int num1 = 10, num2 = 20;

    static int add(int num1, int num2) { // 메서드 반환타입 앞에 static 이 붙었기 때문에 static 메서드가 됩니다.

        System.out.println();
        System.out.println("매개변수로 입력 받은 num1, num2 확인");
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        // 여기서 매개 변수에 있는 num1, num2 와 위에 인스턴스 변수로 선언한 num1, num2 는 같은 걸까요?
        // 기본형 매개변수에서 배웠듯이 같지 않습니다. 서로 영향을 받지 않습니다.

        // 여기서의 num1 과 num2 는 단지 인스턴스 변수와 이름만 같은 지역변수일 뿐 메서드가 종료되면 사라집니다.
        // 인스턴스 변수는 클래스 메서드에서 사용하지 못합니다.

        // 그렇다면 추가로 StaticMethod7_1 에 선언한 변수를 사용하고 싶다면?
        // 인스턴스 변수가 아닌 클래스 변수를 선언해야합니다. static 타입 변수이름;

        // 위에 클래스 변수의 주석을 풀고 인스턴스 변수는 주석을 해주세요!

        // 자 그럼 이제 클래스 변수로 선언을 했으니까
        // 매개 변수에 있는 num1, num2 와 위에 클래스 변수로 선언한 num1, num2 는 같은 걸까요?
        // 그렇지 않습니다. 위에서 말씀드렸듯이 num1, num2는 매개변수이자 클래스 변수와 이름만 같습니다.
        // 또한 클래스 변수 를 사용하려면 클래스명.클래스변수 로 만 접근 가능합니다.

        // 이렇게 클래스 메서드에서 클래스 변수를 사용할 수 있습니다. 아래 주석 풀어주세요!

//        System.out.println("클래스변수 확인");
//        System.out.println("StaticMethod7_1.num1 = " + StaticMethod7_1.num1);
//        System.out.println("StaticMethod7_1.num2 = " + StaticMethod7_1.num2);

        System.out.println("num1 + num2 = " + (num1 + num2));
        return num1 + num2;
    }


}

class StaticMethod7_1Main {

    public static void main(String[] args) {
        StaticMethod7_1 methodTest = new StaticMethod7_1(); // 객체 생성
        methodTest.num1 = 10;
        methodTest.num2 = 20;

        // methodTest.add(methodTest.num1, methodTest.num2); // add 는 static 메서드 이기 때문에 객체로 생성된 참조변수로는 접근할 수 없습니다.

        // 클래스이름.메서드이름() 방식으로 static 메서드를 호출
        StaticMethod7_1.add(methodTest.num1, methodTest.num2);
    }
}

class InstMethod7_1 {
    int num1, num2; // 인스턴스 변수 선언
    static int num3 = 100;

    int add(int num1, int num2) { // 메서드 반환타입 앞에 static 이 없기 때문에 인스턴스 메서드 입니다.

        System.out.println();
        System.out.println("매개변수로 입력 받은 num1, num2 확인");
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        // 계속된 실습으로 우리는 위에 매개변수 num1, num2 와 InstMethod7_1 의 인스턴스 변수는 다르다는 것을 알았습니다.
        // 그럼 이런 의문이 듭니다. InstMethod7_1 클래스로 methodTest 객체를 생성했고
        // 참조변수를 통해 methodTest.num1 = 10;와 같이 인스턴스 변수에 값도 넣었는데
        // 저 값을 매개변수로 받는 의미가 있는 건가? 확인해 보겠습니다.

        // 인스턴스 변수 값 확인 : this 는 뒤에서 배우기 때문에 간단히 설명드리자면 인스턴스 변수와 매개변수를 구분하기 위한 것입니다.
        System.out.println("this.num1 = " + this.num1);
        // 10 이렇게 10이 출력될겁니다. 그럼 비교를 위해 아래 methodTest.add(methodTest.num1, methodTest.num2);
        // 주석 하고 methodTest.add(80,90); 주석을 푸세요!

        System.out.println("매개변수 이자 지역변수 num1 = " + num1);
        // 값이 달라졌을 겁니다. 이제 인스턴스 num1 과 매개변수 num1 은 이름만 같을 뿐이라는 것을 아셨을 겁니다.
        // 그래서 구분을 위해 변수의 이름을 다르게 하거나 this 를 사용해서 구분해야 합니다.

        // 그럼 지금 상황에서는 매개 변수를 받지 않고
        // return this.num1 + this.num2; // 이렇게 해도 됩니다.

        // 이번에는 그럼 일반 메서드니까 클래스 변수는 사용하지 못 할까? 아래 주석 제거하세요!
        //         System.out.println("InstMethod7_1.num3 = " + InstMethod7_1.num3); // 당연하게도 사용 가능합니다!

        return num1 + num2;
    }


}

class InstMethod7_1Main {

    public static void main(String[] args) {
        InstMethod7_1 methodTest = new InstMethod7_1(); // 객체 생성
        methodTest.num1 = 10;
        methodTest.num2 = 20;

        // 참조변수를 사용하여 인스턴스 메서드 호출
        System.out.println("result : " + methodTest.add(methodTest.num1, methodTest.num2));
//         System.out.println("result : " + methodTest.add(80,90));

    }
}

class Overloading8_1 {

    int add(int a, int b) {
        System.out.println("int add(int a, int b)");
        return a + b;
    }

//    void add(int a, int b) { // 반환 타입이 다르다고 오버로딩이 성립되지는 않음
//        System.out.println("void add(int a, int b)");
//        System.out.println("a + b = " + a + b);
//    }

    long add(long a, long b) {
        System.out.println("long add(long a, long b)");
        return a + b;
    }

    long add(long a, int b) {
        System.out.println("long add(long a, int b)");
        return a + b;
    }

    long add(int a, long b) {
        System.out.println("long add(int a, long b)");
        return a + b;
    }

}

class Overloading8_1Main {
    public static void main(String[] args) {
        Overloading8_1 test = new Overloading8_1();
        System.out.println(test.add(10, 20));
        System.out.println(test.add(13L, 17L));
        System.out.println(test.add(5L, 10));
        System.out.println(test.add(12, 23L));

        System.out.println();

        // 그런데 이때 위에 int add(int a, int b)  를 주석한다면
        test.add(10, 20); // 여기에 Ambiguous method call Error 가 발생합니다.
        // int, int 는 (long, int) , (int, long) 2개의 메서드 모두 가능하기 때문에 컴퓨터가 하나를
        // 마음대로 선택할 수가 없어서 발생하는 오류입니다.

    }
}

class Tv9_1 {
    // 속성 : 변수 선언
    boolean power; // 전원상태
    int channel;  // 채널
    String color; // 색깔
    long price; // 가격

    // 위 속성에서 필수로 초기값이 필요한 값들을 초기화 해주는 기본 생성자
    public Tv9_1() {
        power = false;
        channel = 1;
    }

    //  오버로딩 한 생성자 - 매장 진열 용 일 경우에는 가격과 색깔의 초기화가 필요합니다. this 는 이전 챕터에서 잠깐 봤었죠! 매개변수와 인스턴스변수를 구분하기 위해 사용하겠습니다.
    public Tv9_1(String color, long price) {
        power = false; // this.power, power 둘다 지금 상황에서는 인스턴스 변수를 명확하게 판단 할 수 있기 때문에 어떤걸 사용해도 상관 없습니다.
        channel = 1;
        this.color = color;
        this.price = price;
    }

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

class Tv9_1Main {
    public static void main(String[] args) {
        // 기본 초기화된 Tv9_1 생성
        Tv9_1 tv = new Tv9_1();
        System.out.print("기본 생성자 TV: ");
        tv.power();

        // 진열 용 Tv9_1 생성
        Tv9_1 exTv = new Tv9_1("보라색", 3456789);
        System.out.print("오버로딩 생성자 TV: ");
        exTv.power();
        System.out.println("exTv.color = " + exTv.color);
        System.out.println("exTv.price = " + exTv.price);

        // 근데 이때 주의할 점!
        // 기본 생성자는 없고 오버로딩한 생성자만 있을 경우!
        // 컴파일러는 기본 생성자를 만들어주지 않기 때문에 기본 생성자를 사용하려고 하면 Error 발생!
        // 위 기본 생성자를 주석 하세요!!!!
        Tv9_1 tv2 = new Tv9_1(); // Error 발생, 기본 생성자가 없기 때문에 매개 변수를 넣으라고 intellij 가 요구합니다.

    }
}

class Tv10_1 {
    // 속성 : 변수 선언
    boolean power; // 전원상태
    int channel;  // 채널
    String color; // 색깔
    long price; // 가격

    // 위 속성에서 필수로 초기값이 필요한 값들을 초기화 해주는 기본 생성자
    public Tv10_1() {
        this.power = false;
        this.channel = 1;
    }

    //  오버로딩 한 생성자 - 매장 진열 용 일 경우에는 가격과 색깔의 초기화가 필요합니다.
    public Tv10_1(String color, long price) {
        this.power = false;
        this.channel = 1;
        this.color = color;
        this.price = price;
    }

    // 기능 : 메서드 선언
    void power() {  // 전원 기능
        this.power = !power;
        if (this.power) {
            System.out.println("전원 ON");
        } else {
            System.out.println("전원 OFF");
        }
    }

    void channelUp() { // 채널 증가
        this.channel++;
        System.out.println("채널 증가");
    }

    void channelDown() { // 채널 감소
        this.channel--;
        System.out.println("채널 감소");
    }

    // 색깔을 수정하고 자기 자신을 반환하는 메서드
    Tv10_1 changeColor(String color) { // 반환 타입으로 자기자신인 Tv 선언
        this.color = color;
        System.out.println("색깔 변경 완료!");
        return this; // this 는 자기 자신을 가리키는 참조변수!
    }

}

class Tv10_1Main {
    public static void main(String[] args) {
        // 기본 초기화된 Tv10_1 생성
        Tv10_1 tv = new Tv10_1();
        System.out.print("기본 생성자 Tv10_1: ");
        tv.power();

        // 진열 용 Tv10_1 생성
        Tv10_1 exTv = new Tv10_1("보라색", 3456789);
        System.out.print("오버로딩 생성자 Tv10_1: ");
        exTv.power();
        System.out.println("exTv.color = " + exTv.color);
        System.out.println("exTv.price = " + exTv.price);
        System.out.println();

        // 진열 용 Tv10_1 의 색깔을 수정하고 수정된 객체를 참조변수에 저장하겠습니다.
        Tv10_1 exTvThis = exTv.changeColor("파란색");
        // 색깔이 변경된 Tv의 주소가 저장된 참조변수 exTvThis 를 사용하여 변경된 색깔 확인
        System.out.println("색깔이 변경되었는지 확인 exTvThis.color : " + exTvThis.color);
        // 당연히 exTv 이걸로 확인해도 색깔이 변경되어 있습니다.
        System.out.println("exTv.color = " + exTv.color);
    }
}

class Tv10_2 {
    // 속성 : 변수 선언
    boolean power; // 전원상태
    int channel;  // 채널
    String color; // 색깔
    long price; // 가격

    // 위 속성에서 필수로 초기값이 필요한 값들을 초기화 해주는 기본 생성자
    public Tv10_2() {
        this.power = false;
        this.channel = 1;
    }

    //  오버로딩 한 생성자 - 매장 진열 용 일 경우에는 가격과 색깔의 초기화가 필요합니다.
    public Tv10_2(String color, long price) {
        // 아래 초기화 내용은 위에 기본생성자와 완전히 똑같습니다.
        // 이럴 때 this() 를 사용합니다.
        // this.power = false;
        // this.channel = 1;

        this(); // 기본 생성자를 호출합니다.
        // Tv10_2() // 이렇게는 불가능 합니다!

        this.color = color;
        this.price = price;

        // this(); // 생성자 호출은 반드시 첫 줄에서만 가능합니다.
    }

    // 기능 : 메서드 선언
    void power() {  // 전원 기능
        this.power = !power;
        if (this.power) {
            System.out.println("전원 ON");
        } else {
            System.out.println("전원 OFF");
        }
    }

    void channelUp() { // 채널 증가
        this.channel++;
        System.out.println("채널 증가");
    }

    void channelDown() { // 채널 감소
        this.channel--;
        System.out.println("채널 감소");
    }

    // 색깔을 수정하고 자기 자신을 반환하는 메서드
    Tv10_2 changeColor(String color) { // 반환 타입으로 자기자신인 Tv 선언
        this.color = color;
        System.out.println("색깔 변경 완료!");
        return this; // this 는 자기 자신을 가리키는 참조변수!
    }

}

class Tv10_2Main {
    public static void main(String[] args) {
        // 기본 초기화된 Tv10_2 생성
        Tv10_2 tv = new Tv10_2();
        System.out.print("기본 생성자 Tv10_2: ");
        tv.power();

        // 진열 용 Tv10_2 생성
        Tv10_2 exTv = new Tv10_2("보라색", 3456789);
        System.out.print("오버로딩 생성자 Tv10_2: ");
        exTv.power();
        System.out.println("exTv.color = " + exTv.color);
        System.out.println("exTv.price = " + exTv.price);
        System.out.println();

        // 진열 용 Tv10_2 의 색깔을 수정하고 수정된 객체를 참조변수에 저장하겠습니다.
        Tv10_2 exTvThis = exTv.changeColor("파란색");
        // 색깔이 변경된 Tv의 주소가 저장된 참조변수 exTvThis 를 사용하여 변경된 색깔 확인
        System.out.println("색깔이 변경되었는지 확인 exTvThis.color : " + exTvThis.color);
        // 당연히 exTv 이걸로 확인해도 색깔이 변경되어 있습니다.
        System.out.println("exTv.color = " + exTv.color);
    }
}

//class Tv11_1 {
//    boolean power = false;    // 기본형 변수의 초기화
//    int channel = 1;          // 기본형 변수의 초기화
//    Audio audi = new Audio(); // 참조형 변수의 초기화, 참조형은 객체주소 or null 로 초기화!!
//    // 참조형의 기본값은 null 입니다!!
//    ...
//}
//
//class Tv11_2 {
//    static boolean power;
//    int channel;
//
//    // 클래스 초기화 블럭
//    static
//    {
//        power = false;
//    }
//
//    // 인스턴스 초기화 블럭
//    {
//        channel = 1;
//    }
//    ...
//}
//
//class Tv11_3 {
//    // 속성 : 변수 선언
//    boolean power; // 전원상태
//    int channel;  // 채널
//    String color; // 색깔
//    long price; // 가격
//
//    // 위 속성에서 필수로 초기값이 필요한 값들을 초기화 해주는 기본 생성자
//    Tv11_3() {
//        this.power = false;
//        this.channel = 1;
//    }
//    ...
//}

//class Point {
//    int x = 10;
//    int y = 20;
//}
//
//class Point3D extends Point{
//    int z = 30;
//}

//class PointEx1 {
//    public static void main(String[] args) {
//        Point point = new Point();
//        Point3D point3D = new Point3D();
//
//        System.out.println("point.x = " + point.x);
//        System.out.println("point.y = " + point.y + "\n");
//
//        System.out.println("point3D.x = " + point3D.x);
//        System.out.println("point3D.y = " + point3D.y);
//        System.out.println("point3D.z = " + point3D.z);
//
//        // 조상의 멤버를 상속받아 Point3D 클래스에 자동으로 Point의 멤버변수가 추가됩니다.
//    }
//}
//
//class Point {
//    int x = 10;
//}
//
//class Point3D extends Point{
//    int z = 30;
//}
//
//class PointEx2 {
//    public static void main(String[] args) {
//        Point point = new Point();
//        Point3D point3D = new Point3D();
//
//        System.out.println("point.x = " + point.x);
//        System.out.println("point.y = " + point.y + "\n");
//
//        System.out.println("point3D.x = " + point3D.x);
//        System.out.println("point3D.y = " + point3D.y);
//        System.out.println("point3D.z = " + point3D.z);
//
//        // 조상 클래스인 Point 클래스의 멤버변수 y가 없어지면서 Point3D 클래스에서도 멤버변수 y를 사용할 수 없게 되었습니다.
//    }
//}

//class Point {
//    int x,y;
//    String getLocation() {
//        return "x: " + x + ", y: " + y;
//    }
//}
//
//class Point3D extends Point {
//    int z;
//
////    @Override
////    String getLocation() {
////        return "x: " + x + ", y: " + y + ", z: " + z;
////    }
//}
//
//class OverrideEx1 {
//    public static void main(String[] args) {
//        Point3D point3D = new Point3D();
//        point3D.x = 10;
//        point3D.y = 20;
//        point3D.z = 30;
//        System.out.println(point3D.getLocation());
//
//        // 조상 클래스 Point 의 getLocation 를 그대로 사용하면 z 는 출력되지 않습니다.
//        // 위에 Point3D의 getLocation 주석을 제거해 주세요!
//    }
//}

//class Point {
//    int x = 10;
//    int y = 20;
//
//    void move(){
//        ++x;
//        ++y;
//    }
//}
//
//class Point3D extends Point {
//    int z = 30;
//
//    @Override
//    void move() {
//        ++x;
//        ++y;
//        ++z;
//    }
//}
//
//class OverrideEx2 {
//    public static void main(String[] args) {
//        Point point = new Point();
//        Point3D point3D = new Point3D();
//
//        point.move();
//        System.out.println("point.x = " + point.x);
//        System.out.println("point.y = " + point.y + "\n");
//
//        point3D.move();
//        System.out.println("point3D.x = " + point3D.x);
//        System.out.println("point3D.y = " + point3D.y);
//        System.out.println("point3D.z = " + point3D.z);
//
//        // Point의 move는 x, y축으로 1칸씩 앞으로 이동하지만, Point3D의 move는 z축으로도 1만큼 움직입니다.
//    }
//}
//
//class Parent {
//    int x = 10;
//}
//
//class Child extends Parent {
//    int x = 30; // 조상 클래스 x 와 변수명이 동일
//    // 이름이 같아도 둘다 존재합니다. 그래서 super 참조변수로 구별합니다.
//
//    Child() {
//        System.out.println("생성자에서 조상의 변수 x 접근 = " + super.x);
//        System.out.println("생성자에서 현재 객체 자신의 x = " + this.x);
//    }
//
//    void childMethod() {
//        System.out.println("Child 의 x = " + x);
//        System.out.println("현재 객체 자신의 x = " + this.x);
//        System.out.println("Parent 의 x 의 " + super.x);
//
//        // 만약 Child 에 변수 x 가 없다고 한다면
//        // 위 int x = 30; 을 주석하시면 this.x 는 부모클래스의 x를 가리킵니다.
//        // Child 의 x = 10 이 됩니다.
//    }
//
//}
//
//class SuperEx1 {
//    public static void main(String[] args) {
//        Child child = new Child();
//        child.childMethod();
//    }
//}

//class Point {
//    int x = 10;
//    int y = 20;
//
//    void move(){
//        ++x;
//        ++y;
//    }
//}
//
//class Point3D extends Point {
//    int z = 30;
//
//    @Override
//    void move() {
//        super.move();
//        ++z;
//    }
//}
//
//class SuperEx2 {
//    public static void main(String[] args) {
//        Point point = new Point();
//        Point3D point3D = new Point3D();
//
//        point.move();
//        System.out.println("point.x = " + point.x);
//        System.out.println("point.y = " + point.y + "\n");
//
//        point3D.move();
//        System.out.println("point3D.x = " + point3D.x);
//        System.out.println("point3D.y = " + point3D.y);
//        System.out.println("point3D.z = " + point3D.z);
//
//        // 부모 클래스의 메서드에 기능 추가가 필요 할 경우 super 예약어를 사용할 수 있습니다.
//    }
//}
//class Parent {
//    int x,y,z;
//
//    public Parent() {
//        System.out.println("난 부모 클래스 생성자");
//    }
//
//    public Parent(int x, int y, int z) {
//        this.x = x;
//        this.y = y;
//        this.z = z;
//    }
//}
//
//class Child extends Parent {
//
//    Child() {
//        // super() 를 통해서 부모 클래스의 멤버변수를 초기화합니다.
//        super(10,20,30);
//    }
//
//    Child(int num) {
//        // 이렇게 생성자에 this() or super() 가 없으면 자동으로 컴파일러가 super(); 를 붙여준다.
//
//        // 주의!!
//        // 그런데 만약 위에 부모클래스의 기본 생성자를 넣지 않으면 현재 오버로딩한 부모클래스의 생성자가 있기 때문에
//        // 컴파일러가 기본 생성자를 만들어주지 않지만 여기에는 super(); 로 부모클래스의 기본생성자를 호출하기 때문에 오류가 발생한다.
//        // 위에 부모클래스 기본 생성자 주석 해보자!
//        System.out.println("오버로딩 생성자");
//    }
//}
//
//class SuperCEx1 {
//    public static void main(String[] args) {
//        Child child = new Child(); // 이렇게 하면 super(10,20,30);를 통해 값 초기화
//        System.out.println("child.x = " + child.x);
//        System.out.println("child.y = " + child.y);
//        System.out.println("child.z = " + child.z);
//        System.out.println();
//
//        new Child(10000);
//    }
//}
//public class Object {
//
//    private int age;
//    private String name;
//
//    public int getAge() {
//        return age;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public void setName(String name) {
//        // private 메서드 checkName 사용
//        this.name = checkName(name) ? name : "anonymous";
//    }
//
//    // 이름을 입력할 때 공백 인지 확인 하는 메서드
//    // Capsule 클래스 내부에서만 사용할 것이기 때문에 private
//    private boolean checkName(String name) {
//        return name.length() > 0;
//    }
//}
//
//class CapsuleMain {
//    public static void main(String[] args) {
//        Object capsule = new Object();
//        // capsule.age; // private 제어자 이기 때문에 접근 불가능
//        // capsule.name; // private 제어자 이기 때문에 접근 불가능
//
//        // 따라서 직접 접근이 아니라 private 이 아닌 메서드를 통해서 접근한다.
//        capsule.setAge(28);
//        capsule.setName("bin");
//
//        System.out.println("capsule.getName() = " + capsule.getName());
//        System.out.println("capsule.getAge() = " + capsule.getAge());
//
//        capsule.setName("");
//        System.out.println("capsule.getName() = " + capsule.getName());
//    }
//}

//class Whale extends Mammalia{
//    // 고래는 포유류 이면서 바다에 살며 수영이 가능하다.
//    public void swimming() {
//        System.out.println("수영 하다.");
//    }
//
//    @Override
//    public void feeding() {
//        System.out.println("고래는 모유 수유를 합니다.");
//    }
//
//    @Override
//    public void giveBirth() {
//        System.out.println("고래는 새끼를 낳습니다.");
//    }
//}
//
//class Mammalia {
//    // 포유류는 새끼를 낳고 수유를 한다.
//    public void feeding() {
//        System.out.println("모유 수유를 합니다.");
//    }
//
//    public void giveBirth() {
//        System.out.println("새끼를 낳습니다.");
//    }
//}
//
//class PolyTest1 {
//    public static void main(String[] args) {
//        // 고래는 포유류이기 때문에 Mammalia 에 담길 수 있다.
//        Mammalia mammalia = new Whale();
//
//        // 하지만 포유류 전부가 바다에 살고 수영을 할 수 있는 것은 아니기 때문에
//        // 수영 하다 메서드는 실행 불가
////         mammalia.swimming(); // Error 발생
//
//        // 또한 모든 포유류가 전부 고래 처럼 수영이 가능한 것이 아니기 때문에 아래 상황은 불가능 하다.
////         Whale whale = new Mammalia(); // Error 발생
//
//        mammalia.giveBirth();
//        mammalia.feeding();
//    }
//}

//class Whale extends Mammalia{
//    // 고래는 포유류 이면서 바다에 살며 수영이 가능하다.
//    public void swimming() {
//        System.out.println("수영 하다.");
//    }
//
//    @Override
//    public void feeding() {
//        System.out.println("고래는 모유 수유를 합니다.");
//    }
//
//    @Override
//    public void giveBirth() {
//        System.out.println("고래는 새끼를 낳습니다.");
//    }
//}
//
//class Mammalia {
//    // 포유류는 새끼를 낳고 수유를 한다.
//    public void feeding() {
//        System.out.println("모유 수유를 합니다.");
//    }
//
//    public void giveBirth() {
//        System.out.println("새끼를 낳습니다.");
//    }
//}
//
//class Bird {
//    public void fly() {
//        System.out.println("Bird.fly");
//    }
//}
//
//class PolyTest2 {
//    public static void main(String[] args) {
//        Whale whale = new Whale();
//        Mammalia mammalia = (Mammalia) whale; //(Mammalia) 생략 가능!
//        mammalia.giveBirth();
//        mammalia.feeding();
//
//        // 형변환을 통해 담긴 mammalia 참조변수를 형변환을 통해
//        // 다시 Whale 로 변환할 수 있습니다.
//        Whale whale2 = (Whale) mammalia; // (Whale) 생략 불가능!
//        whale2.swimming();
//
//        // 조상, 자손 관계에서만 형변환이 가능합니다.
//        Bird bird = new Bird();
////        Mammalia mammalia1 = bird; // Error
////        Mammalia mammalia2 = (Mammalia) bird; // Error
//
//    }
//}
//
//class A {}
//class B extends A{}
//class Instanceof {
//    public static void main(String[] args) {
//        A a = new A();
//        B b = new B();
//
//        System.out.println("a instanceof A = " + (a instanceof A));
//
//        // a 객체는 B 클래스의 부모 클래스 입니다.
//        // 따라서 아래는 false 입니다.
//        System.out.println("a instanceof B = " + (a instanceof B));
//
//        System.out.println("b instanceof A = " + (b instanceof A));
//
//        System.out.println("b instanceof B = " + (b instanceof B));
//    }
//}

//class Animal {
//    public void move() {
//        System.out.println("동물이 움직입니다.");
//    }
//
//    public void onomatopoeia(){
//        System.out.println("동물이 소리냅니다.");
//    }
//}
//
//class Dog extends Animal {
//    @Override
//    public void move() {
//        System.out.println("강아지가 달립니다.");
//    }
//
//    @Override
//    public void onomatopoeia() {
//        System.out.println("멍멍!");
//    }
//}
//
//class Bird extends Animal {
//    @Override
//    public void move() {
//        System.out.println("새가 날아다닙니다.");
//    }
//
//    @Override
//    public void onomatopoeia() {
//        System.out.println("짹짹!");
//    }
//}
//
//class Action{
//    static void doMove(Animal animal){
//        animal.move();
//    }
//
//    static void doCry(Animal animal){
//        animal.onomatopoeia();
//    }
//}

//public class Object {
//
//    public static void main(String[] args) {
//        Dog dog = new Dog();
//        Bird bird = new Bird();
//
//        Action.doMove(dog);
//        Action.doCry(dog);
//
//        System.out.println();
//
//        Action.doMove(bird);
//        Action.doCry(bird);
//    }
//}
//class Parent {
//    void accost() {
//        System.out.println("Parent.accost");
//    }
//}
//
//class Child1 extends Parent {
//    @Override
//    void accost() {
//        System.out.println("Child1.accost");
//    }
//}
//
//class Child2 extends Parent {
//    @Override
//    void accost() {
//        System.out.println("Child2.accost");
//    }
//}
//
//class Child3 extends Parent {
//    @Override
//    void accost() {
//        System.out.println("Child3.accost");
//    }
//}
//
//class Poly {
//    //    void checkChild(Child1 child) { // 이렇게 하면 Child2,3를 사용하지 못하니 활용성이 떨어진다.
////        child.accost();
////    }
//    void checkChild(Parent child) {
//        child.accost();
//    }
//}
//
//class ParPoly2 {
//    public static void main(String[] args) {
//        Poly poly = new Poly();
//
//        Child1 child1 = new Child1();
//        Child2 child2 = new Child2();
//        Child3 child3 = new Child3();
//
//        poly.checkChild(child1);
//        poly.checkChild(child2);
//        poly.checkChild(child3);
//
//        // checkChild(Parent parent) 이렇게 부모클래스를 참조형 매개변수로 사용하여
//        // 자식 클래스 3가지 모두를 하나의 checkChild 메서드로 처리 할 수 있다.
//    }
//}


class Animal {
    public void move() {
        System.out.println("동물이 움직입니다.");
    }

    public void onomatopoeia(){
        System.out.println("동물이 소리냅니다.");
    }
}

class Dog extends Animal {
    @Override
    public void move() {
        System.out.println("강아지가 달립니다.");
    }

    @Override
    public void onomatopoeia() {
        System.out.println("멍멍!");
    }
}

class Bird extends Animal {
    @Override
    public void move() {
        System.out.println("새가 날아다닙니다.");
    }

    @Override
    public void onomatopoeia() {
        System.out.println("짹짹!");
    }
}

class Action{
    static void doMove(Animal animal){
        animal.move();
    }

    static void doCry(Animal animal){
        animal.onomatopoeia();
    }
}

public class Object {

    public static void main(String[] args) {
        Animal[] animals = new Animal[3];

        animals[0] = new Animal();
        animals[1] = new Dog();
        animals[2] = new Bird();

        for (Animal animal : animals) {
            animal.move();
            animal.onomatopoeia();
            System.out.println();
        }
    }
}

//abstract class Player { // 추상 메서드를 가진 클래스 abstract
//    // 속성 : 인스턴스 변수 선언 가능
//    boolean pause; // 일시정지 상태를 저장하기 위한 변수
//    int currentPos; // 현재 Play 되고 있는 위치 저장하기 위한 변수
//
//    // 추상클래스도 생성자 필요!
//    Player() {
//        pause = false;
//        currentPos = 0;
//    }
//
//    abstract void play(int pos); // 추상 메서드 (몸통 {} 블럭이 없음)
//    abstract void stop(); // 추상 메서드
//
//    // 일반 인스턴스 메서드
//    void play() {
//        // 메서드는 선언부만 알고 있어도 호출이 가능하다
//        // 따라서 추상 메서드도 호출이 가능하다
//        play(currentPos); // 추상 메서드 호출
//        // 위 추상 메서드를 구현한 클래스의 인스턴스를 통해 호출되기 때문에
//        // 해당 클래스에 구현한 play(int pos)의 구현부가 실행될 것입니다.
//    }
//}

//abstract class Player {
//    boolean pause; // 일시정지 상태를 저장하기 위한 변수
//    int currentPos; // 현재 Play 되고 있는 위치 저장하기 위한 변수
//
//    Player() {
//        pause = true;
//        currentPos = 0;
//    }
//
//    abstract void play(int pos); // 추상 메서드 (몸통 {} 블럭이 없음)
//    abstract void stop(); // 추상 메서드
//
//    // 일반 인스턴스 메서드
//    void play() {
//        System.out.println();
//        System.out.println("play() 일반 인스턴스 메서드");
//        play(currentPos);
//    }
//}
//
//class AudioPlayer extends Player {
//    @Override
//    void play(int pos) {
//        System.out.println();
//        this.currentPos =  pos;
//        this.pause = false;
//        System.out.println("추상클래스 Player 의 play(int pos) 구현");
//        System.out.println("현재 위치 = " + this.currentPos);
//        System.out.println("다시 시작합니다.");
//    }
//
//    @Override
//    void stop() {
//        System.out.println("재생을 멈춥니다.");
//        this.pause = true;
//    }
//}
//
//class AudioPlayerTest {
//    public static void main(String[] args) {
//        AudioPlayer audioPlayer = new AudioPlayer();
//        audioPlayer.play(100);
//        audioPlayer.stop();
//        audioPlayer.play();
//
//    }
//}