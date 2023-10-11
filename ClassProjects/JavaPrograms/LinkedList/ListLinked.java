public class ListLinked
{
  LinkedNode head = new LinkedNode(-1, null);
  public ListLinked()
  {

  }

  public void printList()
  {
    LinkedNode looking = head;
    do
    {
      looking = looking.getNext();
      System.out.println(looking.getValue());
    }while(looking.getNext() != null);
  }

  public void addNode(int index, double value)
  {
    LinkedNode looking = head;
    for(int i = 0; i<index; i++)
    {
      if(looking.getNext() != null)
        looking = looking.getNext();
      else
        System.exit(0);
    }
    looking.setNext(new LinkedNode(value, looking.getNext()));
  }

  public void addNode(double value)
  {
    LinkedNode looking = head;
      while(looking.getNext() != null)
        looking = looking.getNext();
    looking.setNext(new LinkedNode(value, looking.getNext()));
  }

  public void addNode(LinkedNode nd)
  {
    LinkedNode looking = head;
      while(looking.getNext() != null)
        looking = looking.getNext();
    looking.setNext(nd);
  }

  public void removeNode(int index)
  {
    LinkedNode looking = head;
    for(int i = 0; i<index; i++)
    {
      if(looking.getNext() != null)
        looking = looking.getNext();
      else
        System.exit(0);
    }
    looking.setNext((looking.getNext()).getNext());
  }

  public void removeNode()
  {
    LinkedNode looking = head;
    while((looking.getNext()).getNext() != null)
      looking = looking.getNext();
    looking.setNext((looking.getNext()).getNext());
  }

  public double getValue(int index)
  {
    LinkedNode looking = head.getNext();
    for(int i = 0; i<index; i++)
    {
      if(looking.getNext() != null)
        looking = looking.getNext();
      else
        System.exit(0);
    }
    return looking.getValue();
  }


  public void setValue(int index, double val)
  {
    LinkedNode looking = head.getNext();
    for(int i = 0; i<index; i++)
    {
      if(looking.getNext() != null)
        looking = looking.getNext();
      else
        System.exit(0);
    }
    looking.setValue(val);
  }


}
