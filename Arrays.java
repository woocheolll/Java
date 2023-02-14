import java.util.Arrays;

class Arrays2_1 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        System.out.println("배열의 길이 = " + arr.length);

        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "] = " + arr[i]);
        }
        System.out.println();
        // index 범위를 벗어나는 경우 Error 발생
        for (int i = 0; i < arr.length + 1; i++) {
            System.out.println("arr[" + i + "] = " + arr[i]);
        }
    }
}

class Arrays2_2 {
    public static void main(String[] args) {
        int[] num1 = new int[]{1,2,3,4,5,6,7,8,9};
        int[] num2 = {1,2,3,4,5,6,7,8,9};

        for (int i = 0; i < num1.length; i++) {
            System.out.println("num1[" +i + "] = " + num1[i]);
        }
        System.out.println();
        for (int i = 0; i < num2.length; i++) {
            System.out.println("num2[" +i + "] = " + num2[i]);
        }

        System.out.println();

        // 주의 할 점!
        int[] num3;
        // num3 = {1,2,3,4,5,6,7,8,9}; // Error 발생합니다.

        // 위처럼 나눠서 표현을 해야 한다면 아래처럼 초기화 하셔야 합니다.
        int[] num4;
        num4 = new int[]{1,2,3,4,5,6,7,8,9};

        for (int i = 0; i < num4.length; i++) {
            System.out.println("num4[" +i + "] = " + num4[i]);
        }
    }
}

class Arrays3_1 {
    public static void main(String[] args) {
        int[] arr = {100, 90, 80, 70, 60, 50, 40, 30, 20, 10};
        //  배열을 가리키는 참조 변수 arr 을 출력
        System.out.println("arr = " + arr);
        // 메모리 주소와 비슷한 문자열이 출력 -> 실제 주소는 아닙니다.
        // [I@7a81197d -> [(배열을 뜻함), I(int 타입을 뜻함), @(위치를 뜻함)

        // 예외 확인 하기 - char[]
        char[] chArr = {'a', 'b', 'c', 'd'};
        System.out.println(chArr); // abcd 가 출력되는데 이는 println 메서드의 기능 때문!

        // 배열의 요소 하나씩 출력하기
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "] = " + arr[i]);
        }

        // Arrays.toString(배열) : 배열의 모든 요소를 문자열로 만들어서 반환한다.
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
    }
}

class Arrays3_2 {
    public static void main(String[] args) {
        int sum = 0; // 총합을 저장
        float avg = 0f; // 평균을 저장

        int[] score = {100, 40, 33, 50, 77, 29};

        for (int i = 0; i < score.length; i++) {
            System.out.println("score[" + i + "] = " + score[i]);
            sum += score[i];
        }

        avg = sum / (float) (score.length); // 계산결과를 float 타입으로 얻기 위해 형변환

        System.out.println("총합 = " + sum);
        System.out.println("평균 = " + avg);
    }
}

class Arrays3_3 {
    public static void main(String[] args) {
        int[] score = {65, 97, 88, 43, 33, 91, 28};

        int max = score[0]; // 최대값을 배열의 첫 번째 값으로 초기화 한다.
        int min = score[0]; // 최소값을 배열의 첫 번째 값으로 초기화 한다.

        for (int i = 0; i < score.length; i++) {
            if (score[i] > max) {
                max = score[i];
            } else if(score[i] < min) {
                min = score[i];
            }
        }

        System.out.println("최대값 = " + max);
        System.out.println("최소값 = " + min);
    }
}

class Arrays3_4 {
    public static void main(String[] args) {
        int[] numArr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("원본 = " + Arrays.toString(numArr));

        for (int i = 0; i < numArr.length; i++) {
            int num = (int) (Math.random() * 10); // 0 ~ 9 의 랜덤 수

            int tmp = numArr[0]; // 배열의 첫 번째 수로 계속 초기화 된다.

            // 랜덤한 위치의 값과 배열의 첫 번째 수가 서로 바뀐다.
            numArr[0] = numArr[num];
            numArr[num] = tmp;

            System.out.println(i + 1 + " 번째 변경 : " + Arrays.toString(numArr));
        }

        System.out.println("결과 = " + Arrays.toString(numArr));
    }
}

