class SuperMarket{

  static String vegetable[]  = {"tomato","brinjal","onion","carrot" , "cucumber" };

static String perfume []= {"fogg","axe","jasmin","WildStone","engage"};
static String iceCream[]={"vanilla", "pista", "badam", "strawberry", "chocolate"};
static String groceries[]={"egg","bread","butter","pizza","cheese"};
static String instruments[]={"guitar","tabla","drums","violin","flute"};
static String fruits []={"apple","banana","peru","orange","chikku","strawberry"};

   public static void main(String dmart[]){
   System.out.println(vegetable.length);
      System.out.println(vegetable[0] +" "+ vegetable[1] + " "+ vegetable[2] );
	  
	  // looping                    5 < 5
	  for(int vegIndex =0  ;  vegIndex < vegetable.length ; vegIndex++ ){
		  System.out.println(vegetable[vegIndex]);
	  }
   }

}