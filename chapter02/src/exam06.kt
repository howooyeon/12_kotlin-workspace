open class Car{
    var color : String = ""
    var speed : Int = 0

    companion object{
        var carCount : Int = 0
        const val MAXSPEED : Int = 200
        const val MINSPEED : Int = 0
        fun currentCarCount() : Int {
            return carCount
        }
    }

    constructor(color: String, speed: Int){
        this.color = color
        this.speed = speed
    }
    constructor(){}

    open fun upSpeed(value: Int){
        if(speed + value >= 200){
            speed = 200
        }else{
            speed += value
        }
    }

    fun downSpeed(value: Int){
        if(speed - value < 0){
            speed = 0
        }else{
            speed -= value
        }
    }
}

class Automobile : Car {
    var seatNum : Int = 0
    constructor() {}

    fun countSeatNum() : Int {
        return seatNum
    }

    override fun upSpeed(value: Int) {
        if(speed + value >= 300)
            speed = 300
        else
            speed = speed + value
    }
}

fun main() {
    var auto : Automobile = Automobile()
    auto.upSpeed(250)
    println("승용차의 속도는 " + auto.speed +"km입니다.")

//    var myCar1 : Car = Car("빨강", 0)
////    myCar1.color = "빨강"
////    myCar1.speed = 0
//
//    var myCar2 : Car = Car("파랑", 0)
////    myCar2.color = "파랑"
////    myCar2.speed = 0
//
//    var myCar3 : Car = Car("초록", 0)
////    myCar3.color = "초록"
////    myCar3.speed = 0
//
//    myCar1.upSpeed(50)
//    println("자동차1의 색상은 " + myCar1.color + "이고 속도는 " + myCar1.speed + "km/h입니다")
//
//    myCar2.upSpeed(20)
//    println("자동차2의 색상은 " + myCar2.color + "이고 속도는 " + myCar2.speed + "km/h입니다")
//
//    myCar3.upSpeed(250)
//    println("자동차3의 색상은 " + myCar3.color + "이고 속도는 " + myCar3.speed + "km/h입니다")

}



