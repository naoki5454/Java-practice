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

class Main {
  public static void main(String[] args) {
    // 変数numbersに、与えられた数字の配列を代入してください
    int[] numbers = {1, 4, 6, 9, 13, 16};
    
    int oddSum = 0;
    int evenSum = 0;
    
    // for文を用いて、配列numbersの偶数の和と奇数の和を求めてください
    for (int i = 0; i < numbers.length; i++){
      if (numbers[i] % 2 == 0){
         evenSum += numbers[i];
      }else {
         oddSum += numbers[i];
      }
    }

    System.out.println("奇数の和は" + oddSum + "です");
    System.out.println("偶数の和は" + evenSum + "です");
  }
}