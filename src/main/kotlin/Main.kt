

fun main() {
println()
    numbers()

    println(Names)
    numbers()

    var people1=Persons("shiko",43,32.5,65)
    var people2=Persons("Nick",20,45.6,80)
    var people3=Persons("Anyango",22,56.6,90)
    var people4=Persons("Faith",30,65.5,65)
    var people= listOf<Persons>(people1,people2,people3,people4)
    var pple=people.sortedByDescending {people->people.age }
    println(pple)




    var x = Vehicles("KYF020F",60)
    var y = Vehicles("KBM230G",50)
    var z = Vehicles("KCF343P",70)
    var p = Vehicles("KFD343V",75)
    var allVehicles= listOf(x,y,z,p)
    println(vehicleList(allVehicles))

}
//1. Given a list of 10 strings, write a function that returns a list of the strings
//at even indices i.e index 2,4,6 etc

fun  Names(Names:List<String>):List<String> {
    val names = mutableListOf("Joan","Agness","Richard","Diana","Naiboku","Emma","Wina","Ben","Ten","Jen")
Names.forEachIndexed { index, s ->
    if (index % 2 == 0) {
        println(s)
    }
}
return Names
}


//2. Given a list of people’s heights in metres. Write a function that returns
//the average height and the total height
fun numbers(){

    var num= mutableListOf(4.0,3.7,4.5,8.5,7.0)
    println(num.average())
    println(num.sum())



}

//3. Given a list of Person objects, each with the attributes, name, age,
//height and weight. Sort the list in order of descending age (2 points)

class Persons(var nam:String,var age:Int,var height:Double,var weight:Int)

//4. Given a list similar to the one above, write a function in which you will
//create 2 more people objects and add them to the list at one go.




//5. Write a function that takes in a list of Car objects each with a
//registration and mileage attribute and returns the average mileage of
//all the vehicles in the list.

data class Vehicles(var registration:String, var mileage:Int)
fun vehicleList(vehicle:List<Vehicles>):Int{
    var avg=0
    vehicle.forEach { new->new.mileage
        avg+=new.mileage
    }
    var totalAvg=vehicle.count()
    return totalAvg
}