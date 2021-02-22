package nodeHandler;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.HashMap;
import java.util.Map;
import nodes.Node100;

/**
 *
 * @author Veljko
 */
public class NodeHandler {

    public Map<String, Integer> handle(int amount) {
        HashMap<String, Integer> map = new HashMap<>();
        map = new Node100().handleRequest(amount, map);
        return map;
    }
}
