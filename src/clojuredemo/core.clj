(ns clojuredemo.core
  (:require [clojuredemo.overview :as overview])
  (:gen-class))

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))

(defn- start-fn [])

(defn main-fn []
  (println  "Started server")
  (start-fn)
  (overview/list_demo)
  (foo "vrushali") )

(defn -main
  [& _]
  (main-fn))