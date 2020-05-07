import java.util.Scanner;
abstract class Converter{
	protected double ratio;
	abstract protected double convert(double src);
	abstract protected String srcString();
	abstract protected String desString();
	
	public void run() {
		Scanner scanner = new Scanner(System.in);
		System.out.println(desString()+"�� "+srcString()+"���� �ٲߴϴ�.");
		System.out.print(desString()+"�� �Է��ϼ���>>>");
		double val = scanner.nextDouble();
		double res = convert(val);
		System.out.println("��ȯ ���: "+res+srcString());
		scanner.close();
	}
	
}
public class Won2Dollar extends Converter {
	public Won2Dollar(double ratio) {
		this.ratio = ratio;
	}
	protected double convert(double src) {
		return src*ratio;
	}
	protected String srcString() {
		return "��";
	}
	protected String desString() {
		return "�޷�";
	}
	public static void main(String[] args) {
		Won2Dollar toDollar = new Won2Dollar(1200);
		toDollar.run();
	}
}
