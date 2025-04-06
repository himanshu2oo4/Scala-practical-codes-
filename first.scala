// object Hello  {

//     def funcName(arg1 : Int , arg2 : Int) : Int = {
//         return arg1+arg2 
//     }

//     def main(args : Array[String] ) : Unit = {
//         println("The sum : " + funcName(10,20))
//     }
// }

//  --------high order func ------------
// import  scala.math.pow   // to apply the pow of a number 
// object highOrder{

//     def applyFunc(x:Int , f: Int=> Double ): Double = {
//         return f(x)
//     }

//     def square(x : Int) = x * x 
//     def cube(x : Int ) = x * x * x 


//     def main(Args : Array[String ] ) : Unit = {
//         println(applyFunc(10 , square))
//         println(applyFunc(10 , cube))


//         //  calling a anonymous func here 

//         //  bcoz this func is returing a float value thats why i have to change the type of return value of f from int to double 
//         println(applyFunc(2 , (x)=> pow(x , 0.5)))  // will print the square root of the x 
//     }
// }



// --- some other examples 



// object highOrderfunc {
//     def applyFunc(x :Double , y : Double , f : (Double , Double ) => Double) = {
//         f(x , y )
//     }

//     def takeprev(x : Double , y : Double , f : ( Double ,  Double ) => Double) = {
//         (x+y) - f(x, y )
//     }
// }




// object highOrder{

//     println("Enter the value of first number : ")
//     val inp1 = scala.io.StdIn.readDouble()
//     println("Enter the value of second number : ")
//     val inp2 = scala.io.StdIn.readDouble()


//     def main(args : Array[String] ): Unit ={
//         println("Hello buddy lets learn high order and anonymous func")
//         println(highOrderfunc.applyFunc(10,20 , (x , y) => x+y ))
//         println(highOrderfunc.takeprev(100,200,(inp1 , inp2)=> inp1 * inp2))
//     }
// }




// object functions {
//     def takefunc(x : Int , y : Int , f:(Double , Double) => Double ): Double = {
//         val result =  x+y 
//         println("Enter the value of first number : ")
//         val a = scala.io.StdIn.readDouble()
//         println("Enter the value of second number : ")
//         val b = scala.io.StdIn.readDouble()


//         val funcresult = f(a ,  b)

//         result - funcresult
//     }

//     def highorderImplementation(x : Int , y : Int, f1:(Int , Int)=>Int  , f2 : ()=> Double ) : Double  = {
//         f1(x , y) - f2()
//     } 


// }

// import scala.math.pow
// object Application
// {
//     def main(args : Array[String] ) : Unit = {
//         // println(functions.takefunc(10,20, (x, y)=> x*y))

//         val result = functions.highorderImplementation(10 ,20 , (x , y)=> x * y , ()=> {
//             val a = scala.io.StdIn.readDouble()
//             println("Enter the power number ")
//             val b = scala.io.StdIn.readDouble()
//             pow(a , b )
//         })    
//         println(result)
//     }
// }



//  ----------- match case 

// object matchCase extends App {

//     // -------- Taking input in string format from readline func  
//     val value = scala.io.StdIn.readLine()

//     // cionverting to particular datatype
//     val parsed:Any = try {
//         value.toInt
//     }catch{
//         case _ : NumberFormatException => try {
//             value.toDouble 
//         } catch {
//             case _  : NumberFormatException => try {
//                 value.toBoolean
//             }catch{
//                 case _ : IllegalArgumentException => value 
//             }
//         }
//     }


//     // ---- checking for that parsed value 

//     val detectedType = parsed match {
//         case _ : Int => "Integer"
//         case _ : Double => "Double"
//         case _ : Boolean => "Boolean"
//         case _ : String => "String"
//         case _ => "unknown type"
//     }
    
//     println("The type of " + value + " is : " + detectedType)
// }


// object hello extends App {
    // def printer(name: String ) : Int = {
    //     println("Hello mr : " + name)
    // }

    // printer("subhash")



// }