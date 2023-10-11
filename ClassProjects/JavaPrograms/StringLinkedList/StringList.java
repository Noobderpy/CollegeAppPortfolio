public class StringList
{
  StringNode head = new StringNode(null, null);
  public StringList()
  {

  }

  public StringList(StringNode sn)
  {
    head.setNext(sn);
  }

  public void printList()
  {
    StringNode looking = head;
    do
    {
      looking = looking.getNext();
      System.out.println(looking.getValue());
    }while(looking.getNext() != null);
    System.out.println(" ");
  }

  public void addNode(int index, String value)
  {
    StringNode looking = head;
    for(int i = 0; i<index; i++)
    {
      if(looking.getNext() != null)
        looking = looking.getNext();
      else
        //System.exit(0);
        looking.setNext(new StringNode(value, looking.getNext()));
    }
    looking.setNext(new StringNode(value, looking.getNext()));
  }

  public void addNode(String value)
  {
    StringNode looking = head;
      while(looking.getNext() != null)
        looking = looking.getNext();
    looking.setNext(new StringNode(value, looking.getNext()));
  }

  public void addNode(StringNode nd)
  {
    StringNode looking = head;
      while(looking.getNext() != null)
        looking = looking.getNext();
    looking.setNext(nd);
  }

  public void removeNode(int index)
  {
    StringNode looking = head;
    for(int i = 0; i<index; i++)
    {
      if(looking.getNext() != null)
        looking = looking.getNext();
      else
        System.exit(0);
    }
    looking.setNext((looking.getNext()).getNext());
  }

  public boolean removeNode(String str)
  {
    StringNode looking = head;
    while(looking.getNext() != null)
    {
      if((looking.getNext()).getValue() == str)
      {
        looking.setNext((looking.getNext()).getNext());
        return true;
      }
      looking = looking.getNext();
    }
    return false;
  }

  public void removeNode()
  {
    StringNode looking = head;
    while((looking.getNext()).getNext() != null)
      looking = looking.getNext();
    looking.setNext((looking.getNext()).getNext());
  }

  public String getValue(int index)
  {
    StringNode looking = head.getNext();
    for(int i = 0; i<index; i++)
    {
      if(looking.getNext() != null)
        looking = looking.getNext();
      else
        System.exit(0);
    }
    return looking.getValue();
  }


  public void setValue(int index, String val)
  {
    StringNode looking = head.getNext();
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
