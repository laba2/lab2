class D {
  int x7;
  int x38;
  int x9;
  int x8;
  int x33;
  long x30;
  long x6;
  long x1;
  int[] x18 = {-3, -3, 0, 3, -2};
  int[] x3 = {-1, -2, -1, -3, -2};
  int[] x32 = {2, 3, -3, -2};
  static int x35;
  static int x31;
  static int x17;
  static int x20;
  static int x28;
  public D() {
    x7 = 5;
    x38 = 7;
    x9 = 1;
    x8 = 3;
    x33 = 5;
    x30 = 8L;
    x6 = 4L;
    x1 = 8L;
  }
  public void x36() {
    System.out.println("метод x36 в классе D");
    System.out.println(x38 >> 2);
  }
  public void x27() {
    System.out.println("метод x27 в классе D");
    System.out.println(x33 - 3);
  }
  public void x10() {
    System.out.println("метод x10 в классе D");
    System.out.println(x33 >> 2);
  }
  public void x19() {
    System.out.println("метод x19 в классе D");
    System.out.println(x32[2] + x32[1]);
  }
  public void x34() {
    System.out.println("метод x34 в классе D");
    System.out.println((int)x6);
  }
  public void x37() {
    System.out.println("метод x37 в классе D");
    System.out.println(x8 + 5);
  }
  public static void x15() {
    System.out.println("метод x15 в классе D");
    System.out.println(x20);
  }
  public static void x12() {
    System.out.println("метод x12 в классе D");
    System.out.println((x20 - 3));
  }
  public static void x24() {
    System.out.println("метод x24 в классе D");
    System.out.println(x28);
  }
  public static void x22() {
    System.out.println("метод x22 в классе D");
    System.out.println((x28 + 3));
  }
  public void x16(D r) {
    r.x36();
  }
  public void x16(B r) {
    r.x27();
  }
}
