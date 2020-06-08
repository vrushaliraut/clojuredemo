(ns clojuredemo.clojure-functions)

(def messenger (fn [msg] (println msg) ))

(defn messenger  [msg] (println msg) )

(messenger "hello world")

;let bind symbols to immutable values
(defn messenger  [msg] (println msg)
  (let [a 7
        b 5
        c 2]
    (println a b c)
    (let [a 7
          b 5]
      ;(apply a b)
      )
    ))

(defn messenger2 [greeting & who]
  (println greeting who)
  )
;let numbers and apply functions
(let [numbers `(1 2 3)]
  (println  (apply + numbers))
  )
; chain access
;JAVA person.getAddress().getZipCode()
;Clojure (.getZipCode (.getAddress person))

