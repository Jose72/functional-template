(ns exercise3b-test
  (:require [clojure.test :refer :all]
            [exercise3b :refer :all]))

(def mapa {:a nil :b 1 :c 2})

(deftest mapa-key-nula-one
  (testing "Test 1 mapa-key-nula."
    (is (= (mapa-key-nula mapa :a) true))))

(deftest mapa-key-nula-two
  (testing "Test 2 mapa-key-nula."
    (is (= (mapa-key-nula mapa :b) false))))

(deftest mapa-key-nula-three
  (testing "Test 3 mapa-key-nula."
    (is (= (mapa-key-nula mapa :c) false))))
