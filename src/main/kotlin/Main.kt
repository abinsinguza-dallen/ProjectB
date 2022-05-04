fun main(){
pour_water(1)
    pour_water(9)
    pour_water(2)
    nationality("rwanda")
    nationality("kenya")
    nationality("congo")
    var tech= arrayOf("kotlin","python","html","css")
    for (techie in tech)
        println(techie)
}
fun pour_water(liters:Int){
    when(liters){
        1,3,5-> println("pour water to the bottle")
        4,0,6-> println("don't pour water ")
        8,7,9-> println("make a bottle full")
        else -> println("wow")
    }
}
fun nationality(nations:String){
    when(nations){
        "kenya","rwanda"-> println("you are famous")
        "uganda","tanzania"-> println("you are a good travelar")
        "sudan","burundi"-> println("no thanks")
        else-> println("have you ever been to Eastafrica")
    }
}
fun languages(){

}