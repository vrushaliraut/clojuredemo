(ns clojuredemo.overview
  (:require [clojure.test :refer :all]))

(defn list_demo []
  (println 4 :alpha "list-example")                                    ;list
  (println [2 "hello" "vector"])                                    ;vector
  (println {:a 1, :b "map"})                                    ;map --> in clojure ; commas are whitespce
  {:a 1 :b 2}                             ;map
  (println #{"set-example"  "abhi" "panu"})  ;set -> strings should be given in ""
  )
