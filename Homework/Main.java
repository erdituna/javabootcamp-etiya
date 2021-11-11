package Homework;

public class Main {

	public static void main(String[] args) {

		MyList list = new MyList();
		list.add("Ankara");
		list.add("İstanbul");
		list.add("İzmir");
		list.remove("İzmir");	
		boolean result = list.contains("İstanbul");
		System.out.println(result);
		list.list();

	}

}
