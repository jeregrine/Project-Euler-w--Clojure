
(defn finder
	[n]
	(loop [result false x 20]
		(if (= x 10) 
			true 
			(if (= (rem x n) 0 ) 
				(recur false (dec x))
				false))))
				
		
(defn findDevisible 
	"What is the smallest number that is evenly divisible by all of the numbers from 1 to 20?"
	[n]
	(loop [result false x n]
		(do (println x))
		(if (finder x)
				(str "Value is..." x)
				(recur false (+ x 2520)))))
