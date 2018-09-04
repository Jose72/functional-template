(ns exercise7-test
  (:require [clojure.test :refer :all]
              [exercise7 :refer :all]))

(deftest enesimo-one
  (testing "Test 1 enesimo."
    (is (= (enesimo 2 '(4 5 6 7)) 6))))

(deftest enesimo-two
  (testing "Test 2 enesimo."
    (is (= (enesimo 0 [:a :b :c]) :a))))

(deftest enesimo-three
  (testing "Test 3 enesimo."
    (is (= (enesimo 1 [1 2 3 4]) 2))))

(deftest enesimo-four
  (testing "Test 4 enesimo."
    (is (= (enesimo 2 '([1 2] [3 4] [5 6])) [5 6]))))
