package Methods;

public class Task3 {

	static int i = 1; // 3
	static String s = "";
	public static int m1() {
		System.out.println(" s = " + s + ", i = " + i);
		return i++ + i; // 2 + 3 = 5
		}
	public static double m2() {
		System.out.println(" s = " + s + ", i = " + i);
		return m1() + 10; // 5 + 10 = 15.0
	}
	public static String m3() {
		System.out.println(" s = " + s + ", i = " + i);
		s = s + i++;
		return s + i + m2();} //"12" + 15.0
	public static void main(String[] args) {
		System.out.println(" s = " + s + ", i = " + i);
		m3(); // 
		System.out.println(" s = " + s + ", i = " + i);
	}
}
