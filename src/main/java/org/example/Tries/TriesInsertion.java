package org.example.Tries;

public class TriesInsertion {
    public static void main(String[] args) {

        Node root=new Node();

       String[] words={"ganesh","gopi","basha","prakash"};
       String[] queries={"ganesh","gp"};
       int n=words.length;
       for(int i=0;i<n;i++){
           String w=words[i];
           insert(root,w);
       }
       for(int i=0;i<queries.length;i++){
           String q=queries[i];
           search(root,q);
       }
    }
    static  void search(Node root,String w){
        Node t=root;
        int l=w.length();
        for(int i=0;i<l;i++){
            char ch=w.charAt(i);
            if(t.hm.containsKey(ch)){
                t=t.hm.get(ch);
            }
            else{
                System.out.println("not found");
            }
        }
    }

     static void insert(Node root, String w) {
           Node t=root;
           int l=w.length();
           for(int i=0;i<l;i++){
               char ch=w.charAt(i);
               if(t.hm.containsKey(ch)){
                   t=t.hm.get(ch);
               }

               else {

                   Node nn=new Node();
                   t.hm.put(ch,nn);
                   t=nn;


               }


           }
           t.isEnd=true;


    }

}

