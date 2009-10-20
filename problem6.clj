(ns problem6)

(defn sumOfSquares 
	"Finds the sum of squares"
	[n]
	(if (>= n 0)
		(+ (* n n) (sumOfSquares (- n 1)))
		0))

(defn sum 
	[n]
	(if ( > n 0)
		(+ n (sum (- n 1)))
		n))
				
(defn squareOfSums
	"Finds the square of sums"
	[n]
	(* (sum n) (sum n)))
	

(defn findDifference 
	"Finds the difference between the square of sums and sum of squares"
	[n]
	(- (squareOfSums n) (sumOfSquares n)))
		