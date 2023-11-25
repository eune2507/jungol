package jungol0925.q9013;

public class Main {

	public static void main(String[] args) {
		double x = 1.2340;
		double y = 10.3459;
		
		System.out.println("전체 7자리로 맞추고 소수 4자리까지 출력");
		System.out.print("x = ");
        System.out.printf("%7.4f\n",x);
        System.out.print("y = ");
        System.out.printf("%7.4f\n",y);
        
        System.out.println();
        
        System.out.println("소수 2자리까지 출력(반올림)");
        System.out.print("x = ");
        System.out.printf("%1.2f\n", x);
        System.out.print("y = ");
        System.out.printf("%1.2f\n", y);
	}

}
