package pratice_10;

import java.util.Arrays;

public class SimpleHeap {
	int last=-1, MaxHeapSize=4;
	int heap[] = new int [MaxHeapSize];//이진힙의 저장공간이다
	private void resize() {
		MaxHeapSize*=2;							//이진힙의 공간을 초과한 데이터가 들어올경우
		heap = Arrays.copyOf(heap, MaxHeapSize);//두배로
	}
	private void swap(int m, int n) {
		int temp = heap[m];
		heap[m]=heap[n];
		heap[n]=temp;
	}
	public void add(Integer data) {
		if(last+1==MaxHeapSize) resize();
		heap[++last]=data;//힙의 마지막부분에 새 자료 삽입	
		
		int child=last;
		while(child>0) {
			int parent=(child-1)/2; //힙에서의 순서
			if(heap[child]<=heap[parent])break; //부모노드가 자식노드보다 크면 중지
			swap(child,parent); //아닐경우 스왑
			child=parent; //비교했던노드를 다시 비교하기위해 대입
		}
	}
	public int remove() {
		if(last<0)throw new RuntimeException("heap empty");
		int data=heap[0];//루트노드의 자료 추출
		heap[0]=heap[last-1];
		
		for(int parent=0, child=2*parent+1; child<=last; parent=child, child=2*parent+1) {
			if(child<last && heap[child]<heap[child+1]) child++;
			if(heap[child]<=heap[parent]) break;
			swap(child,parent);
		}
		return data;
	}
	public String toString() {
		return Arrays.toString(heap);
	}
}
