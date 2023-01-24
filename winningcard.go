package main

import (
	"fmt"
)

func solution(cards [][]int) int {
	// Write your code here
	c := []int{}
	dict := make(map[int]bool)
	for _, j := range cards {
		//fmt.Println(j)
		for _, item := range j {
			if _, found := dict[item]; found {
				delete(dict, item)
				//fmt.Println(found)
			} else {
				dict[item] = true
				c = append(c, item)
			}
		}
	}
	//fmt.Println(dict)
	if len(dict) == 0 {
		return -1
	}
	highest := 0
	for k := range dict {
		if k > highest {
			highest = k
		}
	}
	return highest
}

/**
R E A D M E
DO NOT CHANGE the code below, we use it to grade your submission. If changed your submission will be failed automatically.
Comment any prints if available in your solution
**/

func main() {
	cards1 := [][]int{{5, 7, 3, 9, 4, 9, 8, 3, 1}, {1, 2, 2, 4, 4, 1}, {1, 2, 3}}
	fmt.Println(solution(cards1))
	cards2 := [][]int{{5, 5}, {2, 2}}
	fmt.Println(solution(cards2))
}

