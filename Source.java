// 1.	Constant Time Algorithms – O(1)
public class Bigonotation {
    public static void main(String[] args) {
    myMethod();
  }
    
static void myMethod() {
    int n = 1000;
    System.out.println("Hey - your input is : " + n);

}
}


// 2.	Linear Time Algorithms – O(n)

public class Bigonotation {
    public static void main(String[] args) {
    myMethod();
  }
    
static void myMethod() {
    int n = 5;
    for (int i = 0; i < n; i++){
    System.out.println("hey im busy looking at: " + 1);
    }
}

}


// 3.	N Log N Time Algorithms – O(n log n)

public class Bigonotation {
    public static void main(String[] args) {
    myMethod();
  }
    
static void myMethod() {
    int n = 3;
    for (int i = 1; i <= n; i++){
    for (int j = 1; j < n; j = j * 2){
        System.out.println("Hey = im busy looking at:" + 1 + " and " + j);
    }
    }
  }


}


// 4.	Exponential Time Algorithms – O(kn)

public class Bigonotation {
    public static void main(String[] args) {
    myMethod();
  }
    
static void myMethod() {
    int n = 2;
    for (int i = 1; i <= math.pov(2, n); i++){
    System.out.println("Hey - i'am busy looking at " + 1);
}
  }


}

// 5.	Factorial Time Algorithms – O(n!)

ublic class Bigonotation {
    public static void main(String[] args) {
    myMethod();
  }
    
static void myMethod() {
    int n = 2;
    for (int i = 1; i <= factorial(n); i++){
        System.out.println("Hey - im busy looking at:" + i);
}
  }

static int factorial ( int n ) {
switch(n){
case 0: return 1;
case 1: return 1;
case 2: return 2;
case 3: return 6;
case 4: return 24;
case 5: return 120;
case 6: return 720;
case 7: return 5040;
case 8: return 40320;
case 9: return 362880;
case 10: return 3628800;
case 11: return 39916800;
case 12: return 479001600;
default : throw new IllegalArgumentException();
}
      
}
}
