package com.eleven.booklibrary.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.Buffer;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;


public class BookUtil {
  public static String isbnUrl = "https://api.douban.com/v2/book/isbn/";     //https://api.douban.com/v2/book/isbn/:9787111165057
  public static String idUrl = "https://api.douban.com/v2/book/";

  
public static String getBookByISBN(String isbn) {
	  

    DefaultHttpClient client = new DefaultHttpClient();

    HttpGet request = new HttpGet(isbnUrl + isbn);
    try {
      
      HttpResponse response = client.execute(request);
      HttpEntity entity = response.getEntity();
      
      
      return new String(EntityUtils.toString(entity).getBytes(),"utf-8");
      
      
      
    } catch (ClientProtocolException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } finally {
      client.getConnectionManager().shutdown();
    }
    return null;
  }
  
  public static String getBookImage(String id) {
    HttpClient client = new DefaultHttpClient();
    HttpGet request = new HttpGet(idUrl + id + "?fields=images");
    try {
      HttpResponse response = client.execute(request);
      HttpEntity entity = response.getEntity();
      return new String(EntityUtils.toString(entity).getBytes(), "utf-8");
    } catch (ClientProtocolException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } finally {
      client.getConnectionManager().shutdown();
    }
    return null;
  }
  
  
  public static String getBookInfo(String id) {
      HttpClient client = new DefaultHttpClient();
      HttpGet request = new HttpGet(idUrl + id);
      try {
          HttpResponse response = client.execute(request);
          InputStream inputStream = response.getEntity().getContent();
          BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream, "utf-8"));  //请注意这里的编码
          StringBuilder strber = new StringBuilder();
          String line = null;
          while ((line = reader.readLine()) != null)
              strber.append(line);

//    HttpEntity entity = response.getEntity();
//    String content = new String(EntityUtils.toString(entity).getBytes(), "utf-8");
          return strber.toString();
      } catch (ClientProtocolException e) {
          // TODO Auto-generated catch block
          e.printStackTrace();
      } catch (IOException e) {
          // TODO Auto-generated catch block
          e.printStackTrace();
      } finally {
          client.getConnectionManager().shutdown();
      }
      return null;
  }

  
}
