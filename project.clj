(defproject clojuredemo "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.0"]]
  :main ^:skip-aot clojuredemo.core
  :repl-options {:init-ns clojuredemo.core}
  :profiles {:uberjar  {:aot :all}
             :provided {
                        :dependencies [
                                       [lein-protobuf "0.5.0"]
                                       [org.flatland/protobuf "0.8.1"]
                                       [clj-http-fake "1.0.2"]]}})
