public class LinkedNode
{
  private double value;
  private LinkedNode next;
  public LinkedNode(double val, LinkedNode additional)
  {
    value = val;
    next = additional;
  }

  public LinkedNode(double val)
  {
    value = val;
    next = null;
  }

  public void setNext(LinkedNode additional)
  {
    next = additional;
  }

  public void setValue(double val)
  {
    value = val;
  }

  public double getValue()
  {
    return value;
  }

  public LinkedNode getNext()
  {
    return next;
  }


}
