fun main(){
var flugzeug1:Airplane=Airplane(4,670.0)
    flugzeug1.takeOff()
    flugzeug1.land()
}

class Airplane{     //amountTurbine,flyingSpeed,isAirbone)
    var amountTurbine:Int
    var flyingSpeed:Double
    var isAirborne:Boolean= true

    constructor(amountTurbines:Int,flyingSpeed:Double){
        this.amountTurbine=amountTurbines
        this.flyingSpeed=flyingSpeed

    }
    fun takeOff(){
        if (isAirborne==false){
            isAirborne=true
        }


    }
    fun land(){
        if (isAirborne==true){
            isAirborne=false
        }

    }
}

