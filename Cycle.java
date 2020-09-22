public class Cycle {
	public static void main(String[] args) {
	for(int i = 0; i < 21; i++) {
	System.out.println(i);
	}

	System.out.println();

	int i = 6;
	while(i > -7) {
		i-=2;
		System.out.println(i);
	}

	System.out.println(i);

	int j = 11;
	int sum = 0;
	do {
		j+=2;
		sum+=j;
	} while (j < 21);
	System.out.println(sum);
	}
}