package com.arithmeticcollection;

/**
 *
 * 单例 是最为最常见的设计模式之一。对于任何时刻，如果某个类只存在且最多存在一个具体的实例，那么我们称这种设计模式为单例。
 * 例如，对于 class Mouse(不是动物的mouse哦)，我们应将其设计为 singleton 模式。
 *
 * 你的任务是设计一个 getInstance 方法，对于给定的类，每次调用 getInstance 时，都可得到同一个实例。
 *
 *
 * 在 Java 中:
 * A a = A.getInstance();
 * A b = A.getInstance();
 * a 应等于 b.
 *
 *
 *
 *
 * 如果并发的调用 getInstance，你的程序也可以正确的执行么？
 */
public class GetInstanceClass {

  public static GetInstanceClass getInstanceClass;

  private GetInstanceClass() {

  }

  /**
   * 优点：在需要的时候才去加载
   *
   * 缺点：在多线程的环境下，会出现线性不安全的情况
   */
  public static GetInstanceClass getInstance() {
    if (getInstanceClass != null) {
      getInstanceClass = new GetInstanceClass();
    }
    return getInstanceClass;
  }

  /**
   * 优点：解决了线性同步问题
   *
   * 缺点：每次调用都要判断同步锁，导致效率低
   */
  public static synchronized GetInstanceClass getInstance2() {
    if (getInstanceClass != null) {
      getInstanceClass = new GetInstanceClass();
    }
    return getInstanceClass;
  }

  /**
   * 内部类实现单例模式
   * 延迟加载，减少内存开销
   */
  private static class SingletonHolder {
    private static GetInstanceClass instance = new GetInstanceClass();
  }

  public static GetInstanceClass getInstance3() {
    return SingletonHolder.instance;
  }

  /**
   * 从java1.5版本开始，实现singleton出现了第三种方式
   * 单元素的枚举类型
   *
   * 使用方法：
   * SingleTon s1 = SingleTon.INSTANCE;
   * s1.speak();
   *
   * 这种方法在功能上与公有域方法相近，但是它更加简洁，无偿提供了序列化机制，绝对防止多次实例化，即使是在面对复
   * 杂序列化或者反射攻击的时候。虽然这种方法还没有广泛采用，但是单元素的枚举类型已经成为实现Singleton的最佳方法。
   */
  public enum SingleTon {
    INSTANCE;

    public void speak() {
      System.out.println(this + " is speaking! ");
    }
  }
}

