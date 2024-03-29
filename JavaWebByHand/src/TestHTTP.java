import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;


public class TestHTTP {
	public static void main(String[] args) throws Exception {
		Socket s = new Socket("www.bjsxt.com", 80);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
		bw.write("OPTIONS / HTTP/1.1");
		bw.newLine();
		bw.write("Host: www.bjsxt.com:80");
		bw.newLine();
		bw.write("Content-Type: text/html");
		bw.newLine();
		bw.newLine();
		bw.flush();
		BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
		String str = null;
		while((str = br.readLine()) != null) {
			System.out.println(str);
		}
		bw.close();
		br.close();
		s.close();
	}
}
