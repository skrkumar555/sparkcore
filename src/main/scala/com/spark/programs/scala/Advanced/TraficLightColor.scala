package com.spark.programs.scala.Advanced



//Enumerations//

object TrafficLightColor extends Enumeration {
 val Red,Green,Yellow =Value
}

class TrafficLight(private var _color: TrafficLightColor.Value){
  def color=_color

  import TrafficLightColor._
  def cycle:Unit = _color= _color match {
    case Red =>Green
    case Green =>Yellow
    case Yellow =>Red
  }

}
