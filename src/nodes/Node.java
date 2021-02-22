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
public abstract class Node {

    protected Node nextNode;
    
    public abstract HashMap<String,Integer> handleRequest(int insertedAmount,  HashMap<String,Integer> nodeMap);

}
