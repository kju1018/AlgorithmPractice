package ProgrammersLevel1;


import java.util.ArrayList;

public class mathgiveup {

	public static void main(String[] args) {
		int [][] pattern = {{1,2,3,4,5} ,
				{2,1,2,3,2,4,2,5},
				{3,3,1,1,2,2,4,4,5,5,}};
		ArrayList<Integer> result = new ArrayList();
		
		System.out.print(pattern[2][5]);
		
		int [] answers = {1,5,4,2,1,5,2,1};
		int count1 = 0, count2 = 0, count3 = 0, Max;
		
		for(int i = 0; i<answers.length ; i++) {
			if(answers[i] == pattern[0][i%pattern[0].length])
				count1++;
		}
		Max = count1;
		
		for(int i = 0; i<answers.length ; i++) {
			if(answers[i] == pattern[1][i%pattern[1].length])
				count2++;
		}
		if(Max < count2)
			Max = count2;

		for(int i = 0; i<answers.length ; i++) {
			if(answers[i] == pattern[2][i%pattern[2].length])
				count3++;
		}
		
		if(Max < count3)
			Max = count3;
		
		if(Max == count1 ) result.add(1);
		
		if(Max == count2) result.add(2);
		
		if(Max == count3) result.add(3);
		
		System.out.println(result);
		 
		int a[] = new int[3];
		for(int i = 0 ;i<result.size();i++)
			a[i] = result.get(i);
		
		for(int i = 0 ;i<result.size();i++)
		System.out.println(a[i]);
		

	}

}
