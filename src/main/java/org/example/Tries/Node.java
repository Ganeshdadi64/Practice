package org.example.Tries;

import java.util.HashMap;

public class Node{
    boolean isEnd;
    HashMap<Character,Node> hm;

    Node(){
        isEnd=false;
        hm=new HashMap<>();
    }
    
}
