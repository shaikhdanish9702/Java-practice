import java.util.*;
public class alpabet {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		String str2 = sc.next();

		int[] count1 = new int[26];
		int[] count2 = new int[26];

		for(int i = 0; i < str1.length(); i++) {
			count1[str1.charAt(i) - 'a']++;
		}
		for(int i = 0; i < str2.length(); i++) {
			count2[str2.charAt(i) - 'a']++;
		}
		
		int sum = 0;
		for(int i = 0; i < 26; i++) {
			sum += Math.abs(count1[i] - count2[i]);
		}
		sum = sum%6;

		switch(sum) {
			case 0:
			System.out.println("Siblings");
			break;

			case 1:
			System.out.println("Friends");
			break;

			case 2:
			System.out.println("Love");
			break;

			case 3:
			System.out.println("Affection");
			break;

			case 4:
			System.out.println("Marriage");
			break;

			case 5:
			System.out.println("Enemy");
			break;
}
}
}