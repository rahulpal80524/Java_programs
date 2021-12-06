package com.company;

public class String_Builder {

    public static void main(String[] args) {
       StringBuilder sb = new StringBuilder("rahul");
       System.out.println(sb);
/*
//      char at index 0
        System.out.println(sb.charAt(0));
//        replace char at index 0
        sb.setCharAt(0,'p');
        System.out.println(sb);
*/
      //right left mid any index positon insert
/*
        sb.insert(5,"2");
        System.out.println(sb);
  */
  //delete the  any char
        sb.delete(4,5);
        System.out.println(sb);

        sb.append("p");
        sb.append("a");
        sb.append("l");
        System.out.println(sb);


    }
}