class Arrays4_1 {
    public static void main(String[] args) {
        String str = "ABCDEFG";
        char ch = str.charAt(3);
        System.out.println("ch = " + ch); // ch = D
        // 3번째 출력 (0번부터 시작)

        String str2 = str.substring(1, 4);
        System.out.println("str2 = " + str2); // str2 = BCD
        // 1번째 부터 4번째 전까지 출력

        String str3 = str.substring(1);
        System.out.println("str3 = " + str3); // str3 = BCDEFG
        // 1번째 부터 마지막까지 출력

        String str4 = str.substring(1, str.length());
        System.out.println("str4 = " + str4); // str4 = BCDEFG
        // 1번째 부터 str 길이 만큼 출력

        char[] chArr = str.toCharArray();
        System.out.println("Arrays.toString(chArr) = " + Arrays.toString(chArr));
        // 문자열으로 출력
    }
}

class Arrays4_2 {
    public static void main(String[] args) {
        String[] strArr = {"축구", "야구", "골프", "테니스"};
        System.out.println("Arrays.toString(strArr) = " + Arrays.toString(strArr));
        // 문자열으로 출력
        String[] strArr2 = new String[4];
        System.out.println("Arrays.toString(strArr2) = " + Arrays.toString(strArr2));
        //참조형 이기 때문에 기본값 null 로 초기화 됩니다.
    }
}

class Arrays5_1 {
    public static void main(String[] args) {
        int[][] score = {
                {88, 35, 100},
                {84, 60, 55},
                {100, 99, 72},
                {33, 54, 77}
        };

        //길이 확인하기
        System.out.println("score.length = " + score.length); // score.length = 4
        System.out.println("score[0].length = " + score[0].length);  // score[0].length = 3

        System.out.println();
        // 출력 예 1 : Arrays.toString()
        System.out.println("Arrays.toString()");
        System.out.println("Arrays.toString(score[0]) = " + Arrays.toString(score[0])); // Arrays.toString(score[0]) = [88, 35, 100]
        System.out.println("Arrays.toString(score[1]) = " + Arrays.toString(score[1])); // Arrays.toString(score[1]) = [84, 60, 55]
        System.out.println("Arrays.toString(score[2]) = " + Arrays.toString(score[2]));  // Arrays.toString(score[2]) = [100, 99, 72]
        System.out.println("Arrays.toString(score[3]) = " + Arrays.toString(score[3])); // Arrays.toString(score[3]) = [33, 54, 77]

        System.out.println();
        // 출력 예 2 : for
        System.out.println("for");
        for (int i = 0; i < score.length; i++) {
            for (int j = 0; j < score[i].length; j++) {
                System.out.println("score[" + i + "][" + j + "] = " + score[i][j]); //
            }
            System.out.println();

        }
//        for
//        score[0][0] = 88
//        score[0][1] = 35
//        score[0][2] = 100
//
//        score[1][0] = 84
//        score[1][1] = 60
//        score[1][2] = 55
//
//        score[2][0] = 100
//        score[2][1] = 99
//        score[2][2] = 72
//
//        score[3][0] = 33
//        score[3][1] = 54
//        score[3][2] = 77

        System.out.println();
        // 출력 예 3 : 향상된 for
        System.out.println("향상된 for");
        for (int[] ints : score) {
            for (int it : ints) {
                System.out.println("anInt = " + it);
            }
            System.out.println();
        }
    }
}
//향상된 for
//        anInt = 88
//        anInt = 35
//        anInt = 100
//
//        anInt = 84
//        anInt = 60
//        anInt = 55
//
//        anInt = 100
//        anInt = 99
//        anInt = 72
//
//        anInt = 33
//        anInt = 54
//        anInt = 77