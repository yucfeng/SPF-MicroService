package com.yucfeng.web;

import com.yucfeng.model.EData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

public class PathController {

    String[] vexs = {"A", "B", "C", "D", "E", "F", "G"};
    EData[] edges = {
            new EData("A", "B", 12),
            new EData("A", "F", 16),
            new EData("A", "G", 14),
            new EData("B", "C", 10),
            new EData("B", "F", 7),
            new EData("C", "D", 3),
            new EData("C", "E", 5),
            new EData("C", "F", 6),
            new EData("D", "E", 4),
            new EData("E", "F", 2),
            new EData("E", "G", 8),
//            new EData("F", "G", 9),
    };

    @Autowired
    RedisTemplate<String, EData> redisTemplate;


    @Autowired
    public PathController(RedisTemplate<String, EData> redisTemplate){
        this.redisTemplate = redisTemplate;
        for (EData link : edges)
            redisTemplate.opsForValue().set(link.getStart() + link.getEnd(), link);
    }


    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<EData> getTopoInLinkList() {
        List<EData> links = new ArrayList<>();
        // TODO get data from SQL DB
        if (redisTemplate.hasKey("FG")) {
            links.add(redisTemplate.opsForValue().get("FG"));
        }
        return links;
//        ListUDG pG = new ListUDG(vexs, edges);
//        return pG;
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String putLink(@RequestBody EData link){

        redisTemplate.opsForValue().set(link.getStart() + link.getEnd(), link);
        return "Success";
    }
}
