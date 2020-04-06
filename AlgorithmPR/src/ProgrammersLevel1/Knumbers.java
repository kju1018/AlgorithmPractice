package ProgrammersLevel1;

import java.util.ArrayList;

public class Knumbers {

	public static void main(String[] args) {
	int[] array = {1,5,2,6,3,7,4};
	int[][] commands = {{2,5,3},{4,4,1},{1,7,3}};
	ArrayList temp =new ArrayList();
	int[] answer = new int[commands.length];
	
	int count = 0;
	
	for(int i = 0 ; i < commands.length ; i++) {
		for(int j = commands[i][0]-1 ; j < commands[i][1] ; j++) {
			temp.add(array[j]);
		}
		temp.sort(null);
		System.out.println(temp);
		answer[count++] = (int) temp.get(commands[i][2]-1);	
		temp.clear();
	}
		
		System.out.print(answer[0]+" "+ answer[1]+ " " +answer[2]);
		
	}
	
	//int[] temp = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]); 배열을 복사

}
