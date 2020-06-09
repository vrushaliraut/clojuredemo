(ns clojuredemo.clojure-sequential-destructuring)

(def stuff [7 8 9 10 11 12])

(def associate-destructuring {:a 7 :b 2})

(defn sequential []
  (let [[ a b c]  stuff]
    (println "Addition of twi num from vactor:" (list (+ a b) (+ b c))))

  (let [[a b c d e f] stuff]
    (println "assignment of stuff to the variables" (list d e f))
    )

  ; can get everything else with &
  (let [[a & others] stuff]
    (println "one number : " a)
    (println "and remaining numbers by saying others:" others)
    )

  ; Idiomatic to use _ for values you don't care about

  ; associate destructuring
  (let [{:keys [a b c]
         :or {c 3}} associate-destructuring]
    (println "using :or keyword to assign default value :" a b c)
    )
  )



