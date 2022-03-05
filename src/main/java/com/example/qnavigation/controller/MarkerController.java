package com.example.qnavigation.controller;

import com.example.qnavigation.bean.Marker;
import org.apache.ibatis.jdbc.Null;
import org.springframework.boot.web.servlet.server.Session;
import org.springframework.expression.spel.ast.NullLiteral;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.yaml.snakeyaml.error.Mark;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/marker")
public class MarkerController {

    //保存marker进服务器  加了@RequestBody可以对接对象
    @RequestMapping(value="/saveMarker" ,method= {RequestMethod.POST,RequestMethod.GET})
    private String saveMarker(HttpServletRequest request,@RequestBody Marker marker){
        Map<Integer, Marker> markerMap= (HashMap<Integer, Marker>) request.getServletContext().getAttribute("markerMap");
        if(markerMap==null){
            markerMap=new HashMap<>();
        }
        markerMap.put(marker.getMarkerId(),marker);//坐标保存

        request.getServletContext().setAttribute("markerMap",markerMap);
        System.out.println("success");
        return "success";
    }

    //获取markerMap
    @RequestMapping(value="getMarker" ,method= RequestMethod.POST)
    private Map<String,Object>  getMarker(HttpServletRequest request){
        Map<String,Object> modelMap = new HashMap<>();
        Map<Integer,Marker> markerMap= (Map<Integer, Marker>) request.getServletContext().getAttribute("markerMap");
        if(markerMap== null)
            return null;
        System.out.println("经度--"+markerMap.get(0).getLongitude());

        modelMap.put("success",markerMap);
        return modelMap;
    }
}
