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
public class Node50 extends Node {

    public Node50() {
        this.nextNode = new Node10();
    }
    
    

    @Override
    public HashMap<String, Integer> handleRequest(int insertedAmount,  HashMap<String,Integer> nodeMap) {
        nodeMap.put("50", insertedAmount / 50);
        return nextNode.handleRequest(insertedAmount % 50,nodeMap);
    }
}
