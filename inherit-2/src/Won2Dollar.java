import java.util.Scanner;
abstract class Converter{
	protected double ratio;
	abstract protected double convert(double src);
	abstract protected String srcString();
	abstract protected String desString();
	
	public void run() {
		Scanner scanner = new Scanner(System.in);
		System.out.println(desString()+"를 "+srcString()+"으로 바꿉니다.");
		System.out.print(desString()+"을 입력하세요>>>");
		double val = scanner.nextDouble();
		double res = convert(val);
		System.out.println("변환 결과: "+res+srcString());
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
		return "원";
	}
	protected String desString() {
		return "달러";
	}
	public static void main(String[] args) {
		Won2Dollar toDollar = new Won2Dollar(1200);
		toDollar.run();
	}
}
