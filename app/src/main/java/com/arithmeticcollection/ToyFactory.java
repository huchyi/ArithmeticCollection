package com.arithmeticcollection;

/**
 * 玩具工厂
 *
 *工厂模式是一种常见的设计模式。请实现一个玩具工厂 ToyFactory 用来产生不同的玩具类。可以假设只有猫和狗两种玩具。
 *
 *
 *样例
 ToyFactory tf = ToyFactory();
 Toy toy = tf.getToy('Dog');
 toy.talk();
 >> Wow

 toy = tf.getToy('Cat');
 toy.talk();
 >> Meow
 *
 *
 *
 */

/**
 * Your object will be instantiated and called as such:
 * ToyFactory tf = new ToyFactory();
 * Toy toy = tf.getToy(type);
 * toy.talk();
 */
interface Toy {
  void talk();
}

class Dog implements Toy {
  @Override public void talk() {
    System.out.print("Wow");
  }
  // Write your code here
}

class Cat implements Toy {
  @Override public void talk() {
    System.out.print("Meow");
  }
  // Write your code here
}

public class ToyFactory {
  /**
   * @param type a string
   * @return Get object of the type
   */
  public Toy getToy(String type) {
    // Write your code here
    if(type.equals("Dog")){
      return new Dog();
    }else if(type.equals("Cat")){
      return new Dog();
    }
    return null;
  }
}
