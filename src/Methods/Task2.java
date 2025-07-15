package Methods;

public class Task2 {

	public static void m1() {
		System.out.println("M1 method : ");
		int i = 20;
		int j = ++i;
		System.out.println("i = " + ++i + " j = " + j++); }
	public static void main(String[] args) {
		System.out.println("Main method : ");
		m3();}
	public static void m2() {
		System.out.println("M2 method : ");
		String s = "java";
		s = s.charAt(1) + s.charAt(3)+ s;
		
	 }
	public static void m3() {
		System.out.println("M3 method : ");
		m1();
		m2();
		}
	}