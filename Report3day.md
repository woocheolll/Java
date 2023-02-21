```
//6-1. 다음과 같은 멤버 변수를 갖는 Student 클래스를 정의하세요.
//타입 : String, 변수명 : name, 설명 : 학생 이름 String name;'
//타입 : int, 변수명 : ban, 설명 : 반 int ban;
//타입 : int, 변수명 : no, 설명 : 번호 int no;
//타입 : int, 변수명 : kor, 설명 : 국어 점수 int kor;
//타입 : int, 변수명 : eng, 설명 : 영어 점수 int eng;
//타입 : int, 변수명 : math, 설명 : 수학 점수 int math;
class Student{
    String name;
    int ban;
    int no;
    int kor;
    int eng;
    int math;
}

//6-2. 6-1에서 정의한 Student 클래스에 생성자와 info()를 추가해서 실행결과와 같은 결과를 얻도록 하세요.
class Exercise6_3{
    public static void main(String[] args){
        Student s = new Student("홍길동", 1, 1, 100, 60, 76);

        String str = s.info();
        System.out.println(str);
    }// 예상 결과 : 홍길동, 1, 1, 100, 60, 76, 236, 78.7
}

class Student{
    String name;
    int ban;
    int no;
    int kor;
    int eng;
    int math;


    Student(String name, int ban ,int no, int kor, int eng, int math){
        this.name=name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    public String info() {
        return name+","+ban+","+no+","+kor+","+eng+","+math;
    }


}

//6-3. 연습문제 6-1에서 정의한 Student 클래스에 다음과 같이 정의된 두 개의 메서드를 추가하세요.
//1. 메서드명 : getTotal
//기능 : 국어(kor), 영어(eng), 수학(math)의 점수를 모두 더해서 반환한다.
//반환타입 : int
//매개변수 : 없음
//2. 메서드명 : getAverage
//기능 : 총점(국어점수+영어점수+수학점수)을 과목수로 나눈 평균을 구한다.
//소수점 둘째자리에서 반올림할 것.
//반환타입 : float
//매개변수 : 없음

class Exercise6_2{
    public static void main(String[] args){
        Student s = new Student();
        s.name = "홍길동";
        s.ban = 1;
        s.no = 1;
        s.kor = 100;
        s.eng = 60;
        s.math = 76;
        System.out.println("이름 :"+s.name);
        System.out.println("총점 :"+s.getTotal());
        System.out.println("평균 :"+s.getAverage());
    }//예상 결과 : 이름 : 홍길동, 총점 : 236, 평균 : 78.7
}

class Student{
    String name;
    int ban;
    int no;
    int kor;
    int eng;
    int math;

    public long getTotal() {
        return kor+eng+math;
    }

    public float getAverage() {
        return Math.round(getTotal() / 3f * 10)/10f;
    }
}

//6-5. 다음의 코드에 정의된 변수들을 종류별(클래스 변수,인스턴스 변수, 지역변수)로 구분해서 적으세요.
class PlayingCard {
    int kind;
    int num;
    static int width;
    static int height;
    PlayingCard(int k, int n) {
        kind = k;
        num = n;
    }
    public static void main(String args[]) {
        PlayingCard card = new PlayingCard(1,1);
    }
}
정답
클래스 변수 : width; height;
인스턴스 변수 : kind; inum;
지역 변수 : k; n; card;

//6-7. 다음은 컴퓨터 게임의 병사(marine)를 클래스로 정의한 것이다.
//이 클래스의 멤버 중에 static을 붙여야 하는 것은 어떤 것들이고 그 이유는 무엇인가?
//(단, 모든 병사의 공격력과 방어력은 같아야 한다.)
class Marine {
    int x=0, y=0; //Marine의 위치좌표 (x,y)
    int hp = 60; //현재 체력
    int weapon = 6; //공격력
    int armor = 0; //방어력
    void weaponUp() {
        weapon++;
    }
    void armorUp() {
        armor++;
    }
    void move(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
정답
weapon armor 모든 병사의 공격력과 방어력이 같다는 조건이 있기 때문에

6-8. 다음 중 생성자에 대한 설명으로 옳지 않은 것은? (모두 고르시오)b,e
a. 모든 생성자의 이름은 클래스의 이름과 동일해야한다.
b. 생성자는 객체를 생성하기 위한 것이다.
c. 클래스에는 생성자가 반드시 하나 이상 있어야 한다.
d. 생성자가 없는 클래스는 컴파일러가 기본 생성자를 추가한다.
e. 생성자는 오버로딩 할 수 없다.

6-9. 다음 중 this에 대한 설명으로 맞지 않은 것은? (모두 고르시오)b
a. 객체 자신을 가리키는 참조변수이다.
b. 클래스 내에서라면 어디서든 사용할 수 있다.
c. 지역변수와 인스턴스변수를 구별할 때 사용한다.
d. 클래스 메서드 내에서는 사용할 수 없다.

6-10. 다음 중 오버로딩이 성립하기 위한 조건이 아닌 것은? (모두 고르시오)c,d
a. 메서드의 이름이 같아야 한다.
b. 매개변수의 개수나 타입이 달라야 한다.
c. 리턴타입이 달라야 한다.
d. 매개변수의 이름이 달라야 한다.

6-11. 다음 중 아래의 add메서드를 올바르게 오버로딩 한 것은? (모두 고르시오) b,c,d
> long add(int a, int b) { return a+b; }

a. long add(int x, int y) { return x+y; }
b. long add(long a, long b) { return a+b; }
c. int add(byte a, byte b) { return a+b; }
d. int add(long a, int b) { return (int)(a+b); }

6-12. 다음 중 초기화에 대한 설명으로 옳지 않은 것은? (모두 고르시오)c
a. 멤버변수는 자동 초기화되므로 초기화하지 않고도 값을 참고할 수 있다.
b. 지역변수는 사용하기 전에 반드시 초기화해야 한다.
c. 초기화 블럭보다 생성자가 먼저 수행된다.
d. 명시적 초기화를 제일 우선적으로 고려해야 한다.
e. 클래스변수보다 인스턴스변수가 먼저 초기화된다

6-13. 다음 중 인스턴스변수의 초기화 순서가 올바른 것은?a
a. 기본값-명시적초기화-초기화블럭-생성자
b. 기본값-명시적초기화-생성자-초기화블럭
c. 기본값-초기화블럭-명시적초기화-생성자
d. 기본값-초기화블럭-생성자-명시적초기화

6-14. 다음 중 지역변수에 대한 설명으로 옳지 않은 것은? (모두 고르시오)a
a. 자동 초기화되므로 별도의 초기화가 필요없다.
b. 지역변수가 선언된 메서드가 종료되면 지역변수도 함께 소멸된다.
c. 메서드의 매개변수로 선언된 변수도 지역변수이다.
d. 클래스변수나 인스턴스변수보다 메모리 부담이 적다.
e. 힙(heap)영역에 생성되며 가비지 컬렉터에 의해 소멸된다.

6-17. 다음과 같이 정의된 메서드를 작성하고 테스트하세요.
메서드명 : shuffle
기능 
주어진 배열에 담긴 값의 위치를 바꾸는 작업을 반복하여 뒤섞이게 한다. 
처리한 배열을 반환한다.
반환타입 : int[]
매개변수 : int[] arr - 정수값이 담긴 배열

class Exercise6_17 {

    private static int[] shuffle(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int j = (int) Math.random() % arr.length;
            int nums = arr[j];
            arr[i] = arr[j];
            arr[j] = nums;

        }
        return arr;
    }


    public static void main(String[] args) {
        int[] original = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        System.out.println(java.util.Arrays.toString(original));

        int[] result = shuffle(original);
        System.out.println(java.util.Arrays.toString(result));
    }


}

6-18. 다음과 같이 정의된 메서드를 작성하고 테스트하세요.
메서드명 : isNumber
기능
주어진 문자열이 모두 숫자로만 이루어져있는지 확인한다.
모두 숫자로만 이루어져있으면 true를 반환하고, 그렇지 않으면 false를 반환한다.
만일 주어진 문자열이 null이거나 빈문자열 ""이라면 false를 반환한다.
반환타입 : boolean
매개변수 : String str - 검사할 문자열    
(힌트) String클래스의 charAt(int i)메서드를 사용하면 문자열의 i번째 위치한 문자를 얻을 수 있다.

class Exercise6_18 {
    private static boolean isNumber(String str) {
        boolean tf = true;
        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i)>='0' && str.charAt(i)<='9'){
                tf = true;
            }else {
                tf = false;
                break;
            }
        }return tf;
    }

    public static void main(String[] args) {
        String str = "123";
        System.out.println(str + " 는 숫자입니까? " + isNumber(str));
        str = "1234o";
        System.out.println(str + " 는 숫자입니까? " + isNumber(str));
    }

}
//예상 결과 : 123는 숫자입니까? true, 1234o는 숫자입니까? false


6-19. Tv클래스를 주어진 로직대로 완성하세요. 완성한 후에 실행해서 주어진 실행결과와 일치하는지 확인하세요.

class MyTv {
    boolean isPowerOn;
    int channel;
    int volume;
    final int MAX_VOLUME = 100;
    final int MIN_VOLUME = 0;
    final int MAX_CHANNEL = 100;
    final int MIN_CHANNEL = 1;
    void turnOnOff() {
        if (isPowerOn == true){
            isPowerOn = true;
        }else {
            isPowerOn =false;
        }
        // (1) isPowerOn의 값이 true면 false로, false면 true로 바꾼다.
    }
    void volumeUp() {
        if (volume < MAX_VOLUME)
            volume++;
        // (2) volume의 값이 MAX_VOLUME보다 작을 때만 값을 1 증가시킨다.
    }
    void volumeDown() {
        if (volume > MIN_VOLUME)
            volume--;
        // (3) volume의 값이 MIN_VOLUME보다 클 때만 값을 1 감소시킨다.
    }
    void channelUp() {
        if (channel == MAX_CHANNEL){
            channel = MIN_CHANNEL;
        } else {
            channel++;
        }
        // (4) channel의 값을 1 증가시킨다.
        // 만일 channel이 MAX_CHANNEL이면 , channel의 값을 MIN_CHANNEL로 바꾼다.
    }
    void channelDown() {
        if (channel == MIN_CHANNEL){
            channel = MAX_CHANNEL;
        } else {
            channel--;
        }
        // (5) channel의 값을 1 감소시킨다 .
        // 만일 channel이 MIN_CHANNEL이면, channel의 값을 MAX_CHANNEL로 바꾼다.
    }
}

class Exercise6_19 {
    public static void main(String args[]) {
        MyTv t = new MyTv();
        t.channel = 100;
        t.volume = 0;
        System.out.println("CH:" + t.channel + ", VOL:" + t.volume);
        t.channelDown();
        t.volumeDown();
        System.out.println("CH:" + t.channel + ", VOL:" + t.volume);
        t.volume = 100;
        t.channelUp();
        t.volumeUp();
        System.out.println("CH:" + t.channel + ", VOL:" + t.volume);
    }
}

//예상 결과 : CH: 100, VOL: 0 / CH: 99, VOL: 0 / CH: 100, VOL: 100

6-20. 다음과 같이 정의된 메서드를 작성하고 테스트하세요.
메서드명 : max
기능 
주어진 int형 배열의 값 중에서 제일 큰 값을 반환한다.
만일 주어진 배열이 null이거나 크기가 0인 경우, -999999를 반환한다.
반환타입 : int
매개변수 : int[] arr - 최대값을 구할 배열


class Exercise6_20 {
    private static int max(int[] data) {
        if (data==null || data.length == 0)
            return -99999;
        int maxdata = 0;
        for (int i = 0; i < data.length; i++){
            if ( data[i]>maxdata)
                maxdata = data[i];

        }return maxdata;
    }
    public static void main(String[] args) {
        int[] data = {3,2,9,4,7};
        System.out.println(java.util.Arrays.toString(data));
        System.out.println("최대값 :"+max(data));
        System.out.println("최대값 :"+max(null));
        System.out.println("최대값  :"+max(new int[]{})); // 크기가 0인 배열  }
    }


}

//예상 결과 : 최대값: 9 / 최대값: -99999 최대값: -999999

class Exercise6_21 {
    private static int abs(int value) {
        if (value >= 0){
            value = value*1;
        }else{
            value = value*-1;
        }return value;
    }
    public static void main(String[] args) {
        int value = 5;
        System.out.println(value + "의 절대값 :" + abs(value));
        value = -10;
        System.out.println(value + "의 절대값 :" + abs(value));
    }


}
//예상 결과 : 5의 절대값 : 5 / -10의 절대값 : 10
```