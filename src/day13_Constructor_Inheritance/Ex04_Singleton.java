package day13_Constructor_Inheritance;

class Singleton04{
	private static Singleton04 si;
	public Singleton04() {
		System.out.println("�⺻ ������ ����");
	}
	public static Singleton04 getInstance() {
		System.out.println("si : "+si);
		if(si==null)
			si=new Singleton04();//��ü�� �ϳ��� ����� ����� �̱��� ���
		return si;
	}
}
public class Ex04_Singleton {
	public static void main(String[] args) {
		Singleton04 si01 = Singleton04.getInstance();
		System.out.println("si01 : "+si01);
		Singleton04 si02 = Singleton04.getInstance();
		System.out.println("si02 : "+si02);
	}
}
