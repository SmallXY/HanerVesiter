package net.go176.工具包;

 import java.io.BufferedInputStream;
 import java.io.FileOutputStream;  
 import java.io.IOException;  
 import java.net.HttpURLConnection;  
 import java.net.URL;  
  
public class DownloadImage {
   public void saveToFile(String destUrl, String 文件名) {
    FileOutputStream fos = null;
    BufferedInputStream bis = null;
    HttpURLConnection httpUrl = null;
    URL url = null;
    int BUFFER_SIZE = 1024;
    byte[] buf = new byte[BUFFER_SIZE];
    int size = 0;
    try {
      url = new URL(destUrl);
      httpUrl = (HttpURLConnection) url.openConnection();
      httpUrl.connect();
      bis = new BufferedInputStream(httpUrl.getInputStream());
      fos = new FileOutputStream("C:\\Windows\\YuanMeng\\" + 文件名);
      while ((size = bis.read(buf)) != -1) {fos.write(buf, 0, size);
    }
    fos.flush();
    } catch (IOException | ClassCastException e) {
    } finally {
      try {
        fos.close();
        bis.close();
        httpUrl.disconnect();
      } catch (IOException | NullPointerException e) {
        e.printStackTrace();
      }
    }
   }

   public static void 内容(String 链接, String 文件名) {
      // TODO Auto-generated method stub
      DownloadImage di = new DownloadImage();
      di.saveToFile(链接,文件名);
   }
}