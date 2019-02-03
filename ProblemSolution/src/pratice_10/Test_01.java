package pratice_10;

public class Test_01 {
	public static void main(String[] args) {
		int v[] = {4, 2, 5, 7, 5, 8, 10, 15};
		SimpleHeap heap = new SimpleHeap();
		for (int i = 0; i < v.length; i++) {
			heap.add(v[i]);
			System.out.println(heap);
		}
		for (int j = 0; j < v.length; j++) {
			System.out.println(heap.remove()+"=>"+heap);
		}
	}
}
