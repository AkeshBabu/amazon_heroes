// parent constructor being called implicitly  
class Seven {
  public static void main(String[] args) {
    // Unix obju = new Unix();
    Linux objl = new Linux();
  }
}

class Unix {
  Unix() {
    System.out.println("constructor for Unix");
  }

  void cmd() {
    System.out.println("great command line");
  }

  void secure(String x) {
    System.out.println(x + " makes it secure");
  }

  void secure(String x, String y) {
    System.out.println("secure thorugh " + x + " and " + y);
  }
}

class Linux extends Unix {
  Linux() {
    System.out.println("constructor for Linux");
  }

  void free() {
    System.out.println("opensource makes it free");
  }
}


