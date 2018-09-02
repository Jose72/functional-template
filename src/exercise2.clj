(ns exercise2)

(defn only-greater-than-five
  "Returns a list with the elements greater than five from the list taken."
  [nList]
  (filter (fn [n] (> n 5)) nList))
