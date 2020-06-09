(ns clojuredemo.core
  (:require [clojuredemo.overview :as overview]
            [clojuredemo.clojure-functions :as clo-functions]
            [clojuredemo.clojure-namespace :as clo-namespace]
            [clojuredemo.clojure-collection :as clo-collection])
  (:gen-class))
(defn- start-fn [])

(defn main-fn []
  (println "Started server")
  (start-fn)
  (overview/list_demo)
  (clo-functions/messenger "one argument")
  (clo-functions/messenger2 "hello" "two" "arguments")
  (clo-namespace/demo-namespace)  ; namespace example
  (clo-namespace/set-example)
  (clo-namespace/do-union #{1 2} #{7 2})
  (clo-collection/set-example)
  (clo-collection/get-profile)
  )

(defn -main
  [& _]
  (main-fn))