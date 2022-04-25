package Week2;

public class SumOfDigitsinString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String AB = "Tes12Le79af65";
		int sum = 0;
		int r;
		

		String replace = AB.replaceAll("[\\D]", "");



		int b = Integer.parseInt(replace);

		int temp = b;
		while (temp > 0) {

			r = temp % 10;
			sum = sum + r;
			temp = temp / 10;
	}

		System.out.println(sum);
		
	}

}
