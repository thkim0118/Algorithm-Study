package thkim.week1017

import java.util.*
import kotlin.collections.ArrayDeque

/**
 * ArrayDeque 사용(solution1)과
 * LinkedList 사용(solution2)한 풀이의 비교
 *
 * ArrayDeque 보다 LinkedList 풀이가 대체로 빠르다.
 */
fun main() {
    val time = System.nanoTime()
    val answer = `다리를 지나는 트럭`().solution1(
        2,
        10,
        intArrayOf(7, 4, 5, 6)
    )

    println("Answer :: $answer, Time :: ${System.nanoTime() - time}")


    val time2 = System.nanoTime()
    val answer2 = `다리를 지나는 트럭`().solution1(
        100,
        100,
        intArrayOf(10)
    )

    println("Answer :: $answer2, Time :: ${System.nanoTime() - time2}")

    val time3 = System.nanoTime()
    val answer3 = `다리를 지나는 트럭`().solution1(
        100,
        100,
        intArrayOf(10, 10, 10, 10, 10, 10, 10, 10, 10, 10)
    )

    println("Answer :: $answer3, Time :: ${System.nanoTime() - time3}")

    val time4 = System.nanoTime()
    val answer4 = `다리를 지나는 트럭`().solution2(
        2,
        10,
        intArrayOf(7, 4, 5, 6)
    )

    println("Answer :: $answer4, Time :: ${System.nanoTime() - time4}")


    val time5 = System.nanoTime()
    val answer5 = `다리를 지나는 트럭`().solution2(
        100,
        100,
        intArrayOf(10)
    )

    println("Answer :: $answer5, Time :: ${System.nanoTime() - time5}")

    val time6 = System.nanoTime()
    val answer6 = `다리를 지나는 트럭`().solution2(
        100,
        100,
        intArrayOf(10, 10, 10, 10, 10, 10, 10, 10, 10, 10)
    )

    println("Answer :: $answer6, Time :: ${System.nanoTime() - time6}")
}

class `다리를 지나는 트럭` {
    // ArrayDeque 을 사용한 풀이
    fun solution1(bridge_length: Int, weight: Int, truck_weights: IntArray): Int {
        var totalWeight = 0
        var totalTime = 0
        val bridgeTruckPosition = ArrayDeque<Int>()
        val bridgeTruck = ArrayDeque<Int>()

        for (i in 0 until bridge_length) bridgeTruckPosition.addFirst(0)

        for (i in truck_weights) bridgeTruck.addFirst(i)

        while (bridgeTruckPosition.isNotEmpty()) {
            val arrivedTruck = bridgeTruckPosition.removeLast()
            totalWeight -= arrivedTruck

            if (bridgeTruck.isEmpty()) {
                totalTime += bridge_length
                break
            }

            if (totalWeight + bridgeTruck.last() <= weight) {
                // 트럭이 다리를 지날 수 있는 경우
                val truckWeight = bridgeTruck.removeLast()
                totalWeight += truckWeight
                bridgeTruckPosition.addFirst(truckWeight)
            } else {
                // 트럭이 다리를 지나지 못하는 경우
                bridgeTruckPosition.addFirst(0)
            }

            totalTime += 1
        }

        return totalTime
    }

    fun solution2(bridge_length: Int, weight: Int, truck_weights: IntArray): Int {
        var totalWeight = 0
        var totalTime = 0
        val bridgeTruckPosition: Queue<Int> = LinkedList()
        val bridgeTruck: Queue<Int> = LinkedList()

        for (i in 0 until bridge_length) bridgeTruckPosition.offer(0)

        for (i in truck_weights) bridgeTruck.offer(i)

        while (bridgeTruckPosition.isNotEmpty()) {
            val arrivedTruck = bridgeTruckPosition.poll()
            totalWeight -= arrivedTruck

            if (bridgeTruck.isEmpty()) {
                totalTime += bridge_length
                break
            }

            if (totalWeight + bridgeTruck.peek() <= weight) {
                // 트럭이 다리를 지날 수 있는 경우
                val truckWeight = bridgeTruck.poll()
                totalWeight += truckWeight
                bridgeTruckPosition.offer(truckWeight)
            } else {
                // 트럭이 다리를 지나지 못하는 경우
                bridgeTruckPosition.offer(0)
            }

            totalTime += 1
        }

        return totalTime
    }

    // LinkedList 를 사용한 풀이
    fun solution3(bridge_length: Int, weight: Int, truck_weights: IntArray): Int {
        val bridgeQue: Queue<Int> = LinkedList()
        val readyTruckQue: Queue<Int> = LinkedList()

        //초기 다리 상태 세팅
        for (i in 0 until bridge_length) {
            bridgeQue.offer(0)
        }


        //대기 트럭 세팅
        for (i in truck_weights) {
            readyTruckQue.offer(i)
        }
        var time = 0
        var totalWeight = 0
        while (!bridgeQue.isEmpty()) {
            //while 한번 도는게 1초라고 생각
            //시작하자마자 다리 맨 마지막부분에서 트럭을 빼버림
            totalWeight -= bridgeQue.peek()
            bridgeQue.poll()

            //대기 트럭열에 있던 마지막 트럭이 다리에 올라가면, 다리 길이 만큼의 시간 후에
            //마지막 트럭이 다리를 건너기때문에 다리 길이(*1초) 만큼 시간이 소요되면 모든 트럭이 건너게됨
            if (readyTruckQue.isEmpty()) {
                time += bridge_length
                break
            } else {

                //다리의 하중량을 버틸 수 있으면 트럭 투입
                if (totalWeight + readyTruckQue.peek() <= weight) {
                    bridgeQue.offer(readyTruckQue.peek())
                    totalWeight += readyTruckQue.peek()
                    readyTruckQue.poll()
                } else {
                    bridgeQue.offer(0)
                }
            }
            time++
        }
        return time
    }
}