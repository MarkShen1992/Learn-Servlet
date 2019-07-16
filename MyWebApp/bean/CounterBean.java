//=================== CounterBean.java =================
package bean;
import java.io.Serializable;
public class CounterBean implements java.io.Serializable
{
  int count = 0;
  public CounterBean()  { }
  public int getCount() { count++; return count; }
  public void setCount(int c) { count=c; }
}
