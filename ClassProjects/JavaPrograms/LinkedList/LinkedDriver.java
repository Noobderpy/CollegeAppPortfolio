
class LinkedDriver{
	public static void main(String args[]){
    final int LISTSIZE = 100;
    final int MAXNUM = 1000;
    ListLinked list = new ListLinked();
    randomizeList(list, MAXNUM, LISTSIZE);
    list.printList();
		System.out.println(" ");
		System.out.println(" ");
		list.addNode(7, 8);
		list.printList();
		System.out.println(" ");
		System.out.println(" ");
		list.removeNode(12);
		list.printList();

  }

  public static void randomizeList(ListLinked l, int maxNum, int length)
  {
    for(int i =0; i < length; i++)
    {
      l.addNode(Math.random() * maxNum);
    }
  }
}
