(ns problem2)

(defn findFib
	"Find the sum of all the even-valued terms in the sequence which do not exceed four million."
	[n p]
	(if (> (+ n p) 10000000)
		0
		(if (== (rem (+ n p) 2) 0)
			(+ (+ n p) (findFib p (+ n p)))
			(findFib p (+ n p)))))