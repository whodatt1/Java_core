package address;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;

public class NetworkEx02 {

	public static void main(String[] args) throws IOException, URISyntaxException {
		// URL = Uniformed Resource Location (정형화된 자원 위치)
		URL url = new URL("https://news.naver.com/main/read.naver?mode=LSD&mid=shm&sid1=101&oid=092&aid=0002239683");
		
		System.out.println("getAuthority() : " + url.getAuthority());
		System.out.println("getContent() : " + url.getContent());
		System.out.println("getDefaultPort() : " + url.getDefaultPort());
		System.out.println("getPort() : " + url.getPort());
		System.out.println("getFile() : " + url.getFile());
		System.out.println("getHost() : " + url.getHost());
		System.out.println("----------------------------------");
		System.out.println("getPath() : " + url.getPath());
		System.out.println("getQuery() : " + url.getQuery());
		System.out.println("----------------------------------");
		System.out.println("getProtocol() : " + url.getProtocol());
		System.out.println("getRef() : " + url.getRef());
		System.out.println("getUserInfo() : " + url.getUserInfo());
		System.out.println("toExternalForm() : " + url.toExternalForm());
		System.out.println("toURI() : " + url.toURI());
	}

}
