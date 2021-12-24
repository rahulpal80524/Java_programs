package com.company;

public class ThisAndSuper {

    public static void main(String[] args) {
        Ekclass ekclass = new Ekclass(1);
        Doclass doclass = new Doclass(65);
        System.out.println(ekclass.getA());
    }
}


class Ekclass{
    int a;

    public int getA() {
        return a;
    }

    Ekclass(int a){
//        a=v;
//        this.a = v;  //this keyword is reference
        this.a=a;
    }
    public int returnone(){
        return 1;
    }
}

   class Doclass extends Ekclass{

       Doclass(int a) {
           super(a);
       }
   }