import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int[] arr = new int[N];

        int M = in.nextInt();
        for(int i=0; i<M; i++) {
            int F = in.nextInt();
            int E = in.nextInt();
            int ball = in.nextInt();

            for(int j = F-1; j<E; j++)
            {
                arr[j] = ball;
            }
        }

        for (int result : arr)
            System.out.print(result + " ");
    }
}