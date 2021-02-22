/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nodes;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Veljko
 */
public class Node10 extends Node{

    public Node10() {
        this.nextNode = new Node1();
    }
    
    
     @Override
    public HashMap<String, Integer> handleRequest(int insertedAmount,  HashMap<String,Integer> nodeMap) {
        nodeMap.put("10", insertedAmount / 10);
        return nextNode.handleRequest(insertedAmount % 10,nodeMap);
    }
}
