//package 실습Test;
//
//public class Chkstr1 {
//
//	public static void main(String[] args) {
//		Select s1 = new Select("ABCD", "abcd");
//		Select s2 = new Select("1001", "1001");
//
//		System.out.println("s1: " + s1.connect());
//		System.out.println("s2: " + s2.connect());
//	}
//}
//
//abstract class Tr {
//	protected String msg1;
//	protected String msg2;
//	// false면 문자열, true면 숫자
//	protected boolean state1;
//	protected boolean state2;
//
//	public Tr(String msg1, String msg2) {
//		this.msg1 = msg1;
//		this.msg2 = msg2;
//	}
//}
//
//class Strcmp extends Tr {
//	public Strcmp(String msg1, String msg2) {
//		super(msg1, msg2);
//		this.state1 = false;
//		this.state2 = false;
//	}
//
//	public int cmp() {
//		System.out.println("Called \"Strcmp::cmp\" ");
//		return this.msg1.compareTo(this.msg2);
//	}
//}
//
//class Numcmp extends Tr {
//	public Numcmp(String msg1, String msg2) {
//		super(msg1, msg2);
//		this.state1 = true;
//		this.state2 = true;
//	}
//
//	public int cmp() {
//		System.out.println("Called \"Numcmp::cmp\" ");
//		if (Integer.parseInt(this.msg1) > Integer.parseInt(this.msg2))
//			return 1;
//		if (Integer.parseInt(this.msg1) < Integer.parseInt(this.msg2))
//			return -1;
//		return 0;
//	}
//}
//
//class Select extends Tr {
//	public Select(String msg1, String msg2) {
//		super(msg1, msg2);
//	}
//
//	public Tr check() {
//		Tr r = null;
//		try {
//			Integer.parseInt(this.msg1);
//			Integer.parseInt(this.msg2);
//			r = new Numcmp(this.msg1, this.msg2);
//		} catch (Exception e) {
//			r = new Strcmp(this.msg1, this.msg2);
//		}
//		return r;
//	}
//
//	public int connect() {
//		Tr r = check();
//
//		if (r instanceof Strcmp)
//			return ((Strcmp) r).cmp();
//		if (r instanceof Numcmp)
//			return ((Numcmp) r).cmp();
//
//		return -2;
//	}
//}