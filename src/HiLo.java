import java.util.Scanner;

public class HiLo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String playAgain = "";
		do {
			// генерация случайного числа, которое будет угадывать пользователь
			int theNumber = (int) (Math.random() * 100 + 1);
			// System.out.println(theNumber);
			int guess = 0;
			while (guess != theNumber) {
				System.out.println("Угадайте число от 1 до 100: ");
				guess = scan.nextInt();
				// System.out.println("Вы ввели " + guess + ".");
				if (guess < theNumber)
					System.out.println(guess + " меньше загаданного числа. Попробуйте еще раз.");
				else if (guess > theNumber)
					System.out.println(guess + " больше загаданного числа. Попробуйте еще раз.");
				else 
					System.out.println(guess + " - это верно. Вы выиграли!");
			}
			System.out.println("Хотели бы вы снова поиграть (да/нет)?");
			playAgain = scan.next();
		} while (playAgain.equalsIgnoreCase("да"));
		System.out.println("Спасибо вам за игру! До свидания.");
		scan.close();
	}
}
