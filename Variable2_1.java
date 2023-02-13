import java.util.Date;

class Variable2_1 {
    public static void main(String[] args) {
        int score = 100;
        System.out.println("score = " + score);
        score = 90;
        System.out.println("score = " + score);

        final int finalScore = 100;
        System.out.println("finalScore = " + finalScore);
//         finalScore = 90; // Error 발생
    }
}

class Variable2_2 {
    public static void main(String[] args) {
        int score = 100;
        final int finalScore = 1000;
    }
}

class Variable2_3 {
    public static void main(String[] args) {
        // boolean flag1 = 22; // Error 발생
        boolean flag2 = false; // true, false 만 가능!

        // char grade1 = 'AA'; // Error 발생
        // char grade2 = "A"; // Error 발생
        char grade3 = 'A'; // char 타입은 이렇게 하나의 문자만 가능!
        char ch = '\n'; // 개행문자(\n, \t 등) 가능!

        // String name1 = 'C'; // Error 발생
        // String name2 = 'Choi'; // Error 발생
        String str = "C"; // 한 문자 가능! 문자가 하나여도 문자열로 인식!
        String name3 = "choi"; // 여러 문자 가능!

        // byte val1 = 128; // Error 발생
        byte val2 = 127; // int 와 같은 리터럴로 저장하지만 범위가 지정되어 있음! -128 ~ 127

        short sval = 128;

        // 리터럴 접두사 예제
        // int의 진수 표현
        int ob = 0b0101; // 2진수, 접두사 0b
        int i = 100; // 10진수
        int oct = 0100; // 8진수, 접두사 0
        int hex = 0x100; // 16진수, 접두사 0x

        long price = 2_147_483_648L; // _ 를 사용하여 숫자 표현 가능!
        // long l1 = 2_147_483_648; // Error 발생, int 범위를 넘었으니 L 접미사 필수!
        long l2 = 100; // int의 범위를 넘지 않으면 L 생략 가능!

        // float tax1 = 3.14;
        float tax2 = 3.14f;

        double score1 = 3.14159265358979; // d 생략 가능!
        double score2 = 3.14159265358979d;

        float f1 = 10f; // 10.0f
        double d1 = 10.; // 10.0
        double d2 = .10; // 0.10
        double d3 = 1e3; // 1000.0 , e3 = 10의 3제곱
        double d4 = -1e3; // -1000.0
    }
}

class Variable3_1 {
    public static void main(String[] args) {
        // 부호있는 경우
        short sMin = -32768;
        short sMax = 32767;

        // short 타입에서 최솟값 범위를 넘었을 때
        // sMin - 1 = 32767
        System.out.println("sMin = " + sMin); // sMin = -32768
        System.out.print("sMin - 1 = ");
        System.out.println((short)(sMin - 1)); // sMin - 1 = 32767

        // short 타입에서 최댓값 범위를 넘었을 때
        // sMax + 1 = -32768
        System.out.println("sMax = " + sMax); // sMax = 32767
        System.out.print("sMax + 1 = ");
        System.out.println((short)(sMax + 1)); // sMax + 1 = -32768

        // 부호없는 경우
        char cMin = 0;
        char cMax = 65535;

        // short 타입에서 최솟값 범위를 넘었을 때
        // cMin - 1 = 65535
        System.out.println("cMin = " + (int)cMin); // cMin = 0
        System.out.print("cMin - 1 = ");
        System.out.println((int)(--cMin)); // cMin - 1 = 65535

        // short 타입에서 최댓값 범위를 넘었을 때
        // cMax + 1 = 0
        System.out.println("cMax = " + (int)cMax); // cMax = 65535
        System.out.print("cMax + 1 = ");
        System.out.println((int)(++cMax));  // cMax + 1 = 0
    }
}

class Variable3_2  {
    public static void main(String[] args) {
        int num = 5;
        char ch = '5';

        // 숫자 -> 문자
        System.out.println("num = " + num); // num = 5
        // '0' 이 48이기 때문에 결과값을 char 타입으로 변환 필요
        System.out.println("num + '0' = " + (char)(num + '0')); // num + '0' = 5

        // 문자 -> 숫자
        System.out.println("ch = " + ch); // ch = 5
        System.out.print("ch - '0' = ");
        System.out.println(ch - '0'); // ch - '0' = 5

        // '5' 에서 숫자 5로 변환되었기 때문에 결과값 6
        System.out.print("ch - '0' + 1 = ");
        System.out.println(ch - '0' + 1); // ch - '0' + 1 = 6
    }
}

