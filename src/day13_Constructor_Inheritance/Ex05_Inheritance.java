package day13_Constructor_Inheritance;

class Calc01{
	public Calc01(String s) {
		System.out.println(s + "calc �θ� ������");
	}
	public void disply() {
		System.out.println("�θ� ���� �����");
	}
}
class Computer01 extends Calc01{
	public Computer01() {
		super("�� ����");//�θ� �����ڿ��� �� �����Ҷ� ���
		System.out.println("com �ڽ� ������");
	}
	public void print() {
		System.out.println("���� ��ǻ�;�");
	}
	/*
	public void disply() {
		System.out.println("���� �����");
	}
	*/
}
public class Ex05_Inheritance {
	public static void main(String[] args) {
		/*
		 ���
		 -Extends�� ���� �����.
		 -���ο� ����� �߰��Ѵ�.
		 */
		//Calc01 ca = new Calc01();
		//ca.disply();
		Computer01 com = new Computer01();
		com.print(); com.disply();
	}
}
