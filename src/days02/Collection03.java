package days02;

import java.util.ArrayList;

class Point{
	private int x;
	private int y;
}

public class Collection03 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(10);
		list.add("String");
		Point p = new Point();
		list.add(p);
		
		int i = (Integer) list.get(0);
		String s= (String)list.get(1);
		Point p1 = (Point)list.get(2); //얕은 복사 : list의 p가 바뀌면 p1도 바뀜
		
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		ArrayList<String> list2 = new ArrayList<String>();
		ArrayList<Point> list3 = new ArrayList<Point>();
		
		list1.add(20);
		list2.add("Text");
		list3.add(p);
		
		i = list1.get(0);
		s= list2.get(1);
		p1 = list3.get(2); 
		
		
		
		
		
	}
}
