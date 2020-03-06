package Union;

public class Union {

	static int getParent(int parent[], int x)
	{
		if(parent[x]==x) return x;
		return parent[x] = getParent(parent , parent[x]);
	}//부모 노드를 찾는 함수
	
	static void unionParent(int parent[],int x, int y)
	{
		x = getParent(parent, x);
		y = getParent(parent, y);
		if(x < y) parent[y]= x;
		else parent[x] = y;
	}//두 부모 노드를 합치는 함수
	static int findParent(int parent[],int x, int y)
	{
		x = getParent(parent , x);
		y = getParent(parent , y);
		
		if(x == y) return 1;
		return 0;
	}
	// 같은 부모를 갖는지 확인
	
	public static void main(String[] args) {
		int parent[] = new int[11];
		
		for(int i=1 ; i<=10 ; i++)
		{
			parent[i] = i;
		}
		unionParent(parent, 1, 2);
		unionParent(parent, 2, 3);
		unionParent(parent, 3, 4);
		unionParent(parent, 5, 6);
		unionParent(parent, 6, 7);
		unionParent(parent, 7, 8);
		
		System.out.println("1과 5는 연결되어 있나요?");
		System.out.println(findParent(parent, 1, 5));
		
		unionParent(parent, 1, 5);
		
		System.out.println("1과 5는 연결되어 있나요?");
		System.out.println(findParent(parent, 1, 5));
		
	}

}