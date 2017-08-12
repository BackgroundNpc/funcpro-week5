package com.funcpro.major1

object MajorWS {
  /**Question 1 **/
  

 def fib (y:Int):Int = {
 		val predicate1 = y-1;
 		val predicate2 = y-2;
 		
 		if(predicate1<=0){
 		return 0
 		}else if (predicate2==1){
		return 1
 		}else{
 		fib(y-1) + fib(y-2);
 }
 }                                                //> fib: (y: Int)Int
 println(fib(6));                                 //> 3

 
 /** Question 2**/
 
	def fizzString(fizzString:String):Unit = {
	if (fizzString.startsWith("f") && fizzString.endsWith("b")){
		println("FizzBuzz");
	}else if(fizzString.startsWith("f")){
	 println("Fizz");
	}else	if(fizzString.startsWith("b")) {
	  println("Buzz");
	}else{
  println("Error");
	}
}                                                 //> fizzString: (fizzString: String)Unit
fizzString("fizz");                               //> Fizz
fizzString("fizzb");                              //> FizzBuzz
fizzString("bubz");                               //> Buzz

/** Question 3**/

def factorial (n:Int):Int ={
	if(n==1){
	(n*n)
	}else
	{n*(n-1)}
};                                                //> factorial: (n: Int)Int
println(factorial(1))                             //> 1
println(factorial(2))                             //> 2
println(factorial(3))                             //> 6



/** Question 4**/

val a = 0;                                        //> a  : Int = 0

def sums(b: Int):Unit  = {
	if(b >100){
	val a = b%10;
	
	}else{

	}
}                                                 //> sums: (b: Int)Unit
sums(711);

}