package address;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

public class NetworkEx03 {

	public static void main(String[] args) throws IOException {
		// url 정보만 생성
		URL url = new URL("https://news.naver.com/main/read.naver?mode=LSD&mid=shm&sid1=101&oid=092&aid=0002239683");
		
		URLConnection conn = url.openConnection(); // 접속해서 정보 요청 상황
		
		System.out.println("getContent() : " + conn.getContent());
		System.out.println("getConnectTimeout() : " + conn.getConnectTimeout());
		System.out.println("getContentEncoding() : " + conn.getContentEncoding());
		System.out.println("getContentLength() : " + conn.getContentLength());
		System.out.println("getContentType() : " + conn.getContentType());
		System.out.println("getDate() : " + conn.getDate());
		System.out.println("getHeaderFields() : " + conn.getHeaderFields());
		System.out.println("getExpiration() : " + conn.getExpiration());
		System.out.println("getLastModified() : " + conn.getLastModified());
	}

}
