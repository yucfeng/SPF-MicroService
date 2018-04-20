package com.yucfeng.web;


import com.yucfeng.entity.Link;
import com.yucfeng.entity.ListUDG;
import com.yucfeng.request.PathReq;
import com.yucfeng.response.PathResp;
import com.yucfeng.spf.Spf;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value = "/topo")
public class TopoController {

    String[] vexs = {"A", "B", "C", "D", "E", "F", "G"};
    Link[] edges = {
            new Link("A", "B", 12),
            new Link("A", "F", 16),
            new Link("A", "G", 14),
            new Link("B", "C", 10),
            new Link("B", "F", 7),
            new Link("C", "D", 3),
            new Link("C", "E", 5),
            new Link("C", "F", 6),
            new Link("D", "E", 4),
            new Link("E", "F", 2),
            new Link("E", "G", 8),
            new Link("F", "G", 9),
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
    public PathResp getOneShortestPath(@RequestBody PathReq path) {
        Spf spf = new Spf(pG.getmVexs(), vexs);
        int vs = Arrays.binarySearch(vexs, path.getSrc());
        int vd = Arrays.binarySearch(vexs, path.getDst());
        return spf.getShortestPath(vs, vd);
    }

}
