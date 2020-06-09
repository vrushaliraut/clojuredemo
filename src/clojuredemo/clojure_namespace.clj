(ns clojuredemo.clojure-namespace
  (:require [clojure.set :as set])                          ; require can be use like this
  (:use [clojure.string :only (join)]) ;use ;use-only
  (:use [clojure.java.io :only (delete-file)])
  )

;namespace operation
;1. Load :- find source on classpath
;2. Alias :- make shorter names for namespace-qualified symbol
;3. refer :- copy symbol bimding from another anmespace into current namespace
;4. import :-make java class names available in current namespace

(defn demo-namespace [])

(defn set-example []
  (println (set/union #{1 2 3} #{1 2 3 4}))
  (println (join "," ["a" "b"]))
  )

;ns --> create namespace and load what you need
; ns load java class on your behalf  ; ns is a DSL


;In this function we used n number of parameter
(defn do-union [& sets]
  (println (apply set/union sets)))

; ns-name :- namespace name
; ns-map :- map of all symbols
; ns-interns :- only def'd vars
; ns-publics :- only public vars
; ns-imports :- only imported classes
; ns-refers :- only vars from another namespace
; ns-aliases :- map of all aliases
; clojure.repl/dir :- print public vars