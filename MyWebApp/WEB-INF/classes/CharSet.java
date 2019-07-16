
public class CharSet {
	public static void main(String[] args) throws Exception{
		String zhongwen = "жпнд";
		byte [] b = zhongwen.getBytes("gb2312");
		System.out.println("--------gb2312----------");
		for (int i = 0; i < b.length; i++) {
			System.out.println(Integer.toHexString(b[i]));
		}
		
		
		System.out.println("-------iso8859-1--------");
		
		zhongwen = new String(b,"iso8859-1");
		b = zhongwen.getBytes("iso8859-1");
		
		for (int i = 0; i < b.length; i++) {
			System.out.println(Integer.toHexString(b[i]));
		}
		
		System.out.println("-----utf8----------");
		
		zhongwen = new String(b,"utf8");
		b = zhongwen.getBytes("utf8");
		
		for (int i = 0; i < b.length; i++) {
			System.out.println(Integer.toHexString(b[i]));
		}
		

/*		System.out.println("-----iso8859-1----------");
		b = zhongwen.getBytes("utf8");
		zhongwen = new String(b,"iso8859-1");
		b = zhongwen.getBytes("iso8859-1");
		
		for (int i = 0; i < b.length; i++) {
			System.out.println(Integer.toHexString(b[i]));
		}*/
		
		System.out.println("-----GBK----------");
		String ns = new String( b);
		b = ns.getBytes( "GBK");
		//zhongwen = new String(b,"GB2312");
		//System.out.println(zhongwen);
		//b = zhongwen.getBytes("iso8859-1");
		
		for (int i = 0; i < b.length; i++) {
			System.out.println(Integer.toHexString(b[i]));
		}
	}
}
