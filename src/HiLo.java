import java.util.Scanner;

public class HiLo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String playAgain = "";
		do {
			// ��������� ���������� �����, ������� ����� ��������� ������������
			int theNumber = (int) (Math.random() * 100 + 1);
			// System.out.println(theNumber);
			int guess = 0;
			while (guess != theNumber) {
				System.out.println("�������� ����� �� 1 �� 100: ");
				guess = scan.nextInt();
				// System.out.println("�� ����� " + guess + ".");
				if (guess < theNumber)
					System.out.println(guess + " ������ ����������� �����. ���������� ��� ���.");
				else if (guess > theNumber)
					System.out.println(guess + " ������ ����������� �����. ���������� ��� ���.");
				else 
					System.out.println(guess + " - ��� �����. �� ��������!");
			}
			System.out.println("������ �� �� ����� �������� (��/���)?");
			playAgain = scan.next();
		} while (playAgain.equalsIgnoreCase("��"));
		System.out.println("������� ��� �� ����! �� ��������.");
		scan.close();
	}
}
