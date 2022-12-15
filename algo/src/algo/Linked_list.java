package algo;

class Linked_list {
	Node node;
	int length;
	
	public Linked_list(Linked_list ll)
	{
		this.node = ll.node;
		this.length = ll.length;
	}
	
	public Linked_list(int d)
	{
		node = new Node(d);
		length = 1;
	}
	
	public Linked_list()
	{
		node = null;
		length = 0;
	}
	
	public void addLast(int d)
	{
		if(this.node == null)
		{
			this.node = new Node(d);
			return;
		}
		Node temp = this.node;
		Node tempAdd = new Node(d);
		while(temp.next != null)
		{
			temp = temp.next;
		}
		temp.next = tempAdd;
		this.length++;
	}
	
	public void push(int d)
	{
		Node temp = new Node(d);
		temp.next = this.node;
		this.node = temp;
		this.length++;
	}
	
	public void copyLinkedList(Linked_list ll)
	{
		while(ll.node != null)
		{
			this.addLast(ll.node.data);
			ll.node = ll.node.next;
		}
	}
	
	
	
	@Override
	public String toString()
	{
		Node temp = this.node;
		String output = "";
		while(temp != null)
		{
			output = output + Integer.toString(temp.data) + " ";
			temp = temp.next;
		}
		return output;
	}
}
