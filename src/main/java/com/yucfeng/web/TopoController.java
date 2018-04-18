package com.yucfeng.web;


import com.yucfeng.entity.EData;
import com.yucfeng.entity.ListUDG;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value = "/topo")
public class TopoController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public EData[] getTopoInLinkList() {
//        char[] vexs = {"A", "B", "C", "D", "E", "F", "G"};
        EData[] edges = {
                // 起点 终点 权
                new EData("A", "B", 12),
                new EData("A", "F", 16),
                new EData("A", "G", 14),
                new EData("B", "C", 10),
                new EData("B", "F",  7),
                new EData("C", "D",  3),
                new EData("C", "E",  5),
                new EData("C", "F",  6),
                new EData("D", "E",  4),
                new EData("E", "F",  2),
                new EData("E", "G",  8),
                new EData("F", "G",  9),
        };

//        ListUDG pG = new ListUDG(vexs, edges);
        return edges;
    }
}
