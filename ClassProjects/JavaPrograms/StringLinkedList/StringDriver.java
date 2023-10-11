
class StringDriver{
	public static void main(String args[]){
    final int LISTSIZE = 4;
    final int MAXNUM = 10000;
    StringList list = new StringList();
    list.addNode("Looke");
    list.addNode("Eve");
    list.addNode("Wing-bird-mule-he/him");
    list.addNode("Noleen");
    list.addNode(3, "Mr. C");
    list.printList();
    list.removeNode("Mr. C");
    list.printList();
    list.removeNode(2);
    list.printList();

  }


}
