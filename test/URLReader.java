import java.net.*;
import java.io.*;

class URLReader
{
	public static void main(String[] args) throws Exception
	{
		URL myURL = new URL("http://www.shufe.edu.cn/");
		BufferedReader in = new BufferedReader(new InputStreamReader(myURL.openStream()));
		String inputLine;
		while ((inputLine = in.readLine()) != null) 
			System.out.println(inputLine); //�Ѷ�������ݴ�ӡ����Ļ��
		in.close(); //�ر�������
	}
}
