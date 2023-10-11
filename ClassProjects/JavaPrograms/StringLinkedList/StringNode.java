public class StringNode
{
  private String value;
  private StringNode next;
  public StringNode(String val, StringNode additional)
  {
    value = val;
    next = additional;
  }

  public StringNode(String val)
  {
    value = val;
    next = null;
  }

  public void setNext(StringNode additional)
  {
    next = additional;
  }

  public void setValue(String val)
  {
    value = val;
  }

  public String getValue()
  {
    return value;
  }

  public StringNode getNext()
  {
    return next;
  }


}
