public class TestA {
	public static void main(String[] args) throws Exception {
		char[] chars = new char[] { '\u007f' };
		String str = new String(chars);
		System.out.println("within 0000 - 007f : " + str);
		// for the character whose unicode less than u0080, it is no different
		// with encode by
		// iso-8859-1 or utf-8. they are compatiable.
		System.out.println("   utf-8 - utf-8      "
				+ new String(str.getBytes("utf-8"), "iso-8859-1"));
		System.out.println("   iso-8859-1 - utf-8 "
				+ new String(str.getBytes("iso-8859-1"), "utf-8"));
		chars = new char[] { '\u00f2' };
		str = new String(chars);
		// the above principle can not apply to the character lager than 007f
		System.out.println("out of 0000 - 007f : " + str);
		System.out.println("   utf-8 - utf-8      "
				+ new String(str.getBytes("utf-8"), "iso-8859-1"));
		System.out.println("   iso-8859-1 - utf-8 "
				+ new String(str.getBytes("iso-8859-1"), "utf-8"));
	}
}