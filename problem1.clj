(ns problem1)

(defn findAll
	"Add all the natural numbers below one thousand that are multiples of 3 or 5."
  [e n] 
	(if (< n 1000)
		(if (or (== (rem n 3) 0) (== (rem n 5) 0))
			 (findAll (+ e n) (+ n 1))
			 (findAll e (+ n 1)))
	(str "Value is " e)))
	