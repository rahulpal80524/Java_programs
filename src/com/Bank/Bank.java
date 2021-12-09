package com.Bank;

class Account {
  public String name;
  protected String email;
  private String password;
  //getters & setters
  public String getPassword(){
    return this.password;
  }

  public String setPassword(String pass){
    this.password = pass;
    return pass;
  }

}

public class Bank {
  public static void main(String[] args) {
    Account account1 = new Account();
    account1.name = "rahul pal";
    account1.email = "rahul80524@gmail.com";
    account1.setPassword("passwords");
    System.out.println(account1.getPassword());
  }
}
