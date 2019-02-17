import java.util.Scanner;

public class NextRound {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		String[] numbers = s.split(" ");
		
		int[] scores = new int[Integer.parseInt(numbers[0])];
		
		String stringScores = sc.nextLine();
		String[] unformattedScores = stringScores.split(" ");
		
		for(int i= 0;i<unformattedScores.length;i++){
			scores[i] = Integer.parseInt(unformattedScores[i]);
		}
		
		int k = Integer.parseInt(numbers[1]);
		
		if(scores[k-1]<=0){
			boolean negative = true;
			for(int i=k-2;i>=0;i--){
				if(scores[i]>0){
					negative = false;
					System.out.println(i+1);
					break;
				}
			}
			if(negative)
				System.out.println(0);
		}else{
			boolean sameElements = true;
			int i;
			for(i=k;i<scores.length;i++){
				if(scores[i] != scores[k-1]){
					sameElements = false;
					System.out.println(i);
					break;
				}
			}
			if(sameElements)
				System.out.println(i);
		}

	}

}
