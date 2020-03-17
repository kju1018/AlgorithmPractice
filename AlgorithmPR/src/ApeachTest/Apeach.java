package ApeachTest;

import java.util.Stack;

public class Apeach {

	public static void main(String[] args) {
		int m=6,n=4;//m이 가로 개수	
	
		int picture[][]= {{1,1,1,0},{1,2,2,0},{1,0,0,1},{0,0,0,1},{0,0,0,3},{0,0,0,3}};
		int answer[] = new int[2];

		int visit[][]=new int[m][n];
		Stack stackx= new Stack();
		Stack stacky= new Stack();

		for(int i = 0 ; i< m ;i++) {
			for(int j = 0 ; j< n;j++) {
				visit[i][j]=0;
			}
		}
		/*for(int i =0;i<n;i++) {
			
			for(int j =0;j<m;j++)
			{
				System.out.print(visit[i][j]+" ");
			}
			System.out.println();
		
		}*/
//i=m=y   ,j=n=x


		for(int i = 0 ; i< m ;i++) {
			for(int j = 0 ; j<n;j++) {
				int count = 0;
				if(picture[i][j] > 0 && visit[i][j] == 0) {
					test(stackx,stacky,visit,j,i);
					count++;
					answer[0]++;
				}
				
				while(!stackx.isEmpty()) {
					int x =(int) stackx.pop();
					int y= (int) stacky.pop();//가로개수 n=6
					//위
					if(y>0 && (picture[y-1][x] == picture[i][j])&&( visit[y-1][x] == 0)) {
						test(stackx, stacky, visit, x,y-1);
						count++;
					}
					//좌
					if(x>0 && (picture[y][x-1] == picture[i][j])&&( visit[y][x-1] == 0)) {
						test(stackx, stacky, visit, x-1,y);
						count++;
					}
					//아래
					if(y<m-1 && (picture[y+1][x] == picture[i][j])&&( visit[y+1][x] == 0)) {
						test(stackx, stacky, visit, x,y+1);
						count++;
					}
					//오른쪽
					if(x<n-1 && (picture[y][x+1] == picture[i][j])&&( visit[y][x+1] == 0)) {
						test(stackx, stacky, visit, x+1,y);
						count++;
					}
					
					answer[1] =Math.max(answer[1], count);
				}

			}
		}
			System.out.print(answer[0]+" "+answer[1]);

	}
	public static void test(Stack stackx,Stack stacky, int[][] visit,int j, int i) {
		stackx.add(j);
		stacky.add(i);
		visit[i][j]=1;
	}



}