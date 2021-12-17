package com.company;

public class MyEmployee {
    public static void main(String[] args) {
    MyEmployee2 rahul = new MyEmployee2();
    rahul.setName("Rahul pal");
    rahul.setId(23);
        System.out.println(rahul.getname());
    }
}

class MyEmployee2{
  private   int id;
  private   String name;
  public void setName(String n){
      //this.name =n;
      name = n;
  }
  public String getname(){
      return name;
  }

    public void setId(int i){
        id=i;
    }
  public int getId(){
      return id;
  }


}