class Control1_1 {
    public static void main(String[] args) {
        char ch = 'b';
        if (ch >= 'a' && ch <= 'z') {
            System.out.println("해당 문자는 영문 소문자입니다.");
        }
    }
}

class Control1_2 {
    public static void main(String[] args) {
        char ch = 'Z';
        if (ch >= 'a' && ch <= 'z') {
            System.out.println("해당 문자는 영문 소문자입니다.");
        } else {
            System.out.println("해당 문자는 영문 소문자가 아닙니다.");
        }
    }
}

class Control1_3 {
    public static void main(String[] args) {
        char ch = 'p';

        if (ch >= 'a' && ch <= 'z') {
            System.out.println("해당 문자는 영문 소문자입니다.");
        } else if (ch >= 'A' && ch <= 'Z') {
            System.out.println("해당 문자는 영문 대문자입니다.");
        } else {
            System.out.println("해당 문자는 영문자가 아닙니다.");
        }

        int score = 70;

        if (score >= 90) {
            System.out.println("A등급입니다.");
        } else if(score >= 80) {
            System.out.println("B등급입니다.");
        } else if(score >= 70) {
            System.out.println("C등급입니다.");
        }
    }
}

class Control1_4 {
    public static void main(String[] args) {
        int score = 87;

        if (score >= 90) {
            if(score >= 95){
                System.out.println("A++등급입니다.");
            }else {
                System.out.println("A등급입니다.");
            }
        } else if(score >= 80) {
            if(score >= 85){
                System.out.println("B++등급입니다.");
            }else {
                System.out.println("B등급입니다.");
            }
        } else if(score >= 70) {
            if(score >= 75){
                System.out.println("C++등급입니다.");
            }else {
                System.out.println("C등급입니다.");
            }
        }else {
            System.out.println("D등급입니다.");
        }
    }
}