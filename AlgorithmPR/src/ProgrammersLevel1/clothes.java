package ProgrammersLevel1;

public class clothes {

	public static void main(String[] args) {
		int n =7;
		int[] lost = {2,3,4};
		int[] reserve = {1,2,3,6};
		int answer = n-lost.length;

		for(int i = 0 ; i< lost.length;i++) {
			for(int j = 0 ;j<reserve.length; j++) {
				if(lost[i] == reserve[j] && (reserve[j]!=0) && (lost[i] != 0)) {
					answer ++;
					lost[i]=0;
					reserve[j]=0;
				}
				
			}
		}



		for(int i = 0 ; i< lost.length;i++) {
			for(int j = 0 ;j<reserve.length; j++) {
				if((lost[i] -1 == reserve[j]) && (reserve[j]!=0) && (lost[i] != 0)) {
					answer++;
					reserve[j]=0;
					lost[i]=0;
					break;
				}

				else if ((lost[i] + 1 == reserve[j]) && (reserve[j]!=0) && (lost[i] != 0)) {
					answer++;
					reserve[j]=0;
					lost[i]=0;
					break;
				}
			}
		}
		System.out.print(answer);

	}

}
