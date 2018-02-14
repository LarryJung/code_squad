package java_playground;

class Calc {
	int a, b;
	public void setOprands(int a, int b) {
		this.a = a;
		this.b = b;
	}
	public int sum() {
		return this.a+this.b;
	}
}

public class Calculator {
	public static void main(String argsp[]) {
		Calc c1 = new Calc();
		c1.setOprands(10, 20);
		System.out.println(c1.sum());
	}
}
