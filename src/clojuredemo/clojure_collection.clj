(ns clojuredemo.clojure-collection)

()

(defn mix-collection-hash []
  ()                                                        ;empty collection
  ;(println (1 2 3)) ;Caused by: java.lang.ClassCastException: java.lang.Long cannot be cast to clojure.lang.IFn
  ;(list 1 2 3)
  ;(println (conj list (1 2) 3))
  )

(def profile {
              :name "vrushali",
              :address {:name  "E1004 purva fountain sqaure banagalore",
                        :zip 560037}

              })

;nested maps access
(defn get-profile []
  (println   "********* Nested Maps Example ****************")

  (println (get-in profile [:address :name]) )
  (println (get-in profile [:address :zip]) )
  (println (assoc-in profile [:address :zip] 560037) )
  (println (update-in profile [:address :zip] inc) )
  (println   "*************************")
  )

; sets
(defn set-example
  "sets example"
  []
  #{}                                                       ; empty set
  (println   "*********** SETS Example **************")
  (println   #{:a :b})
  (println (#{:a :b} :a))
  (println  (conj #{} :a))
  (println  (contains? #{:a} :a))
  )