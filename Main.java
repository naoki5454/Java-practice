// public class Main {
//     public static void main(String[] args) {
//         System.out.println("Hello world");
//         System.out.println("Hello world");
//     }
// }

// public class Main {
//   public static void main(String[] args) {
//     // 変数namesに、配列を代入してください
//     String[] names = {"にんじゃわんこ","ひつじ仙人","ベイビーわんこ"};
    
//     // インデックス番号が0の要素を出力してください
//     System.out.println(names[0]);
    
//     // インデックス番号が2の要素を出力してください
//     System.out.println(names[2]);
    
//   }
// }

// class Main {
//   public static void main(String[] args) {
//     String[] names = {"にんじゃわんこ", "ひつじ仙人", "ベイビーわんこ"};
    
//     // for文を用いて、「私の名前は◯◯です」と出力してください
//     for(int i = 0; i < names.length; i++) {
//       System.out.println("私の名前は" + names[i] + "です");
//     }
//   }
// }
// class Main {
//   public static void main(String[] args) {
//     String[] names = {"にんじゃわんこ", "ひつじ仙人", "ベイビーわんこ"};
    
//     // 配列用のfor文を用いて、「私の名前は◯◯です」と出力してください
//     for(String name:names){
//       System.out.println("私の名前は" + name + "です");
//     }
    
//   }
// }

// class Main {
//   public static void main(String[] args) {
//     // 変数numbersに、与えられた数字の配列を代入してください
//     int[] numbers = {1, 4, 6, 9, 13, 16};
    
//     int oddSum = 0;
//     int evenSum = 0;
    
//     // for文を用いて、配列numbersの偶数の和と奇数の和を求めてください
//     for (int i = 0; i < numbers.length; i++){
//       if (numbers[i] % 2 == 0){
//         evenSum += numbers[i];
//       }else {
//         oddSum += numbers[i];
//       }
//     }

//     System.out.println("奇数の和は" + oddSum + "です");
//     System.out.println("偶数の和は" + evenSum + "です");
//   }
// }
// class Main {
//   public static void main(String[] args) {
//     hello();
//   }
  
//   public static void hello() {
//     // "Hello World"を、"Hello Java"に書き換えてください
//     System.out.println("Hello Java");
//   }
// }
// class Main {
//   public static void main(String[] args) {
//     // printDataメソッドを呼び出してください
//     printData();
    
//   }
  
//   // printDataメソッドを定義してください
//   public static void printData(){
//     System.out.println("私の名前はKate Jonesです");
//   }
  
// }
// class Main {
//   public static void main(String[] args) {
//     // 引数に「Kate Jones」を渡してください
//     printData("Kate Jones");
    
//     // 引数に「John Christopher Smith」を渡してください
//     printData("John Christopher Smith");
    
//   }

//   // 引数を受け取るようにしてください
//   public static void printData(String name) {
//     // 「私の名前は◯◯です」と出力されるように書き換えてください
//     System.out.println("私の名前は" + name + "です");
    
//   }
// }
// class Main {
//   public static void main(String[] args) {
//     // それぞれ年齢に関する引数を追加してください
//     printData("Kate Jones", 27);
//     printData("John Christopher Smith", 65);
//   }

//   // 年齢に関する引数を受け取れるようにしてください
//   public static void printData(String name, int age) {
//     System.out.println("私の名前は" + name + "です");
//     // 「年齢は◯◯歳です」と出力してください
//     System.out.println("年齢は" + age +"歳です");
    
//   }
}
