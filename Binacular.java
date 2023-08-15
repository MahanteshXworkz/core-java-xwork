class Binacular{


  static String typeOfLens;
   static String brandName;
   static double price;
   
//defalt constructor -defined user
  public Binacular(String typeOfLens , String brandName){
	 //constructorChaining
     /*this method */  
    this.typeOfLens =typeOfLens;
    this.brandName = brandName;
    
   System.out.println("Binacular Constructor is invoked");
   
	  
  }
    public Binacular(double price){
		this("convex" , "canon");
		this.price = price;
		
		
		
	}

}