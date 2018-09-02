(ns exercise6)

(defn average
  [n x]
  (/ (+ n x) 2)
  )

(defn faverage
  "Returns the average of a sequence of numbers"
  [n]
  (/ (reduce + n) (count n))
  )
