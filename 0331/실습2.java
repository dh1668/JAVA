package OPP;

public class �ǽ�2 {
    public static void main(String argv[]) {
        Time d = new Time(12, 3, 29);
        Time s1 = new Time(10, 2, 10);
        Time s2 = new Time(11, 58, 30);
        Time s3 = new Time(12, 50, 10);

        // �׽�Ʈ
        d.add(s1).print();
        d.sub(s1).print();
        d.add(s2).print();
        d.sub(s2).print();
        d.add(s3).print();
        d.sub(s3).print();
    }
}

class Time {
    // 24�ð��� �ʷ� �ٲ��� ���� ��
    private static final int ONE_DAY = 24 * 60 * 60;

    private int hour;   // �ð�
    private int minute; // ��
    private int second; // ��
    private int day;    // ����(-1)/����(0)/����(1)�� �����ϴ� ����

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

    // src Ŭ������ �ð��� �ʷ� �ٲ��ִ� �޼ҵ�
    private int toSec(Time src) {
        return (src.hour * 60 * 60) + (src.minute * 60) + src.second;
    }

    // �ʷ� ���� ��� ���� �����ϴ� �޼ҵ�
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

    // �ð� ���� ��� �޼ҵ�
    public Time sub(Time src) {
        int r = toSec(this) - toSec(src);
        Time rt = new Time();
        rt.setTime(r);
        return rt;
    }

    // �ð� ���ϱ� ��� �޼ҵ�
    public Time add(Time src) {
        int r = toSec(this) + toSec(src);
        Time rt = new Time();
        rt.setTime(r);
        return rt;
    }

    // �ð� �� �޼ҵ�
    public int compare(Time src) {
        // ���� Ŭ������ �ð��� �ʷ� ��ȯ
        int t = toSec(this);
        // ���ڷ� ���� src�� �ð��� �ʷ� ��ȯ
        int s = toSec(src);

        if(t > s)
            return 1;
        if(t < s)
            return -1;

        return 0;
    }

    // ��� �޼ҵ�
    public void print() {
        if(this.day == -1) // �ð��� ������ ���
            System.out.println(String.format("���� %d�� %d�� %d���Դϴ�.", this.hour, this.minute, this.second));
        else if(this.day == 1) // �ð��� 24 �̻��� ���
            System.out.println(String.format("���� %d�� %d�� %d���Դϴ�.", this.hour, this.minute, this.second));
        else // day == 0
            System.out.println(String.format("���� %d�� %d�� %d���Դϴ�.", this.hour, this.minute, this.second));
    }
}
