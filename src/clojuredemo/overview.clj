(ns clojuredemo.overview
  (:require [clojure.test :refer :all]))

(defn list_demo []
  (println 4 :alpha 3.0)                                    ;list
  (println [2 "hello" 99])                                    ;vector
  (println {:a 1, :b 2})                                    ;map --> in clojure ; commas are whitespce
  (println {:a 1 :b 2})                                    ;map
  ; (println #{vrushali abhi panu})                                    ;set
  )
