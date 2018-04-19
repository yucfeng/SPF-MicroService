package com.yucfeng.web;


import com.yucfeng.entity.EData;
import com.yucfeng.entity.ListUDG;
import com.yucfeng.entity.PathReq;
import com.yucfeng.spf.Spf;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value = "/topo")
public class TopoController {

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
            new EData("F", "G", 9),
    };

    ListUDG pG = new ListUDG(vexs, edges);

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ListUDG getTopoInLinkList() {
        return pG;
    }

    @RequestMapping(value = "/{node}", method = RequestMethod.GET)
    public List<Spf.ShortestPath> getAllShortestPath(@PathVariable String node) {
        int vs = Arrays.binarySearch(vexs, node);
        Spf spf = new Spf(pG.getmVexs(), vexs);
        return spf.dijkstra(vs);
    }

    @RequestMapping(value = "/path", method = RequestMethod.POST)
    public Spf.PathResp getOneShortestPath(@RequestBody PathReq path) {
        Spf spf = new Spf(pG.getmVexs(), vexs);
        int vs = Arrays.binarySearch(vexs, path.getSrc());
        int vd = Arrays.binarySearch(vexs, path.getDst());
        return spf.getShortestPath(vs, vd);
    }

}
