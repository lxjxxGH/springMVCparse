package control;


//import com.fasterxml.jackson.core.JsonProcessingException;
//import com.fasterxml.jackson.databind.ObjectMapper;
import entity.RequestPram;
import entity.ResponsePram;
import entity.Student;

//import org.json.JSONArray;
//import org.json.JSONObject;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.*;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

public class testjsonControl {
    @RequestMapping(value="/test_json")
    @ResponseBody
    public Student test_json(@RequestBody String data){
//        ObjectMapper objMapper = new ObjectMapper();
//        ArrayList<Map<String,Object>> list = null;
//        try {
//            list = objMapper.readValue(data, ArrayList.class);
//        } catch (JsonProcessingException e) {
//            e.printStackTrace();
//        }
//        for(Map<String,Object> map : list) {
//            Set<Map.Entry<String, Object>> set = map.entrySet();
//            Iterator<Map.Entry<String, Object>> i = set.iterator();
//            while(i.hasNext()) {
//                Map.Entry<String, Object> entry = i.next();
//                System.out.println(entry.getKey()+"\t"+entry.getValue());
//            }
//        }
    return null;
    }
    
    
    /**
     * Erp系统请求路径 http://localhost/lifuyi/flow/detail.do
     * @return 返回Json数据{result:{resultCode:xxx,desc:xxx}}
     * 请求路径：http://localhost/lifuyi/flow/detail.do   
     * 请求参数：{"allFlows":[{"orderNum":"20180109170317448001","batchNum":"test","node":"001"}，{"orderNum":"20180109170317448005","batchNum":"测试","node":"001"}]   }
     */
    
    
    @RequestMapping(value="/detail",method= RequestMethod.POST, produces="application/json;charset=UTF-8")
    @ResponseBody
    public String erpRequest(@RequestBody String parms) {
        JSONObject jsonObject = JSONObject.parseObject(parms); //将str转化为相应的JSONObject对象
        System.out.println("-----------"+jsonObject);

        String str = jsonObject.getString("sid"); //取出allFlows对应的值,值为字符串
        //使用JSONArray.parseArray(String, Class<T>)将字符串转为指定对象集合
        List<RequestPram> listPram = (List<RequestPram>) JSONArray.parseArray(parms, RequestPram.class);
        for (RequestPram requestPram : listPram) {
            System.out.println(requestPram.toString());
        }
        //  {"allFlows":[{"orderNum":"20180109170317448001","batchNum":"test","node":"001"}] }
        Map<String,ResponsePram> map = new HashMap<String,ResponsePram>();
        ResponsePram rp = new ResponsePram("001", "测试中文");
        map.put("result", rp);
        String json = JSON.toJSONString(map);
        System.out.println(json);
        return json;
    }
    public static void main(String[] args) {
        testjsonControl testjsonControl = new testjsonControl();
        testjsonControl.erpRequest("{\"sid\":\"1\",\"name\":\"老白\",\"sex\":\"女\"}");
    }
}
