

(defn find-divisible [r]
	(first 
		(drop-while 
			(fn [n] 
				(not 
					(every? 
						#(zero? (rem n %)) r))) 
							(iterate inc 1))))
	