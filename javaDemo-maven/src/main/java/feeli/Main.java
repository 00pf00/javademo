package feeli;

import com.alibaba.fastjson.JSONObject;

public class Main {
    public static void main(String[] args){
       JSONObject jobj =  new JSONObject();
       jobj.put("A","a");
       jobj.put("B","b");
       System.out.println(jobj);

    }
}
