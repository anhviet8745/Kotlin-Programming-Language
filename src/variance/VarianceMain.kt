package variance

import variance.Factory.*
import variance.Factory.`object`.Burger
import variance.Factory.`object`.FastFood
import variance.Factory.`object`.Food
import variance.Factory.consumer.American
import variance.Factory.consumer.Everybody
import variance.Factory.consumer.ModernPeople
import variance.Factory.store.BurgerStore
import variance.Factory.store.FastFoodStore
import variance.Factory.store.FoodStore

fun main(args: Array<String>) {
    /*
    * For 'out' generic, we could assign a class of subtype to class of super-type
    * */
    val production1 : ProductionFood<Food> = FoodStore()
    val production2 : ProductionFood<Food> = FastFoodStore()
    val production3 : ProductionFood<Food> = BurgerStore()
    println(production1.produce())
    println(production2.produce())
    println(production3.produce())

    /*
    * For ‘in' generic, we could assign a class of super-type to class of subtype
    * */
    val consumer1 : ConsumerFood<Food> = Everybody()
    val consumer2 : ConsumerFood<FastFood> = ModernPeople()
    val consumer3 : ConsumerFood<Burger> = American()
    println(consumer1.consume(Food()))
    println(consumer2.consume(FastFood()))
    println(consumer3.consume(Burger()))

}