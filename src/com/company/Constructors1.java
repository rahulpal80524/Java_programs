package com.company;

public class Constructors1 {
    public static void main(String[] args) {
        My my = new My("RAHUL PAL",56);
      //  My my = new My();
       // my.setName("rahul pal");
      //  my.setId(24);
        System.out.println(my.getId());
        System.out.println(my.getName());

    }

}

class My{
    private int id;
    private String name;
    public My(){
        id = 45;
        name = "Your name here";
    }

    public My(String myName,int myid){
        id = myid;
        name = myName;
    }

    public String getName() {return  name;}
    public void setName(String n){this.name = n; }

    public void setId(int i){this.id=i;}
    public int getId(){return id;}
}