class Variable3_3  {
    public static void main(String[] args) {
        int num = 5;
        char ch = '5';

        // 숫자 -> 문자열
        System.out.println("num + \"\" = " + num + ""); // num + "" = 5
        // num 이 "5" 로 변환되었기 때문에 "5" + "5" 로  결과값은 "55"
        System.out.println("num + \"\" + \"5\" = " + num + "" + "5");  // num + "" + "5" = 55

        // 문자 -> 문자열
        System.out.println("ch + \"\" = " + ch + "");  // ch + "" = 5
        // ch 이 '5' 에서 "5" 로 변환되었기 때문에 "5" + "8" 로  결과값은 "58"
        System.out.println("ch + \"\" + \"8\" = " + ch + "" + "8"); // ch + "" + "8" = 58

    }
}

class Variable3_4  {
    public static void main(String[] args) {
        String str1 = "100";
        String str2 = "3.14";
        String str3 = "8";

        // 문자열 -> 숫자
        System.out.println("Integer.parseInt(str) = " + Integer.parseInt(str1)); // Integer.parseInt(str) = 100
        // Integer.parseInt() 은 int 타입만 가능
//         System.out.println("Integer.parseInt(str2) = " + Integer.parseInt(str2)); // Error 발생
        System.out.println("Double.parseDouble(str2) = " + Double.parseDouble(str2)); // Double.parseDouble(str2) = 3.14

        // 문자열 -> 문자
        System.out.println("str.charAt(0) = " + str1.charAt(0) + str1.charAt(1) + str1.charAt(2)); // str.charAt(0) = 100
        System.out.println("str2.charAt(0) = " + str3.charAt(0)); // str2.charAt(0) = 8
    }
}

class Variable3_5 {
    public static void main(String[] args) {
        // Date import 필요!

        Date date; // 참조형 변수 date 를 선언
        date = new Date(); // date 에 객체의 주소를 저장 , new 는 객체를 생성하는 명령어

        System.out.println(date); // Wed Jan 11 20:54:45 KST 2023
    }
}

class Variable4_1 {
    public static void main(String[] args) {
        char ch1 = 'A'; // 문자
        // char ch2 = 'AB'; // Error 발생
        // char ch3 = ''; // Error 발생, 빈 문자 불가능

        String s1 = "ABC"; // 문자열
        String s2 = ""; // 빈 문자열 가능
        String s3 = "A"; // 문자 한 개도 문자열!
        System.out.println("s1 = " + s1); // s1 = ABC
        System.out.println("s2 = " + s2); // s2 =
        System.out.println("s3 = " + s3); // s3 = A

        // 아래 두 표현식 모두 사용 가능하지만 ss2 방식은 거의 사용하지 않음!
        String ss1 = "AB";
        String ss2 = new String("AB");

        System.out.println("ss1 = " + ss1); // ss1 = AB
        System.out.println("ss2 = " + ss2); // ss2 = AB
    }
}

class Variable4_2 {
    public static void main(String[] args) {
        String s1 = "A" + "B"; // "AB"
        System.out.println("s1 = " + s1);

        // 문자열은 문자열하고만 결합할 수 있기 때문에
        // 숫자를 문자열로 바꾼 다음에 결합 합니다.
        String s2 = "" + 7;
        // "" + 7 => "" + "7" = "7"
        System.out.println("s2 = " + s2);

        // 문자열 결합 순서에 의한 차이 확인!
        String s3 = "" + 7 + 7;
        // "" + 7 + 7 => "7" + 7 => "7" + "7" = "77"
        System.out.println("s3 = " + s3);

        String s4 = 7 + 7 + "";
        // 7 + 7 + "" => 14 + "" = "14"
        System.out.println("s4 = " + s4);
    }
}

class Variable4_3 {
    public static void main(String[] args) {
        int x = 10, y = 20;
        // x 와 y 값을 교환해 보겠습니다.
        x = y; // x = 20;
        // 변수는 하나의 값 밖에 저장할 수 없기 때문에 기존의 x의 값 10은 사라지고 20이 됩니다.
        y= x; // y = 20;
        // y는 20 이된 x의 값을 받습니다.

        System.out.println("x = " + x); // 20
        System.out.println("y = " + y); // 20

        System.out.println();
        // 교환이 제대로 되지 않았습니다!

        int a = 10, b = 20;
        int tmp; // 교환에 중간다리 역할을 해 줄 변수 하나를 선언합니다.
        // a 와 b 값을 교환해 보겠습니다.
        tmp = a; // a = 10, tmp = 10
        a = b; // b = 20, a = 20
        b = tmp; // tmp = 10, b = 10

        // 결과로 a = 20, b = 10 이어야 됩니다.
        System.out.println("a = " + a); // 20
        System.out.println("b = " + b); // 10
        System.out.println("tmp = " + tmp); // 10

        // 교환이 성공적으로 되었습니다!
    }
}
