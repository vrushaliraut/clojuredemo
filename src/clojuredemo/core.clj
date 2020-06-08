(ns clojuredemo.core
  (:require [clojuredemo.overview :as overview]
            [clojuredemo.clojure-functions :as clo-functions] )
  (:gen-class))
(defn- start-fn [])

(defn main-fn []
  (println "Started server")
  (start-fn)
  (overview/list_demo)
  (clo-functions/messenger "one argument")
  (clo-functions/messenger2 "hello" "two" "arguments"))

(defn -main
  [& _]
  (main-fn))