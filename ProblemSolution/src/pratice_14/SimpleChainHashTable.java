package pratice_14;

import java.util.LinkedList;

public class SimpleChainHashTable {
	// 해쉬테이블을 리사이즈하는 알고리즘을 짜보자 가만히 둬도 상관이 없지만 넓이가 너무 넓어져서 문제가됨
	private int count;//해쉬 원소를 세엊는 카운트를 생성
	private int HashTableSize;
	LinkedList<Object> hashTable[];

	public SimpleChainHashTable(int size) {
	HashTableSize=size;
	hashTable=new LinkedList[HashTableSize];
	for (int i = 0; i < hashTable.length; i++) hashTable[i]=new LinkedList<>();
	}

	public boolean put(Object key) {
		if (get(key) != null)
			return false;
		if(count == HashTableSize) resize(); //크기가 같을경우 사이즈를 재종정한다.
		hashTable[hash(key)].add(key);
		count++;
		return true;
	}
	
	public void resize() {
		HashTableSize*=2;
		LinkedList<Object>	newTable[] = new LinkedList[HashTableSize];
		for(int i=0; i<newTable.length; i++){
			newTable[i]=new LinkedList<>();//테이블마다의 리스트를 생성;
		}
		for (int i = 0; i < hashTable.length; i++) {
			for(Object key : hashTable[i])//기존 해쉬테이블의 연결리스트 원소를 다 끄집어 낸다.
				newTable[hash(key)].add(key); //새 해쉬테이블에서 원래 키값부분에 원래의 값을 넣는다.
		}
		hashTable=newTable;
	}

	private int hash(Object key) {
		return (key.hashCode() & 0x7FFFFFFF) % HashTableSize;
	}

	public Object get(Object key) {
		for (Object v : hashTable[hash(key)])
			if (v.equals(key))
				return v;
		return null;
	}
	public void print() {
		for (int i = 0; i < hashTable.length; i++) {
			System.out.println(i+"->"+hashTable[i]);
		}
	}
}
