import java.util.Scanner;

public class Main {	
	
	//솔루션 함수
	public double solution(double a, double b) {
		double answer = a / b;
		
		return answer;
	}
	
	//실행 메인 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main T = new Main();
		
		Scanner kb = new Scanner(System.in);
		//1) 입력 : 첫 줄에 A, B 받음
		double a = kb.nextInt();
		double b = kb.nextInt();
		//2) 출력 : 더한 결과 출력
		System.out.println(T.solution(a, b));
	}
}