package sync.coll013;

import java.util.concurrent.LinkedBlockingDeque;

public class UseDeque {

	public static void main(String[] args) {
		
		LinkedBlockingDeque<String> dq = new LinkedBlockingDeque<String>(10);
		dq.addFirst("a");
		dq.addFirst("b");
		dq.addFirst("c");
		dq.addFirst("d");
		dq.addFirst("e");
		dq.addLast("f");
		dq.addLast("g");
		dq.addLast("h");
		dq.addLast("i");
		dq.addLast("j");
		//dq.offerFirst("k");
		System.out.println("查看头元素：" + dq.peekFirst());
		System.out.println("获取尾元素：" + dq.pollLast());
		Object [] objs = dq.toArray();
		for (int i = 0; i < objs.length; i++) {
			System.out.println(objs[i]);
		}
		
	}
}
