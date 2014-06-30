public class FinallyReturn {
	public static void main(String[] args) {
		System.out.println(f());
	}
	
	private static int f() {
		int i=1;
		try {
			return i;
		}finally {
			++i;
			System.out.println("zhongjian:"+i);
		}
	}
}
