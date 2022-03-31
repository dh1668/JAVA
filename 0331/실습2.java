package OPP;

public class 실습2 {
    public static void main(String argv[]) {
        Time d = new Time(12, 3, 29);
        Time s1 = new Time(10, 2, 10);
        Time s2 = new Time(11, 58, 30);
        Time s3 = new Time(12, 50, 10);

        // 테스트
        d.add(s1).print();
        d.sub(s1).print();
        d.add(s2).print();
        d.sub(s2).print();
        d.add(s3).print();
        d.sub(s3).print();
    }
}

class Time {
    // 24시간을 초로 바꿨을 때의 값
    private static final int ONE_DAY = 24 * 60 * 60;

    private int hour;   // 시간
    private int minute; // 분
    private int second; // 초
    private int day;    // 전일(-1)/당일(0)/후일(1)을 저장하는 변수

    public Time() {
        this.hour = 0;
        this.minute = 0;
        this.second = 0;
        this.day = 0;
    }

    public Time(int hour, int minute, int second) {
       this.hour = hour;
       this.minute = minute;
       this.second = second;
       this.day = 0;
    }

    // src 클레스의 시간을 초로 바꿔주는 메소드
    private int toSec(Time src) {
        return (src.hour * 60 * 60) + (src.minute * 60) + src.second;
    }

    // 초롤 계산된 결과 값을 저장하는 메소드
    private void setTime(int r) {
        if(r < 0) {
            r = r + ONE_DAY;
            day = -1;
        } else if(r > ONE_DAY) {
            r = r - ONE_DAY;
            day = 1;
        } else {
            day = 0;
        }

        int tmp = r % (60 * 60);
        this.hour = r / (60 * 60);
        this.minute = tmp / 60;
        this.second = tmp % 60;
    }

    // 시간 빼기 계산 메소드
    public Time sub(Time src) {
        int r = toSec(this) - toSec(src);
        Time rt = new Time();
        rt.setTime(r);
        return rt;
    }

    // 시간 더하기 계산 메소드
    public Time add(Time src) {
        int r = toSec(this) + toSec(src);
        Time rt = new Time();
        rt.setTime(r);
        return rt;
    }

    // 시간 비교 메소드
    public int compare(Time src) {
        // 현재 클래스의 시간을 초로 변환
        int t = toSec(this);
        // 인자로 받은 src의 시간을 초로 변환
        int s = toSec(src);

        if(t > s)
            return 1;
        if(t < s)
            return -1;

        return 0;
    }

    // 출력 메소드
    public void print() {
        if(this.day == -1) // 시간이 음수일 경우
            System.out.println(String.format("전일 %d시 %d분 %d초입니다.", this.hour, this.minute, this.second));
        else if(this.day == 1) // 시간이 24 이상일 경우
            System.out.println(String.format("후일 %d시 %d분 %d초입니다.", this.hour, this.minute, this.second));
        else // day == 0
            System.out.println(String.format("당일 %d시 %d분 %d초입니다.", this.hour, this.minute, this.second));
    }
}
