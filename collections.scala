// object collections extends App {
    // val ls = List(1,2,3,4,5,6,8)

    // println(ls.head)  // returns the first element 
    // println(ls.tail)  // returns all the elements except first one 
    // println(ls.last)  // last element
    // println(ls.init)  //  except last element


    // println("the element present at index : 4 is :  " + ls(4))

    // using headoption 
    // var newls = List()
    // println(newls.headOption)  // our list is empty and thats why it will return None 

    // lets try to change a value from the list 

    // ls(2) = 120  you cannot update the value of a list bcoz in scala its of immutable type 

    // println(ls(2))




    // ---------- Applying some functions on list 
// --- MAP 
    // val doubled = ls.map(x => x * 2 )
    // val squares = ls.map(x => x * x )

    // println("Doubles :  " + doubled )
    // println("squares :  " + squares )

// --- Filter : Filter the elements based on a condition 


    //  first it filters the even numbers from the list and then find the squares of them 
    // val squaresofEven = ls.filter(x => x % 2 == 0 ).map(x => x * x ) 
    // println(squaresofEven)

// }