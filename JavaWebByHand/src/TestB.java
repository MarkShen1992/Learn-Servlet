
public class TestB {
	static String zhongwen = "����";
	static byte[] bytes = null;
	
	public static void main(String[] args) throws Exception {
		// GBK
		//main1();
		// utf-8
		//main2();
		// GBK-->utf-8-->GBK
		//main3();
		// GBK-->iso8859-1-->utf-8-->iso8859-1-->GBK
		main4();

	}
	// GBK
	public static void main1() throws Exception {
		bytes = zhongwen.getBytes("GBK");
		for (int i = 0; i < bytes.length; i++) {
			System.out.println(Integer.toHexString(bytes[i]));
		}
		System.out.println(new String(bytes, "GBK"));
	}
	// utf-8
	public static void main2() throws Exception {
		bytes = zhongwen.getBytes("utf-8");
		for (int i = 0; i < bytes.length; i++) {
			System.out.println(Integer.toHexString(bytes[i]));
		}
		System.out.println(new String(bytes, "utf-8"));
	}
	// GBK-->utf-8-->GBK
	public static void main3() throws Exception {
		
		bytes = zhongwen.getBytes("GBK");
		System.out.println("--------GBK----------");
		for (int i = 0; i < bytes.length; i++) {
			System.out.println(Integer.toHexString(bytes[i]));
		}

		bytes = zhongwen.getBytes("utf-8");
		byte [] bytes_copy = bytes;
		System.out.println("-------utf-8--------");
		for (int i = 0; i < bytes.length; i++) {
			System.out.println(Integer.toHexString(bytes[i]));
		}
		
		//�������װ����
		System.out.println("-------error GBK--------");
		zhongwen = new String(bytes, "GBK");
		System.out.println(zhongwen);
		bytes = zhongwen.getBytes("GBK");
		for (int i = 0; i < bytes.length; i++) {
			System.out.println(Integer.toHexString(bytes[i]));
		}
		//��ȷ����װ����
		System.out.println("-------GBK--------");
		System.out.println(new String(bytes_copy, "utf-8"));
	}
	// GBK-->iso8859-1-->utf-8-->iso8859-1-->GBK
	public static void main4() throws Exception {
		
		//�ʼ��GBK
		bytes = zhongwen.getBytes("GBK");
		System.out.println("--------GBK----------");
		for (int i = 0; i < bytes.length; i++) {
			System.out.println(Integer.toHexString(bytes[i]));
		}
		
		//����װ����iso8859-1,new�����ַ�������������,�����ֽ�����û��
		System.out.println("-------iso8859-1--------");
		zhongwen = new String(zhongwen.getBytes("GBK"), "iso8859-1");
		System.out.println(zhongwen);
		bytes = zhongwen.getBytes("iso8859-1");
		for (int i = 0; i < bytes.length; i++) {
			System.out.println(Integer.toHexString(bytes[i]));
		}
		//ת����utf-8�������ϴ���,һ��byteת��Ϊ�����ֽ�,����һ��8���ֽ�
		bytes = zhongwen.getBytes("utf-8");
		System.out.println("-------utf-8--------");
		for (int i = 0; i < bytes.length; i++) {
			System.out.println(Integer.toHexString(bytes[i]));
		}
		
		//server�˽��յ�utf-8,������װ��iso8859-1,new�����ַ�������������,��ʾ4���ʺ�
		System.out.println("-------server--iso8859-1------");
		zhongwen = new String(bytes, "utf-8");
		System.out.println(zhongwen);
		bytes = zhongwen.getBytes("iso8859-1");
		for (int i = 0; i < bytes.length; i++) {
			System.out.println(Integer.toHexString(bytes[i]));
		}
		
		//��iso8859-1�õ��ֽ�,����װ��GBK
		System.out.println("-------GBK--------");
		System.out.println(new String(bytes, "GBK"));
	}



	public static void ____________________main() throws Exception {
		System.out.println(System.getProperty("file.encoding"));
		System.out.println(System.getProperty("user.language"));
		System.out.println(System.getProperty("user.region"));
	}

}
