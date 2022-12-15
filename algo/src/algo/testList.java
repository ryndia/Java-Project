package algo;

import java.util.Scanner;
import java.math.*;

public class testList {
	
	public static Linked_list cumulativeSum(Linked_list in)
	{
		Linked_list out = new Linked_list(in.node.data);
		Linked_list temp = new Linked_list(in);
		int sum = 0;
		for(int i = 1; i < in.length; i++)
		{
			for(int j = 0; j<=i; j++)
			{
					sum+=temp.node.data;
					temp.node = temp.node.next;
			}
			out.addLast(sum);
			temp = new Linked_list(in);
			sum = 0;
		}
		return out;
	}
	
	public static void deal(Linked_list l, Linked_list first, Linked_list second)
	{
		Linked_list ll = new Linked_list(l);
		while(true)
		{
			first.addLast(ll.node.data);
			if(ll.node.next != null && ll.node.next.next!=null) {
				ll.node = ll.node.next.next;
			}
			else
			{
				break;
			}
		}
		
		ll = new Linked_list(l);
		ll.node = ll.node.next;
		while(true)
		{
			second.addLast(ll.node.data);
			if(ll.node.next != null && ll.node.next.next!=null)
			{
				ll.node = ll.node.next.next;
			}
			else {
				break;
			}
		}
	}
	
	public static Linked_list createList()
	{
		Linked_list temp = new Linked_list();
		int input = 0;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a number to input in list(negative to terminate): ");
		input = in.nextInt();
		if(input == 0)
		{
			return temp;
		}
		while(input > -1)
		{
			temp.addLast(input);
			System.out.print("Enter a number to input in list(negative to terminate): ");
			input = in.nextInt();
		}
		return temp;
	}
	
	public static int listToInt(Linked_list ll)
	{
		int sum = 0;
		int i = 1;
		if(ll == null)
		{
			return 0;
		}
		int temp = (int) Math.pow(10, ll.length-1);
		while(ll.node != null)
		{
			sum+=((ll.node.data) * ((temp)/i));
			System.out.println(ll.length);
			ll.node = ll.node.next;
			i*=10;
		}
		return sum;
	}
	
	public static Linked_list intToList(int data)
	{
		if(data == 0)
		{
			return null;
		}
		String dataString = Integer.toString(data);
		Linked_list ll = new Linked_list();
		for(int i = 0; i< dataString.length(); i++)
		{
			String temp = "" + dataString.charAt(i);
			ll.addLast(Integer.parseInt(temp));
		}
		return ll;
	}
	
	public static void main(String[] args)
	{
		Linked_list head = new Linked_list(1);
		System.out.println(head.toString());
		head.addLast(2);
		head.addLast(3);
		head.addLast(4);
		head.addLast(5);
		head.addLast(6);
		head.addLast(7);
		System.out.println(head.toString());
		Linked_list cSum = cumulativeSum(head);
		System.out.println(cSum.toString());
		Linked_list first = new Linked_list();
		Linked_list second = new Linked_list();
		deal(head,first,second);
		System.out.println(first.toString());
		System.out.println(second.toString());
		Linked_list creatList = createList();
		System.out.println(creatList.toString());
		System.out.println(listToInt(head));
		Linked_list toList = new Linked_list();
		toList = intToList(6525874);
		System.out.println(toList.toString());
		return;
	}
}
