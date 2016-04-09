package StacksQueuesDeques;

public class stackMain 
{
	public static void main(String[] args)
	{
		StackSingleLinkedList<String> ssll = new StackSingleLinkedList<>();
		System.out.println(ssll.isEmpty());
		ssll.push("naren");
		ssll.push("karan");
		ssll.push("nikhil");
		System.out.println(ssll.top());
		System.out.println(ssll.size());
		ssll.pop();
		System.out.println(ssll.top());
		System.out.println(ssll.size());
		ssll.pop();
		System.out.println(ssll.top());
		System.out.println(ssll.size());
	}
}
