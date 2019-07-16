package bean;

/** A simple bean that has a single String property
 *  called message.
 */

public class StringBean {
  private String message = "No message specified";
  private int num = 0;
  public int getNum()
  {
  	return num;
  }
  public void setNum(int _num)
  {
  	num = _num;
  }

  public String getMessage() {
    return(message);
  }

  public void setMessage(String msg) {
    this.message = msg;
  }
}