class B extends D {
  public B() {
    x38 = 4;
    x9 = 8;
    x30 = 0L;
  }
  public void x27() {
    System.out.println("метод x27 в классе B");
    System.out.println(x33);
  }
  public void x19() {
    System.out.println("метод x19 в классе B");
    System.out.println(++x9);
  }
  public static void x15() {
    System.out.println("метод x15 в классе B");
    System.out.println(x35);
  }
  public static void x12() {
    System.out.println("метод x12 в классе B");
    System.out.println((x35 - 1));
  }
  public static void x24() {
    System.out.println("метод x24 в классе B");
    System.out.println(x35++);
  }
  public static void x22() {
    System.out.println("метод x22 в классе B");
    System.out.println(x31);
  }
  public void x16(D r) {
    r.x10();
  }
  public void x16(B r) {
    r.x19();
  }
}
