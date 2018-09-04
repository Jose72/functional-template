(ns exercise4)

(defn fibonacci
  "Returns the nth element of the Fibonnacci sequence"
  [n]
  (if (some #{n} '(0 1)) n (+ (fibonacci (- n 1)) (fibonacci (- n 2))))
  )
