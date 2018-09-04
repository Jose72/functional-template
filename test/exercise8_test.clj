(ns exercise8-test
  (:require [clojure.test :refer :all]
              [exercise8 :refer :all]))

(deftest separador-one
  (testing "Test 1 separador."
    (is (= (separador 3 [1 2 3 4 5 6]) [(1 2 3) (4 5 6)]))))

(deftest separador-two
  (testing "Test 2 separador."
    (is (= (separador 1 [:a :b :c :d]) [(:a) (:b :c :d)]))))

(deftest separador-three
  (testing "Test 3 separador."
    (is (= (separador 2 [[1 2] [3 4] [5 6]]) [([1 2] [3 4]) ([5 6])]))))
