package com.corejava.oopsconcept.object;

class Tree{
    String treeName;
    int id;

    public  Tree(String treeName , int id){

        this.treeName=treeName;
        this.id=id;
    }

    public  void  displayTreeinfo(){
        System.out.println("the tree name : " +treeName +" and  the tree Id : " + id );

    }
}
public class InitializationThroughConstructor {

    public static void main(String[]args){
        Tree t1=new Tree("Mango tree",1);
        Tree t2=new Tree("Apple tree",2);

        t1.displayTreeinfo();
        t2.displayTreeinfo();

    }

}
