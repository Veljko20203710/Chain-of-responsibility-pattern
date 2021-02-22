/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nodes;

import java.util.HashMap;

/**
 *
 * @author Veljko
 */
public class Node1 extends Node{

    @Override
    public HashMap<String, Integer> handleRequest(int insertedAmount, HashMap<String,Integer> nodeMap) {
       nodeMap.put("1",insertedAmount);
       return nodeMap;
    }
    
}
