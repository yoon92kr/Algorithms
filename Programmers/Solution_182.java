import java.util.HashMap;
import java.util.Map;
// 문제 : [1차] 캐시
// 결과 : 성공
// Score : 100
public class Solution_182 {

	public int solution(int size, String[] param) {
		return size == 0 ? param.length * 5 : LRU(size, param);
	}

	private int LRU(int size, String[] param) {
		LRUCache cache = new LRUCache(size);
		int time = 0;
		for (int i = 0; i < param.length; i++) {
			if (cache.containCache(param[i].toUpperCase())) {
				time += 1;
			} else {
				time += 5;
			}
			cache.put(param[i].toUpperCase());
		}

		return time;
	}

}

class LRUCache {

	private class ListNode {
		
		private String key;
		private ListNode prev;
		private ListNode next;

		public ListNode(String key) {
			this.key = key;
			this.prev = null;
			this.next = null;
		}
	}

	private Map<String, ListNode> nodeMap;
	private int capacity;
	private ListNode head;
	private ListNode tail;

	public LRUCache(int capacity) {
		
		this.nodeMap = new HashMap<>();
		this.capacity = capacity;
		head = new ListNode("");
		tail = new ListNode("");
		head.next = tail;
		tail.prev = head;
	}

	private void remove(ListNode node) {
		node.prev.next = node.next;
		node.next.prev = node.prev;
		nodeMap.remove(node.key);
	}

	private void insertToHead(ListNode node) {
		this.head.next.prev = node;
		node.next = this.head.next;
		node.prev = this.head;
		this.head.next = node;
		nodeMap.put(node.key, node);
	}

	public boolean containCache(String key) {
		if (!nodeMap.containsKey(key)) {
			return false;
		}
		ListNode node = nodeMap.get(key);
		remove(node);
		insertToHead(node);
		return true;
	}

	public void put(String key) {
		ListNode newNode = new ListNode(key);
		if (nodeMap.containsKey(key)) {
			ListNode oldNode = nodeMap.get(key);
			remove(oldNode);
		} else {
			if (nodeMap.size() >= capacity) {
				ListNode tailNode = tail.prev;
				remove(tailNode);
			}
		}
		insertToHead(newNode);
	}
}
